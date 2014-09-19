/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inravustaja.sovelluslogiikka;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import static jdk.nashorn.internal.objects.NativeMath.round;

/**
 *
 * @author onnikone
 */
public class Annoslaskin {

    private double tabletit;
    private double inr;
    private double uusiviikko;
    private String muotoiltu;


    public Annoslaskin(double inr, double tabletit) {
        this.inr = inr;
        this.tabletit = tabletit;
    }
    
    public String muunnin(double d){
        NumberFormat formatter = new DecimalFormat("#0.0"); 
        return formatter.format(d);
    }
    

    public double laskin() {

        if (this.inr > 3.0 && this.inr < 3.3) {
            this.tabletit = this.tabletit * 0.9;
            return this.tabletit;

        } else if (this.inr < 2.0 && this.inr > 1.7) {
            this.tabletit = this.tabletit * 1.1;
            return (double) round(this.tabletit,2);

        } else if (this.inr > 1.9 && this.inr < 3.1) {
            return this.tabletit;

        } else if (this.inr > 3.2 || this.inr < 1.8) {
            return 0;
        }
        return 0;

    }

    public String tablettienJakoViikolle() {
        if (this.uusiviikko == 0) {
            return "INR- arvosi on liian kaukana tavoitearvoista.";
        }       
        this.muotoiltu = muunnin(this.tabletit);       
        return muotoiltu;
    }

    public String tablettienJakoPaiville() {

        return "";
    }

    public String toString() {
        return "Uusi tablettimääräsi tälle viikolle on : " + tablettienJakoViikolle();
    }

}
