package Model;

public abstract class Employee {
    float salary;
    int bonus;
    JobType job;

    protected Employee(float salary, int bonus, JobType job) {
        this.salary = salary;
        this.bonus = bonus;
        this.job = job;
    }

    public abstract String getInfo();

    public float getSalary() {
        return salary;
    }

    public int getBonus() {
        return bonus;
    }
}
