package week08d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotTest {

    @Test
    public void Test1() {

        Robot robot = new Robot();
        RoboPos position = robot.move("FFLLLLLBBBJJJJJJJ");

        assertEquals(4, position.getX());
        assertEquals(-3, position.getY());
    }
}
