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

/**
 * <p>Lukija class.</p>
 *
 * @author onnikone
 * @version $Id: $Id
 */
public class Lukija {
    
    private Scanner lukija;
    
      /**
       * <p>Constructor for Lukija.</p>
       */
      public Lukija() {       
        this.lukija = new Scanner(System.in);
    }
      
    /**
     * <p>lueMerkkijono.</p>
     *
     * @return a {@link java.lang.String} object.
     * @throws java.lang.Exception if any.
     */
    public String lueMerkkijono() throws Exception{       
        String merkit = lukija.nextLine();
        return merkit;
    }

    /**
     * <p>lueLiukuluku.</p>
     *
     * @return a double.
     * @throws java.lang.Exception if any.
     */
    public double lueLiukuluku() throws Exception {
        double kokonaisluku = Double.parseDouble(lukija.nextLine());
        return kokonaisluku;
    }

    /**
     * <p>lue.</p>
     *
     * @param tiedosto a {@link java.lang.String} object.
     * @return a {@link java.util.ArrayList} object.
     * @throws java.io.FileNotFoundException if any.
     */
    public ArrayList<String> lue(String tiedosto) throws FileNotFoundException {
        Scanner tiedostonLukija = new Scanner(new File(tiedosto));
        ArrayList<String> rivit = new ArrayList<String>();

        while (tiedostonLukija.hasNextLine()) {
            rivit.add(tiedostonLukija.nextLine());
        }
        return rivit;
    }

    /**
     * <p>tallenna.</p>
     *
     * @param tiedosto a {@link java.lang.String} object.
     * @param teksti a {@link java.lang.String} object.
     * @throws java.io.FileNotFoundException if any.
     * @throws java.io.IOException if any.
     */
    public void tallenna(String tiedosto, String teksti) throws FileNotFoundException, IOException {
        FileWriter kirjoittaja = new FileWriter(tiedosto);
        kirjoittaja.write(teksti);
        kirjoittaja.write(teksti);
        kirjoittaja.close();
    }

    /**
     * <p>tallenna.</p>
     *
     * @param tiedosto a {@link java.lang.String} object.
     * @param tekstit a {@link java.util.ArrayList} object.
     * @throws java.io.FileNotFoundException if any.
     * @throws java.io.IOException if any.
     */
    public void tallenna(String tiedosto, ArrayList<String> tekstit) throws FileNotFoundException, IOException {
        FileWriter kirjoittaja = new FileWriter(tiedosto);
        for (String teksti : tekstit) {
            kirjoittaja.write(teksti);
            kirjoittaja.write("\n");
        }
        kirjoittaja.close();
    }
}
