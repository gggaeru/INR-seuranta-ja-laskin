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
    }

    @Test
    public void lisaakoTietoaJaLukeekoTietoa() {
     this.seuranta.lisaaArvo("3.1", "23.09.2014", "src/testi1.txt");
     assertEquals(this.seuranta.lueEdellisetTiedot("src/testi1.txt"), 
             "Edellinen inr-arvosi oli : 3.1 pvm: 23.09.2014");
    }
 
}
