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

    @Override
    public void run() {
         frame = new JFrame("INR-avustaja");
         frame.setPreferredSize(new Dimension(300, 150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         
        luoKomponentit(frame.getContentPane());
 
        frame.pack();
        frame.setVisible(true);
        
        
        
    }

    private void luoKomponentit(Container con) {
       frame.setLayout(new GridLayout(3, 1));
        JTextField tuloskentta = new JTextField("Tervetuloa INR-avustajaan! Anna salasana:");
        con.add(tuloskentta);
        tuloskentta.setEnabled(false);
          JTextField syotekentta = new JTextField("");
        con.add(syotekentta);
        
    }
    
        public JFrame getFrame() {
        return frame;
        }
    
}
