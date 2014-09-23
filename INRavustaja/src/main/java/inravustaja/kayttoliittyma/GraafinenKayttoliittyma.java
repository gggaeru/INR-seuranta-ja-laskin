/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inravustaja.kayttoliittyma;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author onnikone
 */
public class GraafinenKayttoliittyma {
    
    public GraafinenKayttoliittyma(){
        
    }
    
    public void kaynnista(){
                
        
    }
    
    private void luoKomponentit(Container container) {
        GridLayout layout = new GridLayout(3, 2);
        container.setLayout(layout);

        JLabel nimiTeksti = new JLabel("Nimi: ");
        JTextField nimiKentta = new JTextField();
        JLabel hetuTeksti = new JLabel("Hetu: ");
        JTextField hetuKentta = new JTextField();

        JButton lisaaNappi = new JButton("Lisää henkilö!");
        // tapahtumankuuntelija

        container.add(nimiTeksti);
        container.add(nimiKentta);
        container.add(hetuTeksti);
        container.add(hetuKentta);
        container.add(new JLabel(""));
        container.add(lisaaNappi);
    }
    
}
