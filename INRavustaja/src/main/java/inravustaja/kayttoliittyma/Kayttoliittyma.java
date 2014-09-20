/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inravustaja.kayttoliittyma;

import inravustaja.sovelluslogiikka.*;


/**
 *
 * @author onnikone
 */
public class Kayttoliittyma {

    Lukija lukija = new Lukija();

    public Kayttoliittyma() {

    }

    public void kaynnista() throws Exception  {
        
        Kayttaja uusialku = new Kayttaja("Tatu","porkkana");
        uusialku.kaynnisty();

        System.out.println("Anna inr-arvosi:");
        double inr = lukija.lueLiukuluku();  
        
        String pvm = "";
        
        InrArvoJaPvm uusiarvo = new InrArvoJaPvm(inr, pvm);

        System.out.println("Anna tablettimääräsi:");
        double tabl = lukija.lueLiukuluku();
            
        Annoslaskin uudetmaarat = new Annoslaskin(inr, tabl);
        System.out.println(uudetmaarat.toString());

        PvmLaskin seuraavaksi = new PvmLaskin(inr);
        System.out.println(seuraavaksi.toString());
        
        

    }

}
