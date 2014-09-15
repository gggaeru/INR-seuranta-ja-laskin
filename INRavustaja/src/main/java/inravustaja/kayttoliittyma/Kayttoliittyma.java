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

    public Kayttoliittyma(){
        
    }
    
    public void kaynnista(){
        
       
         System.out.println (
        "Anna inr-arvosi:");
         double inr = lukija.lueLiukuluku();
         InrArvo uusiarvo = new InrArvo(inr);

        System.out.println (
        "Anna tablettimääräsi:");
         double maara = lukija.lueLiukuluku();
         
         PVMlaskin seuraavaksi = new PVMlaskin(inr);
         System.out.println(seuraavaksi.toString());
         Annoslaskin uudetmaarat = new Annoslaskin(inr, maara);
         System.out.println(uudetmaarat.toString());
         
         
         
         
    }

}
