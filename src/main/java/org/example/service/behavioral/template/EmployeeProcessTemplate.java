package org.example.service.behavioral.template;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.example.service.creational.builder.Employee;
import org.example.service.structural.composite.BenefitsComposite;

public abstract class EmployeeProcessTemplate {

    // Generate a random start date for the employee
    private Date generateRandomDate(){
        Random random = new Random();
        Calendar calendar = Calendar.getInstance();

        // Set calendar to a random date
        calendar.set(Calendar.YEAR, random.nextInt(2022 - 1999 + 1) + 1999);
        calendar.set(Calendar.MONTH, random.nextInt(12));
        calendar.set(Calendar.DAY_OF_MONTH, random.nextInt(28) + 1);

        return calendar.getTime();
    }
    protected abstract Employee createEmployee(Date startDate);
    protected abstract BenefitsComposite createBenefitsComposite();
    protected abstract void displayEmployee(Employee employee, BenefitsComposite composite);
    protected abstract Employee cloneEmployee(Employee employee);


    //This processEmployee()  method is called Template Method. This method is inherited in subclass but can not be overridden
    public final void processEmployee() {
        Date startDate = generateRandomDate();
        Employee employee = createEmployee(startDate);
        BenefitsComposite composite = createBenefitsComposite();
        displayEmployee(employee,composite);
        Employee clonedEmployee= cloneEmployee(employee);
    }



}
