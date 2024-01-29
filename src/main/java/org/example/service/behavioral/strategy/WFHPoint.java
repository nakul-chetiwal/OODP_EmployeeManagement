package org.example.service.behavioral.strategy;

public class WFHPoint implements BenefitsPoint {
    private final boolean flag;

    public WFHPoint(boolean flag) {
        this.flag = flag;
    }
    @Override
    public double calculateBenefits() {
       if (flag) {
           return 500.00;
       }
        return 0.00;
    }
}
