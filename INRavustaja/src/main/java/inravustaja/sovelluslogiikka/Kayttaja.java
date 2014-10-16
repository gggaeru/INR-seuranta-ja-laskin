/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inravustaja.sovelluslogiikka;

/**
 *
 * @author onnikone
 */


/**
 *
 * Käyttäjäluokan tärkein ominaisuus on toimia salasanana, ettei kuka tahansa pääsisi
 * katsomaan henkilökohtaisia tietoja pelkästään ohjelman käynnistämisellä
 *
 * @author onnikone
 * @version $Id: $Id
 */
public class Kayttaja {

    private String kayttaja;
    private String salasana;
    private Lukija lukija;

    /**
     * <p>Constructor for Kayttaja.</p>
     *
     * @param kayttaja a {@link java.lang.String} object.
     * @param salasana a {@link java.lang.String} object.
     */
    public Kayttaja(String kayttaja, String salasana) {
        this.kayttaja = kayttaja;
        this.salasana = salasana;
        this.lukija = new Lukija();
    }

    /**
     *
     * Tämä metodi hoitaa tällä hetkellä kaiken oleellisen, eli kysyy salasanan, varmistaa
     * että se on oikein ja hoitaa palautuksen
     *
     * @return a {@link java.lang.String} object.
     * @throws java.lang.Exception if any.
     */
    public String kaynnisty() throws Exception {

        System.out.println("Hei " + this.kayttaja + "!");
        System.out.println("Anna salasana:");
        String sala1 = lukija.lueMerkkijono();
        while (true) {
            if (this.salasana.equals(sala1)) {
                return "";
            } else {
                System.out.println("Salasana oli väärin, yritä uudestaan!");
                sala1 = lukija.lueMerkkijono();
            }
        }
    }

    /**
     * <p>Getter for the field <code>kayttaja</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getKayttaja() {
        return kayttaja.toString();
    }

    /**
     * <p>Getter for the field <code>salasana</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getSalasana() {
        return this.salasana;
    }

}
