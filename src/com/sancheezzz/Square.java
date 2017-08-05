package com.sancheezzz;

public class Square implements Shape {
    int side=0;
    Colour colour;
    @Override
    public double size(){
        return Math.pow(side,2);
    }

    @Override
    public Colour colour() {
        return colour;
    }

    Square(int side,Colour colour){
        this.side=side;
        this.colour=colour;
    }

}
