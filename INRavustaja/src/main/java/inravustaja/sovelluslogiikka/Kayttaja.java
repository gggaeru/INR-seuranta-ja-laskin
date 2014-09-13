/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inravustaja.sovelluslogiikka;


/**
 *
 * @author onnikone
 */
public class Kayttaja {
    private String kayttaja;
    private String salasana;
    
    
    
    public Kayttaja(String kayttaja, String salasana){
        this.kayttaja=kayttaja;
        this.salasana=salasana;

    }
    

    public String getKayttaja(){
        return kayttaja.toString();
    }
    
    public String getSalasana(){
        return this.salasana;
    }
    
    
    
    
}
