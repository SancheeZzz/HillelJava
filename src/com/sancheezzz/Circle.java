package com.sancheezzz;

public class Circle implements Shape {
    int radius = 0;
    Colour colour;
    @Override
    public double size(){
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public Colour colour() {
        return colour;
    }

    Circle(int radius,Colour colour){
        this.radius=radius;
        this.colour=colour;
    }
}
