/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inravustaja.inravustaja;

import inravustaja.kayttoliittyma.GraafinenKayttoliittyma;
import inravustaja.kayttoliittyma.TesktiKayttoliittyma;

/**
 *
 * @author onnikone
 */
public class Main {
     public static void main(String[] args) throws Exception {
         
         TesktiKayttoliittyma uusiohjelma = new TesktiKayttoliittyma();
         uusiohjelma.kaynnista();
         
         GraafinenKayttoliittyma uusiliittyma = new GraafinenKayttoliittyma();
         uusiliittyma.kaynnista();
         
    }
   
}
