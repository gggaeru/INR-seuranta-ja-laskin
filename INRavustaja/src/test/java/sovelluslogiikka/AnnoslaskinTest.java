package sovelluslogiikka;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import inravustaja.sovelluslogiikka.Annoslaskin;
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
public class AnnoslaskinTest {
    
    Annoslaskin laskin;
    
    public AnnoslaskinTest() {       
    }
    
    @Before
    public void setUp()  {
     laskin = new Annoslaskin(2.0, 12.0);      
    }
    
    @Test
    public void toimiikoKonstruktoriOikein(){
      
    }
}
