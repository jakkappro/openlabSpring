package org.kubino.demo;

import org.kubino.demo.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@Component
public class EmployeeController {
    private float salaries;
    private float bonuses;

    @GetMapping("/hello/")
    public String welcomeMessage() {
        return "Hello Spring Boot!";
    }

    @GetMapping("/getTotalNumberOfSalaries")
    public float printTotalNumberOfSalaries() {
        return salaries;
    }

    @GetMapping("/getTotalNumberOfBonuses")
    public float getTotalNumberOfBonuses() {
        return bonuses;
    }

    @GetMapping("/snail")
    public float snailGoesUp(@RequestParam float towerHeight, @RequestParam float heightOfStep, @RequestParam float lengthOfStep) {
        return towerHeight / heightOfStep * lengthOfStep + towerHeight;
    }

    @Autowired
    public void getTotalNumberOfSalaries(EmployeeServiceImpl emp, ArrayList<Employee> employees) {
        salaries = emp.totalSumOfSalaries(employees);
        bonuses = emp.totalSumOfBonuses(employees);
    }
}
