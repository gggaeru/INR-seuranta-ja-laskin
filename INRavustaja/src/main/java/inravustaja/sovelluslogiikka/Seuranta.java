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
 * <p>Seuranta class.</p>
 *
 * @author onnikone
 *
 *
 * tämä luokka ohjaa tietojen tallennusta ja vanhojen tietojen esittämistä.
 * @version $Id: $Id
 */
public class Seuranta {

    ArrayList<String> seuranta;
    Lukija lukija;
    String inr;
    String pvm;

    /**
     * <p>Constructor for Seuranta.</p>
     *
     * @throws java.io.FileNotFoundException if any.
     * @throws java.io.IOException if any.
     */
    public Seuranta() throws FileNotFoundException, IOException {
        this.lukija = new Lukija();

    }

    
    /**
     *
     * Metodi käyttää scanneria lukeakseen aiempia inr-arvoja ja niiden näytteenotto-
     * päivämääriä, ja tämän jälkeen tulostaa ne näkyviin
     *
     * @param mista a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public String lueEdellisetTiedot(String mista) {

        try {
            for (String rivi : lukija.lue(mista)) {
                this.pvm = rivi.substring(rivi.length() - 10);
                this.inr=rivi.substring(rivi.length()-16, rivi.length()-13);
            }
        } catch (Exception a) {
            System.out.println("Tiedostoa ei ole olemassa");
        }
        String palautus = ("Edellinen inr-arvosi oli :" +  this.inr + " pvm:"+ this.pvm);
       

        return palautus;

    }
    
    
    /**
     *
     * Tämä metodi lisää tiedostoon annetun uuden päivämäärän ja inr-arvon
     *
     * @param inr a {@link java.lang.String} object.
     * @param pvm a {@link java.lang.String} object.
     * @param mista a {@link java.lang.String} object.
     */
    public void lisaaArvo(String inr, String pvm, String mista){
        
        this.inr= inr;
        this.pvm = pvm;

        
         try {
           lukija.tallenna(mista, inr +":.."+ pvm);
            
        } catch (Exception a) {
            System.out.println("Tiedostoa ei ole olemassa");
        }
        
    }
    
    
    
}
