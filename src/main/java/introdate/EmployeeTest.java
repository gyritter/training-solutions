package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee = new Employee("Jóska Pista", 2000, 1, 1);

        System.out.println(employee.getName());
        System.out.println(employee.getDateOfBirtrh());
        System.out.println(employee.getBeginEmployment());

        employee.setName("Pista Jóska");
        System.out.println(employee.getName());

    }
}
