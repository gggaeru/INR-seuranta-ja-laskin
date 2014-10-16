/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inravustaja.inravustaja;

import inravustaja.kayttoliittyma.TekstiKayttoliittyma;
import javax.swing.SwingUtilities;

/**
 * <p>Main class.</p>
 *
 * @author onnikone
 * @version $Id: $Id
 */
public class Main {
     /**
      * <p>main.</p>
      *
      * @param args an array of {@link java.lang.String} objects.
      * @throws java.lang.Exception if any.
      */
     public static void main(String[] args) throws Exception {
                 
          TekstiKayttoliittyma uusiliittyma = new TekstiKayttoliittyma();
          uusiliittyma.kaynnista();
          
         
    }
   
}
