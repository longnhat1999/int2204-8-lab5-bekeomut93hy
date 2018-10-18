/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kethua;

/**
 *
 * @author Dipper
 */
public class Hoaqua {
    private double cost;
    private String source;
    private String date;
    private int amount;
    Hoaqua(double cost,String source,String date,int amount){
        this.cost= cost;
        this.source=source;
        this.date=date;
        this.amount=amount;
    }
    public double getCost() {
        return cost;
    }

    public String getSource() {
        return source;
    }

    public String getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
}
