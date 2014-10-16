/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inravustaja.sovelluslogiikka;

/**
 * <p>PvmLaskin class.</p>
 *
 * @author onnikone
 *
 * tämä luokka laskee arvion seuraavasta päivämäärästä, jolloin verikokeeseen olisi
 * hyvä mennä
 * @version $Id: $Id
 */
public class PvmLaskin {

    private double inrarvo;

    /**
     * <p>Constructor for PvmLaskin.</p>
     *
     * @param inr a double.
     */
    public PvmLaskin(double inr) {
        this.inrarvo = inr;
    }

    /**
     * <p>uusipaivamaara.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String uusipaivamaara() {

        if (inrarvo > 3.0 && inrarvo < 3.2 || inrarvo < 2.0 && inrarvo > 1.7) {
            return "Varaa uusi aika laboratorioon viikon sisään.";
        } else if (inrarvo == 2.0 || inrarvo == 3.0) {
            return "Varaa uusi aika laboratorioon noin kahden viikon päähän.";
        } else if (inrarvo < 3.0 && inrarvo > 2.0) {
            return "Käy laboratoriossa seuraavan kerran noin kuukauden kuluttua.";
        }
        return "Ota yhteyttä lääkäriin uuden annostuksen ja näytteenottopäivän saamiseksi.";
    }

    /**
     * <p>toString.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String toString() {
        return uusipaivamaara();

    }
}
