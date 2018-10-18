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
public class Square extends Rectangle {
    protected double side;
    Square(){ 
        super();
    }
    Square(double side){
        super(side,side);
    }
    Square(String color , boolean filled,double side){
        super(color,filled,side,side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public void setWidth(double side){
        this.width=side;
    }
    @Override
    public void setLength(double side){
        this.length=side;
    }
    
}
