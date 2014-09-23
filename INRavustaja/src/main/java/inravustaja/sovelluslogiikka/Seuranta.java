/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inravustaja.sovelluslogiikka;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author onnikone
 */
public class Seuranta {

    ArrayList<String> seuranta;
    Lukija lukija;
    String inr;
    String pvm;

    public Seuranta() throws FileNotFoundException, IOException {
        this.lukija = new Lukija();

    }

    public String lueEdellisetTiedot() {

        try {
            for (String rivi : lukija.lue("src/seuranta1.txt")) {
                this.pvm = rivi.substring(rivi.length() - 10);
                this.inr=rivi.substring(rivi.length()-16, rivi.length()-13);
            }
        } catch (Exception a) {
            System.out.println("Tiedostoa ei ole olemassa");
        }
        
        System.out.println("Edellinen inr-arvosi oli :" +  this.inr + " pvm:"+ this.pvm);

        return "";

    }
    
    public void lisaaArvo(){
        
        
    }
    
    
    
}
