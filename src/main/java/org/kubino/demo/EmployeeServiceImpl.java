import Model.Employee;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    public float totalSumOfSalaries(List<Employee> list) {
        return (float) list.stream().mapToDouble(Employee::getSalary).sum();
    }

    public int totalSumOfBonuses(List<Employee> list) {
        return list.stream().mapToInt(Employee::getBonus).sum();
    }
}
