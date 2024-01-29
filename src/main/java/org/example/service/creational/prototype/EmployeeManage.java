package org.example.service.creational.prototype;

import java.util.ArrayList;
import java.util.List;

import org.example.service.creational.builder.Employee;
import org.example.service.creational.builder.EmployeeBuilder;

public class EmployeeManage {
    private static EmployeeManage instance;
    private List<Employee> employees;

    private EmployeeManage() {
        employees = new ArrayList<>();
    }

    public static EmployeeManage getInstance() {
        if (instance == null) {
            instance = new EmployeeManage();
        }
        return instance;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }


    public Employee cloneEmployee(Employee employee) {
        EmployeeBuilder builder = new EmployeeBuilder()
                .setName(employee.getName())
                .setStartDate(employee.getStartDate())
                .setDepartment(employee.getDepartment());
        return builder.build();
    }
}

