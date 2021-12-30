package Model;

public class Driver extends Employee{

    public Driver(float salary, int bonus) {
        super(salary, bonus, JobType.DRIVER);
    }

    public String getInfo() {
        return job.getValue() + "Model.Driver’s salary is " + salary + " and bonus is " + bonus;
    }
}
