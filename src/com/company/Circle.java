package com.company;

public class Circle {
    private double PI;
    private int radius;

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(double PI, int radius) {
        this.PI = PI;
        this.radius = radius;

    }

    static void area(double PI, int radius){
        System.out.println(PI*(radius*radius));
    }
   static void circumference(double PI, int radius){
       System.out.println(PI*2*radius);
    }



}
