package org.example.service.creational.builder;

import java.util.Date;

public class Employee {
    private String name;
    private Date startDate;
    private String department;


    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", startDate=" + startDate +
                ", department='" + department + '\'' +
                '}';
    }
}
