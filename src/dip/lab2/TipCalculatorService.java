/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author Naython
 */
public class TipCalculatorService {
    private TipCalculator tip;

    public TipCalculatorService(TipCalculator t) {
        tip = t;
    }
    public double getTip(TipCalculator calc){
        return calc.getTip();
    }
    
}
