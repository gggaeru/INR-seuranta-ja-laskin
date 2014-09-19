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
public class PvmLaskin {

    private double inrarvo;

    public PvmLaskin(double inr) {
        this.inrarvo = inr;
    }

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

    public String toString() {
        return uusipaivamaara();

    }
}
