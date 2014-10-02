/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inravustaja.sovelluslogiikka;

/**
 *
 * @author onnikone
 * 
 * Tämä luokka tallentaa niitä arvoja, joita tule seurantaan. Ei toimi vielä.
 */
public class InrArvoJaPvm {
    
    private double inr;
    private String pvm;
    
    
    public InrArvoJaPvm(double inr, String pvm){
        this.inr = inr;
        this.pvm = pvm;
    }
    
    public double getInrArvo(){
        return this.inr;
    }
    
    public String getPvm(){
        return this.pvm;
    }
    
    
}
