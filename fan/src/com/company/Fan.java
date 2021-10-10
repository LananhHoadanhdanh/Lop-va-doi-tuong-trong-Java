package com.company;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed;
    boolean on;
    String color;
    double radius;

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.color = "blue";
        this.radius = 5;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getSpeed() {
        return this.speed;
    }
    public boolean getOn() {
        return this.on;
    }
    public String getColor() {
        return this.color;
    }
    public double getRadius() {
        return this.radius;
    }

    public String toString() {
        if(on) {
            return "Fan is on. Speed: " + this.speed + "; Color: " + this.color + "; Radius: " + this.radius + ".";
        } else {
            return "Fan is off. Color: " + this.color + "; Radius: " + this.radius + ".";
        }
    }
}
