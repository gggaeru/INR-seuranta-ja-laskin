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
        try{
        this.seuranta = lukija.lue("/scr/seuranta1.txt");
        }
        catch(Exception a){
            System.out.println("Tiedostoa ei ole olemassa");
        }
    }

    public String lueEdellisetTiedot() {
        
        try{
        inr = this.seuranta.get(0);
        } 
        catch (Exception e) {
            System.out.println("Tiedostoa ei ole olemassa");
        }
        
        return inr;
        
    }
}
