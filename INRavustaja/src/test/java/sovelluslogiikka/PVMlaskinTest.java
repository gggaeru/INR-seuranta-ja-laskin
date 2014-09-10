package sovelluslogiikka;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import inravustaja.sovelluslogiikka.PVMlaskin;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author onnikone
 */
public class PVMlaskinTest {

    public PVMlaskinTest() {
    }

    @Test
    public void asettaakoKonstruktorinOikein() {
        PVMlaskin ekapaiva= new PVMlaskin(1, 5, 2014);  
        String paiva=ekapaiva.toString();
        assertEquals(paiva, "1.5.2014" );
}
    }
