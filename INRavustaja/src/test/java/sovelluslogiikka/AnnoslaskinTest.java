/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovelluslogiikka;

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

    Annoslaskin annos;

    public AnnoslaskinTest() {
    }

    @Test
    public void inrOnLiianAlhainen() {
        annos = new Annoslaskin(1.7, 12);
        assertEquals("INR- arvosi on liian kaukana tavoitearvoista.", annos.tablettienJakoViikolle());
    }
    
      @Test
    public void inrOnLiianKorkea() {
        annos = new Annoslaskin(3.3, 12);
        assertEquals("INR- arvosi on liian kaukana tavoitearvoista.", annos.tablettienJakoViikolle());
    }

    @Test
    public void inrOnAlhainenJaMaaraParillinen() {
        annos = new Annoslaskin(1.8, 12);
        assertEquals("13,2", annos.tablettienJakoViikolle());

    }

    @Test
    public void inrOnAlhainenJaMaaraPariton() {
        annos = new Annoslaskin(1.8, 12);
        assertEquals("13,2", annos.tablettienJakoViikolle());
    }
    
       @Test
    public void inrOnSopiva() {
        annos = new Annoslaskin(2.0, 12);
        assertEquals("12,0", annos.tablettienJakoViikolle());
    }
        
           @Test
    public void inrOnKorkeaJaMaaraParillinen() {
        annos = new Annoslaskin(3.2, 12);
        assertEquals("10,8" , annos.tablettienJakoViikolle());    
    }
            @Test
    public void inrOnKorkeaJaMaaraPariton() {
        annos = new Annoslaskin(3.2, 13);
        assertEquals("11,7" , annos.tablettienJakoViikolle());    
    }
    
}
