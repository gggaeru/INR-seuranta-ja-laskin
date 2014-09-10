/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inravustaja.sovelluslogiikka;

import java.util.HashMap;

/**
 *
 * @author onnikone
 */
public class Kayttajatunnus {

    HashMap<String, String> tunnukset;

    public Kayttajatunnus() {
        this.tunnukset = new HashMap<String, String>();
    }

    public void lisaaTunnus(String nimi, String salasana) {
        this.tunnukset.put(nimi, salasana);
    }

}
