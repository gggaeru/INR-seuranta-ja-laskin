package sovelluslogiikka;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import inravustaja.sovelluslogiikka.Kayttaja;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author onnikone
 */
public class KayttajaTest {
    
    Kayttaja kayttaja;
    
    public KayttajaTest() {
        
        this.kayttaja= new Kayttaja("Risto", "kukkakaali");
    }

    
    @Test
    public void virheellinenSalasana(){
        
    }
    
    public void oikeaSalasana(){
        
    }

   
}
