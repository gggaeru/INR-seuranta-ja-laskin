/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import inravustaja.sovelluslogiikka.IRNarvo;
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
public class IRNarvoTest {
    
    private double luku;

    public IRNarvoTest() {
     this.luku=2.3;
    }

    @BeforeClass
    public static void setUpClass() {   

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void getINRarvoTest() {
            
     new IRNarvo();
    }
}
