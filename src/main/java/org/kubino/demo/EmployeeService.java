import Model.Employee;

import java.util.List;

public interface EmployeeService {
    float totalSumOfSalaries(List<Employee> list);
    int totalSumOfBonuses(List<Employee> list);
}
