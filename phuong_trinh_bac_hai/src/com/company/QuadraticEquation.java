package com.company;
import java.lang.Math;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void gettterA(double a) {
        this.a = a;
    }
    public void gettterB(double b) {
        this.a = b;
    }
    public void gettterC(double c) {
        this.a = c;
    }
    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }
    public double getRoot1() {
        return ((-this.b) + Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }
    public double getRoot2() {
        return ((-this.b) - Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }
}
