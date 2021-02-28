package activitytracker;

import org.flywaydb.core.Flyway;
//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ActivityDaoTest {

    ActivityDao activityDao;

    @BeforeEach
    public void init() {
        // @Test
        //public void selectAllTest() {
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed!", sqlException);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        activityDao = new ActivityDao(dataSource);

        //assertEquals(3,activityDao.selectAllActivities().size());
    }

    @Test
    public void findByIdTest() {
        Activity activity = new Activity(LocalDateTime.of(2021, 02, 23, 10, 11), "Biking in Templén", ActivityType.BIKING);
        Activity result = activityDao.insertActivity(activity);
    }

    @Test
    public void selectAllTest() {
        assertEquals(3, activityDao.selectAllActivities().size());
    }

    @Test
    public void SelectBeforeDateTest() {
        System.out.println(activityDao.selectActivitiesBeforeDate(LocalDate.of(2020, 02, 05)));
    }

    @Test
    public void userActivityWithTrackPoints() {
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed!", sqlException);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        activityDao = new ActivityDao(dataSource);

        Activity activity = new Activity(LocalDateTime.of(2021, 02, 23, 10, 11), "Biking in Templén", ActivityType.BIKING);
        activity.addTrackPoints(List.of(new TrackPoint(LocalDate.of(2021, 02, 23), 67, 23),
                new TrackPoint(LocalDate.of(2021, 02, 23), 68, 22),
                new TrackPoint(LocalDate.of(2021, 02, 23), 68, 21)));
        activityDao.insertActivity(activity);

        Activity act = activityDao.insertActivity(activity);

        System.out.println(activityDao.selectActivityById(act.getId()));
    }
}