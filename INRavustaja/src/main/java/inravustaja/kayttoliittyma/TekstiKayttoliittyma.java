/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inravustaja.kayttoliittyma;

import inravustaja.sovelluslogiikka.*;
import java.util.Date;

/**
 * <p>TekstiKayttoliittyma class.</p>
 *
 * @author onnikone
 * @version $Id: $Id
 */
public class TekstiKayttoliittyma {

    Lukija lukija = new Lukija();
    Seuranta seuranta;

    /**
     * <p>Constructor for TekstiKayttoliittyma.</p>
     */
    public TekstiKayttoliittyma() {

    }

    /**
     * <p>kaynnista.</p>
     *
     * @throws java.lang.Exception if any.
     */
    public void kaynnista() throws Exception {

        Kayttaja uusialku = new Kayttaja("Tatu", "porkkana");
        this.seuranta = new Seuranta();

        uusialku.kaynnisty();
        System.out.println("Tervetuloa!");

        System.out.println("Jos haluat laskea tablettimäärän uudella INR-arvolla, paina 1."
                + " \nJos haluat nähdä edellisen arvosi, paina 2.");

        double valinta = lukija.lueLiukuluku();
        
        int i=1;
        
        while(i > 0){
        if (valinta == 1) {
            uusiArvo();
            i=0;
        } else if (valinta == 2) {
            seuranta.lueEdellisetTiedot("src/seuranta1.txt");
            i=0;
        }       
        else{
            System.out.println("Paina 1 tai 2.");
            valinta = lukija.lueLiukuluku();
        }
        }
        
        System.out.println("Hyvää päivänjatkoa!");

    }

    /**
     * <p>uusiArvo.</p>
     *
     * @throws java.lang.Exception if any.
     */
    public void uusiArvo() throws Exception {


        System.out.println("Anna päivämäärä: (DD.MM.YYYY)");
        String pvm = lukija.lueMerkkijono();
        
        System.out.println("Anna uusi inr-arvosi:");
        double inr = lukija.lueLiukuluku();
        String inrteksti = inr + "";
        
        System.out.println("Anna viikon tablettimääräsi:");
        double tabl = lukija.lueLiukuluku();

        Annoslaskin uudetmaarat = new Annoslaskin(inr, tabl);
        System.out.println(uudetmaarat.toString());

        PvmLaskin seuraavaksi = new PvmLaskin(inr);
        System.out.println(seuraavaksi.toString());
        
        System.out.println("Haluatko tallentaa tietosi järjestelmään? Paina"
                + " 1 jos haluat tallentaa, paina 2 jos et halua.");
        
        double valinta2 = lukija.lueLiukuluku();
        
        if(valinta2 == 1){
           seuranta.lisaaArvo(inrteksti, pvm, "src/seuranta1.txt");
           seuranta.lueEdellisetTiedot("src/seuranta1.txt");
        }
        
        
    }
    

}
