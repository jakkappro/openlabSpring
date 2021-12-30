package org.kubino.demo.Model;

public class Teacher extends Employee {

    public Teacher(float salary, int bonus){
        super(salary, bonus, JobType.TEACHER);
    }

    public String getInfo() {
        return job.getValue() + "Model.Teacher’s salary is " + salary + " and bonus is " + bonus;
    }
}
