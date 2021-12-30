package org.kubino.demo;

import org.kubino.demo.Model.Employee;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    @Override
    public float totalSumOfSalaries(List<Employee> list) {
        return (float) list.stream().mapToDouble(Employee::getSalary).sum();
    }

    @Override
    public int totalSumOfBonuses(List<Employee> list) {
        return list.stream().mapToInt(Employee::getBonus).sum();
    }
}
