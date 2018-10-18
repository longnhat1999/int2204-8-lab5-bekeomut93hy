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
public class QuaCam extends Hoaqua{
    private double percentvtmC;
    public QuaCam(double cost, String source, String date, int amount,double percentvtmC) {
        super(cost, source, date, amount);
        this.percentvtmC=percentvtmC;
    }

    public double getPercentvtmC() {
        return percentvtmC;
    }

    public void setPercentvtmC(float percentvtmC) {
        this.percentvtmC = percentvtmC;
    }
    
}
