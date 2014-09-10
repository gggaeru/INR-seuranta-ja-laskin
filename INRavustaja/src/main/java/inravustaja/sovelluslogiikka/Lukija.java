/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inravustaja.sovelluslogiikka;

import java.util.Scanner;

/**
 *
 * @author onnikone
 */
public class Lukija {
    
      private Scanner lukija;
 
     
    public Lukija(){
         this.lukija = new Scanner(System.in);
    }
     
     
    public String lueMerkkijono(){
        String merkit = lukija.nextLine();
         
        return merkit;
    }
     
    public int lueKokonaisluku(){
         
        int kokonaisluku = kokonaisluku = Integer.parseInt(lukija.nextLine());
        return kokonaisluku;
    }

    
}
