package org.kubino.demo.Model;

import org.kubino.demo.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DependencyInjectorDemo {

    @Autowired
    public DependencyInjectorDemo(EmployeeService service) {
        ArrayList<Employee> employees = new ArrayList<>(List.of(new Programmer(100, 1),
                new Teacher(50, 1), new Driver(300, 2)));

        employees.forEach(n -> System.out.println(n.getInfo()));

        System.out.println(service.totalSumOfBonuses(employees));
        System.out.println(service.totalSumOfSalaries(employees));
    }
}
