package org.example.service.behavioral.template;

import java.util.Date;
import org.example.service.behavioral.strategy.BenefitsPoint;
import org.example.service.behavioral.strategy.CertificationPoint;
import org.example.service.behavioral.strategy.ProjectContributionPoint;
import org.example.service.behavioral.strategy.WFHPoint;
import org.example.service.creational.builder.Employee;
import org.example.service.creational.builder.EmployeeBuilder;
import org.example.service.creational.prototype.EmployeeManage;
import org.example.service.structural.composite.BenefitsComposite;

public class EmployeeProcess extends EmployeeProcessTemplate {

    @Override
    protected Employee createEmployee(Date startDate) {
        EmployeeBuilder builder = new EmployeeBuilder()
                .setName("John Doe")
                .setStartDate(startDate)
                .setDepartment("CSE");
        return builder.build();
    }

    @Override
    protected BenefitsComposite createBenefitsComposite() {
        BenefitsPoint certificationPoint = new CertificationPoint(1);
        BenefitsPoint projectContributionPoint = new ProjectContributionPoint(3);
        BenefitsPoint wfhPoint = new WFHPoint(true);
        BenefitsComposite compositePoints = new BenefitsComposite();
        compositePoints.addPoints(certificationPoint);
        compositePoints.addPoints(projectContributionPoint);
        compositePoints.addPoints(wfhPoint);
        return compositePoints;
    }

    @Override
    protected void displayEmployee(Employee employee,BenefitsComposite composite) {
        System.out.println("Employee Details:");
        System.out.println(employee);
        System.out.println("Employee Benefits: $" + composite.calculateBenefits());
    }

    @Override
    protected Employee cloneEmployee(Employee employee) {
        EmployeeManage manage = EmployeeManage.getInstance();
        Employee clonedEmployee = manage.cloneEmployee(employee);
        clonedEmployee.setName("Brad Muller");
        clonedEmployee.setStartDate(new Date());
        return clonedEmployee;
    }
}
