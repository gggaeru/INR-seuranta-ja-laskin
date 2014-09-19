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
    private Lukija lukija;
    
    
    public Kayttaja(String kayttaja, String salasana){
        this.kayttaja=kayttaja;
        this.salasana=salasana;

    }
    
    public void kaynnisty(){
        System.out.println("Hei " + this.kayttaja + "!");
        System.out.println("Anna salasanasi:");
        String yritys = lukija.lueMerkkijono();
        while(true){
        if(yritys.equals(this.salasana)){
            break;
        }
            System.out.println("Antamasi salasana oli väärin, yritä uudelleen:");
            yritys = lukija.lueMerkkijono();
            }
    }
    

    public String getKayttaja(){
        return kayttaja.toString();
    }
    
    public String getSalasana(){
        return this.salasana;
    }
    
    
    
    
}
