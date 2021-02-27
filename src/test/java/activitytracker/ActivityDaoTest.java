package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ActivityDaoTest {

    ActivityDao activityDao;

    @BeforeEach
    public void init(){
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
    public void selectAllTest(){
      assertEquals(3,activityDao.selectAllActivities().size());
    }

    @Test
    public void SelectBeforeDateTest(){
        System.out.println(activityDao.selectActivitiesBeforeDate(LocalDate.of(2020,02,05)));
    }

}