package covid;

import activitytracker.Activity;
import activitytracker.ActivityType;
import activitytracker.TrackPoint;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CovidDao {

    private DataSource dataSource;

    public CovidDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertRegistration(Citizen citizen) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into citizens " +
                     "(citizen_name, zip, age, email, taj, number_of_vaccination, " +
                     "last_vaccination_date) values (?, ?, ?, ?, ?, ?, ?)")) {
            stmt.setString(1, citizen.getCitizen_name());
            stmt.setString(2, citizen.getZip());
            stmt.setLong(3, citizen.getAge());
            stmt.setString(4, citizen.getEmail());
            stmt.setString(5, citizen.getTaj());
            stmt.setLong(6, citizen.getNumber_of_vaccination());
            stmt.setTimestamp(7, null);
            stmt.executeUpdate();

        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed!", sqlException);
        }
    }

    public String selectCityByZip(String zip) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from cities where zip = ?")) {
            stmt.setString(1, zip);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    return rs.getString(3);
                }
            } catch (SQLException sqlException) {
                throw new IllegalStateException("Cannot execute", sqlException);
            }
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed!", sqlException);
        }
        return "";
    }

    public List<Citizen> selectCitizensByZip(String zip) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from citizens where zip = ?")) {
            stmt.setString(1, zip);
            return selectCitizensByPreparedSatement(stmt);
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed!", sqlException);
        }
    }

    public List<Citizen> selectAllCitizensByNumberOfVaccinations() {
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from citizens")
        ) {
            List<Citizen> result= new ArrayList<>();
            while (rs.next()) {
                LocalDateTime vaccdate;
                Timestamp ts = rs.getTimestamp("last_vaccination_date");
                if (ts == null) {
                    vaccdate = null;
                } else vaccdate = ts.toLocalDateTime();
                Citizen citizen = new Citizen(rs.getLong("citizen_id"),
                        rs.getString("citizen_name"),
                        rs.getString("zip"),
                        Integer.parseInt(rs.getString("age")),
                        rs.getString("email"),
                        rs.getString("taj"),
                        Integer.parseInt(rs.getString("number_of_vaccination")),
                        vaccdate);
                result.add(citizen);
            }
            return result;
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot select employees", se);
        }
    }

    private List<Citizen> selectCitizensByPreparedSatement(PreparedStatement stmt) {
        List<Citizen> result = new ArrayList<>();
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                LocalDateTime vaccdate;
                Timestamp ts = rs.getTimestamp("last_vaccination_date");
                if (ts == null) {
                    vaccdate = null;
                } else vaccdate = ts.toLocalDateTime();
                Citizen citizen = new Citizen(rs.getLong("citizen_id"),
                        rs.getString("citizen_name"),
                        rs.getString("zip"),
                        Integer.parseInt(rs.getString("age")),
                        rs.getString("email"),
                        rs.getString("taj"),
                        Integer.parseInt(rs.getString("number_of_vaccination")),
                        vaccdate);
                result.add(citizen);
            }
            return result;
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot execute", sqlException);
        }
    }


    public Citizen selectCitizensByTAJ(String TAJ) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from citizens where taj = ?")) {
            stmt.setString(1, TAJ);
            return selectCitizensByPreparedSatement(stmt).get(0);
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed!", sqlException);
        }
    }

    public void insertVaccination(Citizen citizen) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from citizens where taj= " +
                     " number_of_vaccination" +
                     "last_vaccination_date) values (?, ?, ?)")) {
            stmt.setString(1, citizen.getTaj());
            stmt.setLong(2, citizen.getNumber_of_vaccination());
            stmt.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            stmt.executeUpdate();

        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed!", sqlException);
        }
    }

    public void addVaccination(Long citizen_id, LocalDateTime vaccination_date, String vaccination_status, String vaccination_note, String vaccination_type) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into vaccinations " +
                     "(citizen_id, vaccination_date, vaccination_status, vaccination_note, vaccination_type) values (?, ?, ?, ?, ?)")) {
            stmt.setLong(1, citizen_id);
            stmt.setTimestamp(2, Timestamp.valueOf(vaccination_date));
            stmt.setString(3, vaccination_status);
            stmt.setString(4, vaccination_note);
            stmt.setString(5, vaccination_type);
            stmt.executeUpdate();

        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed!", sqlException);
        }
    }

    public List<Vaccinations> getExistingVaccinations(String TAJ) {
        List<Vaccinations> vaccinations=new ArrayList<>();
        long citizen_id;
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from citizens where taj = ?")) {
            stmt.setString(1, TAJ);
            citizen_id = selectCitizensByPreparedSatement(stmt).get(0).getId();
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed!", sqlException);
        }
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from vaccinations where citizen_id = ?")) {
            stmt.setLong(1, citizen_id);
            vaccinations = selectVaccinationsByPreparedSatement(stmt);
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed!", sqlException);
        }
        return vaccinations;
    }

    private List<Vaccinations> selectVaccinationsByPreparedSatement(PreparedStatement stmt) {
        List<Vaccinations> result = new ArrayList<>();
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                LocalDateTime vaccdate;
                Timestamp ts = rs.getTimestamp("vaccination_date");
                if (ts == null) {
                    vaccdate = null;
                } else vaccdate = ts.toLocalDateTime();
                Vaccinations vaccination = new Vaccinations(rs.getLong("vaccination_id"),
                        rs.getLong("citizen_id"),
                        vaccdate,
                        rs.getString("vaccination_status"),
                        rs.getString("vaccination_note"),
                        rs.getString("vaccination_type"));
                result.add(vaccination);
            }
            return result;
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot execute", sqlException);
        }
    }

}


