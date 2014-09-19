/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inravustaja.sovelluslogiikka;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author onnikone
 */
public class Seuranta {

    public Seuranta() throws FileNotFoundException, IOException {

        Lukija t = new Lukija();

        for (String rivi : t.lue("src/seuranta.txt")) {
            System.out.println(rivi);
        }       
    }

}
