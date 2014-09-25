package sovelluslogiikka;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import inravustaja.sovelluslogiikka.Seuranta;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class SeurantaTest {

    Seuranta seuranta;

    public SeurantaTest() throws IOException {
        this.seuranta = new Seuranta();

    }

    @Before
    public void setUp() {
        this.seuranta.lisaaArvo("2.5", "24.09.2014", "src/testi1.txt");
    }

    @Test
    public void lisaakoTietoa() {
     this.seuranta.lisaaArvo("3.1", "23.09.2014", "src/testi1.txt");
     assertEquals("Edellinen inr-arvosi oli :3.1 pvm:23.09.2014", this.seuranta.lueEdellisetTiedot("src/testi1.txt"));
    }
    
    @Test
    public void lukeekoTietoa(){
        assertEquals("Edellinen inr-arvosi oli :2.5 pvm:24.09.2014", this.seuranta.lueEdellisetTiedot("src/testi1.txt"));
    }
    
 
}
