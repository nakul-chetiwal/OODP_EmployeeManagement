package org.example.service.behavioral.strategy;

public class ProjectContributionPoint implements BenefitsPoint {
    private int numberOfProjects;

    public ProjectContributionPoint(int numberOfProjects) {
        this.numberOfProjects = numberOfProjects;
    }
    @Override
    public double calculateBenefits() {

        return numberOfProjects * 5;
    }
}