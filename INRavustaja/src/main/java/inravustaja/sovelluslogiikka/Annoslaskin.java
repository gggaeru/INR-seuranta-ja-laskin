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

    public Annoslaskin(double inr, double tabletit) {
        this.inr = inr;
        this.tabletit=tabletit;
    }

    public double laskin() {
        
        if(this.inr > 3.0 && this.inr < 3.4){
            this.tabletit = this.tabletit* 0.9; 
            return this.tabletit;
  
        }
        else if(this.inr < 2.0 && this.inr > 1.7){
            this.tabletit = this.tabletit*1.1;
        return this.tabletit;
        }
        
        else 
            return 0;
   
        
    }
    
    public String paivienJako(){
        return "Tabletteja yhteensä:" + this.tabletit +".  Maanantai: " + 2 + " tablettia...";
    }
    
    public String toString(){
        return "Uusi tablettimääräsi on: "+ paivienJako();
    }

}
