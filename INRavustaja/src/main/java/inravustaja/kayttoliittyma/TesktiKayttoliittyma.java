/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inravustaja.kayttoliittyma;

import inravustaja.sovelluslogiikka.*;
import java.util.Date;

/**
 *
 * @author onnikone
 */
public class TesktiKayttoliittyma {

    Lukija lukija = new Lukija();

    public TesktiKayttoliittyma() {

    }

    public void kaynnista() throws Exception {

        Kayttaja uusialku = new Kayttaja("Tatu", "porkkana");
        Seuranta seuranta = new Seuranta();

        uusialku.kaynnisty();
        System.out.println("Tervetuloa!");

        System.out.println("Jos haluat laskea tablettimäärän uudella INR-arvolla, paina 1."
                + " \nJos haluat selata vanhoja arvoja, paina 2.");

        double valinta = lukija.lueLiukuluku();
        

        if (valinta == 1) {
            uusiArvo();
        } else if (valinta == 2) {
            seuranta.lueEdellisetTiedot();
        }               

        System.out.println("Hyvää päivänjatkoa!");

    }

    public void uusiArvo() throws Exception {

        System.out.println("Anna uusi inr-arvosi:");
        double inr = lukija.lueLiukuluku();
        Date currentTime = new Date();
        String pvm = currentTime + "";

        InrArvoJaPvm uusiarvo = new InrArvoJaPvm(inr, pvm);

        System.out.println("Anna tablettimääräsi:");
        double tabl = lukija.lueLiukuluku();

        Annoslaskin uudetmaarat = new Annoslaskin(inr, tabl);
        System.out.println(uudetmaarat.toString());

        PvmLaskin seuraavaksi = new PvmLaskin(inr);
        System.out.println(seuraavaksi.toString());


    }
    
    

}
