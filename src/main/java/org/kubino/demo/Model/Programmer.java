package org.kubino.demo.Model;

import java.util.Locale;

public class Programmer extends Employee {

    public Programmer(float salary, int bonus) {
        super(salary, bonus, JobType.PROGRAMMER);
    }

    public String getInfo() {
        return job.getValue() + "’s salary is " + (salary + bonus);
    }
}
