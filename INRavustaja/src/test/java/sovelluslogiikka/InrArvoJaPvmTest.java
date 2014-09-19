/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovelluslogiikka;

import inravustaja.sovelluslogiikka.InrArvoJaPvm;
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
public class InrArvoJaPvmTest {
    
    InrArvoJaPvm testi;

    public InrArvoJaPvmTest() {
    }

    @Before
    public void setUp() {
        testi = new InrArvoJaPvm(2.4, "01.04.2014");
    }
    
    @Test
    public void inrGetteriToimii(){
        assertEquals(2,4, this.testi.getInrArvo());        
    }
    
    @Test
    public void pvmGetterToimii(){
        assertEquals("01.04.2014", this.testi.getPvm());
    }

}
