package org.kubino.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test {

    @Autowired
    public void justTest(EmployeeServiceImpl emp) {
        System.out.println(emp.writeNumber());
    }
}
