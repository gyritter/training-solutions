package timesheet;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Employee> employees = new ArrayList<>();
    private List<Project> projects = new ArrayList<>();
    private List<TimeSheetItem> timeSheetItems = new ArrayList<>();
    private List<ReportLine> reportLines = new ArrayList<>();

    public Company(InputStream employeeStream, InputStream projectStream) {
        fillEmployeeList(employeeStream);
        fillProjectList(projectStream);
    }

    private void fillEmployeeList(InputStream employeeStream) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(employeeStream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                addEmployee(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public List<Project> getProjects() {
        return new ArrayList<>(projects);
    }

    private void fillProjectList(InputStream projectStream) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(projectStream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                projects.add(new Project(line));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private void addEmployee(String fullName) {
        String[] temp = fullName.split(" ");
        employees.add(new Employee(temp[0], temp[1]));
    }

    public void addTimeSheetItem(Employee employee, Project project, LocalDateTime beginDate, LocalDateTime endDate) {

        if (projectValidator(project)) throw new IllegalArgumentException("The project does not exist");
        if (nameValidator(employee.getName())) throw new IllegalArgumentException("The employee does not exist");

        timeSheetItems.add(new TimeSheetItem(employee, project, beginDate, endDate));
    }

    public List<ReportLine> calculateProjectByNameYearMonth(String employeeName, int year, int month) {
        fillReportLineList();
        if (nameValidator(employeeName)) throw new IllegalArgumentException("The employee does not exist");
        for (TimeSheetItem timeSheetItem : timeSheetItems) {
            if (timeSheetItem.getEmployee().getName().equals(employeeName)) {
                if (timeSheetItem.getBeginDate().getYear() == year && timeSheetItem.getBeginDate().getMonthValue() == month) {
                    addProjectToLine(timeSheetItem);
                }
            }
        }
        return new ArrayList<>(reportLines);
    }

    private void addProjectToLine(TimeSheetItem item) {
        for (ReportLine r : reportLines) {
            if (r.getProject().getName().equals(item.getProject().getName())) {
                //System.out.println(r.getProject().getName()+" "+item.getProject().getName());
                r.addTime(item.hoursBetweenDates());
            }
        }
    }

    private void fillReportLineList() {
        reportLines.clear();
        for (Project p : projects) {
            reportLines.add(new ReportLine(p, 0));
        }
    }

    private boolean projectValidator(Project project) {
        boolean b = true;
        for (Project p : projects) {
            if (project.getName().equals(p.getName())) {
                b = false;
            }
        }
        return b;
    }

    private boolean nameValidator(String name) {

        boolean b = true;
        for (Employee e : employees) {
            if (e.getName().equals(name)) {
                b = false;
            }
        }
        return b;
    }


    public void printToFile(String name, int year, int month, Path report) {
        List<ReportLine> reportLines;

        reportLines = calculateProjectByNameYearMonth(name, year, month);
        long counter = 0;
        for (ReportLine r : reportLines) {
            counter += r.getTime();
        }
        String m;
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(report))) {

            writer.print(name);
            writer.print(" ");
            writer.print(year);
            writer.print("-");
            if (month<10){
                m="0" + Integer.toString(month);
            }else m=Integer.toString(month);
            writer.print(m);
            writer.print(" ");
            writer.println(counter);

            for (ReportLine r : reportLines) {
                if (r.getTime() > 0) {
                    writer.print(r.getProject().getName().trim());
                    writer.print(" ");
                    writer.println(r.getTime());
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

}
