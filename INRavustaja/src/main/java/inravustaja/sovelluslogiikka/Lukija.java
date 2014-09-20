/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inravustaja.sovelluslogiikka;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lukija {
    
    private Scanner lukija;
    
      public Lukija() {       
        this.lukija = new Scanner(System.in);
    }
      
    public String lueMerkkijono() {       
        String merkit = lukija.nextLine();
        return merkit;
    }

    public double lueLiukuluku() {
        double kokonaisluku = Double.parseDouble(lukija.nextLine());
        return kokonaisluku;
    }

    public ArrayList<String> lue(String tiedosto) throws FileNotFoundException {
        Scanner tiedostonLukija = new Scanner(new File(tiedosto));
        ArrayList<String> rivit = new ArrayList<String>();

        while (tiedostonLukija.hasNextLine()) {
            rivit.add(tiedostonLukija.nextLine());
        }
        return rivit;
    }

    public void tallenna(String tiedosto, String teksti) throws FileNotFoundException, IOException {
        FileWriter kirjoittaja = new FileWriter(tiedosto);
        kirjoittaja.write(teksti);
        kirjoittaja.close();
    }

    public void tallenna(String tiedosto, ArrayList<String> tekstit) throws FileNotFoundException, IOException {
        FileWriter kirjoittaja = new FileWriter(tiedosto);
        for (String teksti : tekstit) {
            kirjoittaja.write(teksti);
            kirjoittaja.write("\n");
        }
        kirjoittaja.close();
    }
}
