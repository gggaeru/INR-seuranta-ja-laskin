/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inravustaja.sovelluslogiikka;

/**
 *
 * @author onnikone
 */
public class Annoslaskin {

    private double tabletit;
    private double inr;
    private double uusiviikko;

    public Annoslaskin(double inr, double tabletit) {
        this.inr = inr;
        this.tabletit = tabletit;
        this.uusiviikko = laskin();
    }

    public double laskin() {

        if (this.inr > 3.0 && this.inr < 3.4) {
            this.tabletit = this.tabletit * 0.9;
            return this.tabletit;

        } else if (this.inr < 2.0 && this.inr > 1.7) {
            this.tabletit = this.tabletit * 1.1;
            return this.tabletit;
        } else {
            return 0;
        }

    }

    public String tablettienJakoViikolle() {
        if(this.uusiviikko == 0){
            return "INR- arvosi on liian kaukana tavoitearvoista.";
            
        }
          return "" + this.uusiviikko;
    }
    
    public String tablettienJakoPaiville(){
        
        return "";
    }

    public String toString() {
        return "Uusi tablettimääräsi tälle viikolle on : " + tablettienJakoViikolle();
    }

}
