package org.example.service.creational.builder;

import java.util.Date;

public class EmployeeBuilder {
    private Employee employee;

    public EmployeeBuilder() {
        employee = new Employee();
    }

    public EmployeeBuilder setName(String name) {
        employee.setName(name);
        return this;
    }

    public EmployeeBuilder setStartDate(Date startDate) {
        employee.setStartDate(startDate);
        return this;
    }

    public EmployeeBuilder setDepartment(String department) {
        employee.setDepartment(department);
        return this;
    }

    public Employee build() {
        return employee;
    }
}