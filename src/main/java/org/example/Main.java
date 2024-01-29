package org.example;

import org.example.service.behavioral.template.EmployeeProcess;
import org.example.service.behavioral.template.EmployeeProcessTemplate;

public class Main {

    public static void main(String[] args) {

        EmployeeProcessTemplate employeeProcessTemplate = new EmployeeProcess();
        // This processEmployee()  method is called Template Method. This method is inherited in subclass but can not be overridden
        employeeProcessTemplate.processEmployee();
    }
}