package org.kubino.demo;

import org.kubino.demo.Model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private int callCounter = 0;

    public EmployeeServiceImpl() {
        writeNumber();
    }

    @Bean
    @Override
    public float totalSumOfSalaries(List<Employee> list) {
        return (float) list.stream().mapToDouble(Employee::getSalary).sum();
    }

    @Bean
    @Override
    public int totalSumOfBonuses(List<Employee> list) {
        return list.stream().mapToInt(Employee::getBonus).sum();
    }

    public int writeNumber() {
        return ++callCounter;
    }
}
