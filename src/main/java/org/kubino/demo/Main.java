import Model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>(List.of(new Programmer(100, 1),
                new Teacher(50, 1), new Driver(300, 2)));

        employees.forEach(n -> System.out.println(n.getInfo()));

        EmployeeService service = new EmployeeServiceImpl();

        System.out.println(service.totalSumOfBonuses(employees));
        System.out.println(service.totalSumOfSalaries(employees));
    }
}
