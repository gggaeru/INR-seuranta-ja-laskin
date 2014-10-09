/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inravustaja.kayttoliittyma;
import inravustaja.sovelluslogiikka.*;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
/**
 *
 * @author onnikone
 */
public class GraafinenKayttoliittyma implements Runnable{
    
     private JFrame frame; 
    private Object container;

    @Override
    public void run() {
         frame = new JFrame("INR-avustaja");
         frame.setPreferredSize(new Dimension(300, 150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         
         try {
             luoKomponentit(frame.getContentPane());
         } catch (IOException ex) {
             Logger.getLogger(GraafinenKayttoliittyma.class.getName()).log(Level.SEVERE, null, ex);
         }
 
        frame.pack();
        frame.setVisible(true);
        
        
        
    }

    private void luoKomponentit(Container con) throws IOException {
       frame.setLayout(new GridLayout(3, 1));
        JTextField tuloskentta = new JTextField("Tervetuloa INR-avustajaan! Anna salasana:");
        con.add(tuloskentta);
        tuloskentta.setEnabled(false);
          JTextField syotekentta = new JTextField("");
        con.add(syotekentta);
        
         JButton uusiarvo = new JButton("Uusi arvo");
        JButton tarkasta = new JButton("Tarkasta edellinen");
        JButton ok = new JButton("Ok");
        JButton eitallenna = new JButton("Ei tallenna");
         
        
         Tapahtumakuuntelija kasittelija = new Tapahtumakuuntelija(uusiarvo, tarkasta, ok, eitallenna, tuloskentta, syotekentta);
         
        uusiarvo.addActionListener(kasittelija);
        tarkasta.addActionListener(kasittelija);
        ok.addActionListener(kasittelija);
       
        JPanel paneli = new JPanel(new GridLayout(1, 3));
        paneli.add(uusiarvo);
        paneli.add(tarkasta);
        paneli.add(ok);
        
    }
    
        public JFrame getFrame() {
        return frame;
        }
    
}
