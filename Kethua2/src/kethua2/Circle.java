/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kethua2;

/**
 *
 * @author Dipper
 */
public class Circle extends Shape{
    protected double radius ;
    protected final double Pi=3.14;
    Circle(){
        super();
        this.radius=1.0;
    }
    Circle(String color , boolean filled, double radius){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Pi*this.radius*this.radius;
    }
    @Override
    public String toString(){
        return super.toString()+ " " + this.radius + " " + getArea();
    }
}
