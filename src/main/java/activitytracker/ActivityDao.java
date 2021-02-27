package activitytracker;

import org.jetbrains.annotations.NotNull;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {

    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Activity insertActivity(Activity activity) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into activities(start_time,activity_desc,activity_type) values (?, ?, ?)", Statement.RETURN_GENERATED_KEYS)) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();

            return getIdAfterExecuted(activity, stmt);

        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed!", sqlException);
        }
    }

    private Activity getIdAfterExecuted(Activity activity, PreparedStatement stmt) throws SQLException {
        try (ResultSet rs = stmt.getGeneratedKeys()) {
            if (rs.next()) {
                long id = rs.getLong(1);
                return new Activity(id, activity.getStartTime(), activity.getDesc(), activity.getType());
            }
        }
        throw new IllegalArgumentException("Cannot get key");
    }

    private List<Activity> selectActivityByPreparedSatement(PreparedStatement stmt) {
        List<Activity> result = new ArrayList<>();
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Activity activity = new Activity(rs.getLong("id"),
                        rs.getTimestamp("start_time").toLocalDateTime(),
                        rs.getString("activity_desc"),
                        ActivityType.valueOf(rs.getString("activity_type")));
                result.add(activity);
            }
            return result;
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot execute", sqlException);
        }
    }

    public List<Activity> selectActivitiesBeforeDate(LocalDate date) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("select * from activites where start_time<?")) {
            LocalDateTime actualDate = date.atTime(0, 0);
            stmt.setTimestamp(1, Timestamp.valueOf(actualDate));
            return selectActivityByPreparedSatement(stmt);

        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot execute", sqlException);
        }

    }

    public Activity selectActivityById(long id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities where id =?")) {
            stmt.setLong(1, id);

            List<Activity> result = selectActivityByPreparedSatement(stmt);
            if (result.size() == 1) {
                return result.get(0);
            }
            throw new IllegalArgumentException("Wrong ID");

        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed!", sqlException);
        }

    }

    public List<Activity> selectAllActivities() {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities")) {

            return selectActivityByPreparedSatement(stmt);
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed!", sqlException);
        }
    }

    public List<Activity> selectActivityByActivityType(ActivityType type) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities where activity_type = ?")) {
            stmt.setString(1, type.toString());
            return selectActivityByPreparedSatement(stmt);
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed!", sqlException);
        }
    }
}
