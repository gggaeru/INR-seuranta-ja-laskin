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
public class PVMlaskin {

    private int vuosi;
    private int kk;
    private int paiva;

    public PVMlaskin(int paiva, int kk, int vuosi) {
        this.vuosi = vuosi;
        this.kk = kk;
        this.paiva = paiva;
    }

    public String uusipaivamaara() {

        int inrarvo = 23; 
        /** tähän arvo haetaan INRarvosta. En saa sitä vielä 
         * toimimaan :( 
         */
        
        if (inrarvo > 30 && inrarvo < 32 || inrarvo < 20 && inrarvo > 27) {
            return "Uusi aika varataan viikon sisään";
        } else if (inrarvo == 20 || inrarvo == 30) {
            return "Uusi aika varataan kahden viikon päähän";
        } else if (inrarvo < 30 && inrarvo > 20) {
            return "uusi aika varataan kuukauden päähän";
        }
        return "Ota yhteyttä lääkäriin";
    }

}
