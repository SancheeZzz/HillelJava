package com.sancheezzz;


import java.util.ArrayList;
import java.util.List;

public class Shapes {

    public static void main(String[] args) {
        Shape first = new Circle(4, Colour.RED);
        Shape second = new Square(4, Colour.BLUE);
        Shape third = new Circle(42, Colour.GREEN);
        List<Shape> shapes = new ArrayList<>();
        shapes.add(first);
        shapes.add(second);
        shapes.add(third);

    }

    private double calculateCost(List<Shape> shapes, Colour filterColour) {
        int sum=0;
    for(int i=0; shapes.size()>i;i=i+1){
    if (shapes.get(i).colour()==filterColour){
        sum+=shapes.get(i).colour().cost*shapes.get(i).size();
    }
    }
    return sum;}

    private double findLargest (List<Shape> shapes){
        double largest=0;
        for(int i=0; shapes.size()>i;i=i+1){
            if (shapes.get(i).size()>=largest){
                largest=shapes.get(i).size();
            }
        }
        return largest;}

}
