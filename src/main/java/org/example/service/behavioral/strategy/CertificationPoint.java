package org.example.service.behavioral.strategy;

public class CertificationPoint implements BenefitsPoint {
    private int numberOfCertifications;

    public CertificationPoint(int numberOfCertifications) {
        this.numberOfCertifications = numberOfCertifications;
    }

    @Override
    public double calculateBenefits() {

        return numberOfCertifications * 10;
    }
}

