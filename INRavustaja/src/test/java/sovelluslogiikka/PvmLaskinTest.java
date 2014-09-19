package sovelluslogiikka;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import inravustaja.sovelluslogiikka.PvmLaskin;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author onnikone
 */
public class PvmLaskinTest {

    PvmLaskin laskin;

    @Before
    public void setUp() {

    }

    @Test
    public void kunArvoOnTasanKolme() {
        laskin = new PvmLaskin(3.0);

        assertEquals("Varaa uusi aika laboratorioon noin kahden "
                + "viikon päähän.", laskin.toString());
    }

    @Test
    public void inrOnTasanKaksi() {
        laskin = new PvmLaskin(2.0);

        assertEquals("Varaa uusi aika "
                + "laboratorioon noin kahden viikon päähän.", laskin.toString());

    }

    @Test
    public void inrOnVahanAlleKaksi() {
        laskin = new PvmLaskin(1.9);
        assertEquals("Varaa uusi aika laboratorioon viikon sisään.", laskin.toString());
    }
    
      @Test
    public void inrOnVahanAlleKaksi2() {
        laskin = new PvmLaskin(1.8);
        assertEquals("Varaa uusi aika laboratorioon viikon sisään.", laskin.toString());
    }

    @Test
    public void inrOnVahanYliKolme() {
        laskin = new PvmLaskin(3.1);
        assertEquals("Varaa uusi aika laboratorioon viikon sisään.", laskin.toString());
    }

    @Test
    public void inrKeskivalilla() {
        laskin = new PvmLaskin(2.5);
        assertEquals("Käy laboratoriossa seuraavan kerran "
                + "noin kuukauden kuluttua.", laskin.toString());
    }

    @Test
    public void inrOnPaljonAlleKaksi() {
        laskin = new PvmLaskin(1.7);
        assertEquals("Ota yhteyttä lääkäriin uuden annostuksen "
                + "ja näytteenottopäivän saamiseksi.", laskin.toString());
    }

    @Test
    public void inrOnPaljonYliKolme() {
        laskin = new PvmLaskin(3.3);
        assertEquals("Ota yhteyttä lääkäriin uuden annostuksen"
                + " ja näytteenottopäivän saamiseksi.", laskin.uusipaivamaara());
    }

}
