package uz.dawo.geometry;

import uz.dawo.geometry.GeometricFigure;

public class Trapezium extends GeometricFigure {

    private int sideA;
    private int sideB;
    private int high;

    public Trapezium(int sideA, int sideB, int high) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.high = high;
    }

    @Override
    public double area() {
        return (sideA + sideB) * high * 0.5;
    }

    @Override
    public double perimetr() {
        double c = Math.sqrt(Math.pow((sideA - sideB) / 2, 2) + Math.pow(high, 2));
        return sideA + sideB + 2 * c;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }
}
