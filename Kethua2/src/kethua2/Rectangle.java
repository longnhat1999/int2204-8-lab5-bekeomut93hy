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
public class Rectangle extends Shape{
    protected double width;
    protected double length;
    Rectangle(){
        super();
        this.length=1.0;
        this.width=1.0;
    }
    Rectangle(double width,double length){
        this.length=length;
        this.width= width;
    }
    Rectangle(String color , boolean filled,double width,double length){
        super(color,filled);
        this.length=length;
        this.width= width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.getWidth()*this.getLength();
    }
    public double getPerimeter(){
        return (this.length+this.width)*2;
    }
    @Override
    public String toString(){
        return super.toString()+" "+this.getArea()+" "+this.getPerimeter();
    }
}
