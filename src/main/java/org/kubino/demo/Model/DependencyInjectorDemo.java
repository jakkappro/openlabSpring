package org.kubino.demo.Model;

import org.kubino.demo.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
@Service
public class DependencyInjectorDemo {
    private final ArrayList<Employee> employees;

    @Autowired
    public DependencyInjectorDemo(EmployeeService service) {
         employees = new ArrayList<>(List.of(new Programmer(100, 1),
                new Teacher(50, 1), new Driver(300, 2)));

        employees.forEach(n -> System.out.println(n.getInfo()));

        System.out.println(service.totalSumOfBonuses(employees));
        System.out.println(service.totalSumOfSalaries(employees));
    }

    @Bean
    public ArrayList<Employee> getEmployees() {
        return employees;
    }
}
