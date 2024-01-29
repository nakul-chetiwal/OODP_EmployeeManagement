package org.example.service.structural.composite;

import java.util.ArrayList;
import java.util.List;

import org.example.service.behavioral.strategy.BenefitsPoint;

public class BenefitsComposite implements BenefitsPoint {
    private List<BenefitsPoint> points;

    public BenefitsComposite() {
        points = new ArrayList<>();
    }

    public void addPoints(BenefitsPoint point) {
        points.add(point);
    }

    @Override
    public double calculateBenefits() {
        double totalpoints = 0;
        for (BenefitsPoint point : points) {
            totalpoints += point.calculateBenefits();
        }
        return totalpoints;
    }
}


