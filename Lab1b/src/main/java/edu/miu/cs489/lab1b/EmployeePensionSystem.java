package edu.miu.cs489.lab1b;

import edu.miu.cs489.lab1b.model.Employee;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class EmployeePensionSystem
{
    public static void main( String[] args ) {

        var employees = List.of(
                new Employee(1L, "Daniel", "Agar", LocalDate.of(2018,1,17), 105945.50, "EX1089", LocalDate.of(2023,1,17), 100.00),
                new Employee(2L, "Bernard", "Shaw", LocalDate.of(2018,10,3), 197750.50, null, null, null),
                new Employee(3L, "Carly", "Agar", LocalDate.of(2014,5,16), 842000.75, "SM2307", LocalDate.of(2019,11,4), 1555.50),
                new Employee(4L, "Wesley", "Schneider", LocalDate.of(2018,11,2), 74500.00, null, null, null)
        );

        printAllEmployees(employees);
        printMonthlyUpcomingEmployees(employees);
    }

    private static void printAllEmployees(List<Employee> employees) {
        System.out.println("Printing all employee list");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getLastName).thenComparing(Employee::getYearlySalary, Comparator.reverseOrder()))
                .forEach(System.out::println);
    }

    private static void printMonthlyUpcomingEmployees(List<Employee> employees) {
        // TODO Sort
        System.out.println("\n\nPrinting upcoming enrollment employee list");
        employees.stream().filter(Employee::isUpcomingEnrollee)
                .forEach(System.out::println);
    }
}
