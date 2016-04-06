package noppapeli3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class noppapeli {
    private JFrame f;
    private JPanel p;
    private JButton b1;
    private JButton b2;
    private JLabel label1;
    private JLabel label2;
    private JTextField field1;
    private JTextField field2;
    private JTextField field3;
        public noppapeli(){
            this.f = new JFrame("Noppapeli");
            this.p = new JPanel();
            this.b1 = new JButton("Heita noppaa");
            this.b2 = new JButton("Lopeta");
            this.label1 = new JLabel("");
            this.label2 = new JLabel("");
            
            field1  = new JTextField(7);
            field2  = new JTextField(7);
            field3  = new JTextField(20);
        }
        public void gui(){
            //frame
            Font font1 = new Font("SansSerif", Font.BOLD, 20);
            field3.setFont(font1);
            field3.setText("Arvaa noppien silmalukujen summa tahan ja heita noppaa");
            p.setBackground(Color.ORANGE);
            f.setVisible(true);
            f.setSize(600, 400);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

            //Actionlistener heita noppaa
            b1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    //JOptionPane.showMessageDialog(null, "Actionlistener toimii");
                    field2.setText("");
                    field1.setText("");
                    ArrayList<Integer> lista = new ArrayList<Integer>();
                    Random rd = new Random();
                    int random = 0;
                    int i = 0;
                    for(i=0;i<2;i++){
                        random = rd.nextInt(6)+1;
                        lista.add(random);
                        switch(random){
                            case 1:
                                if(i == 0){
                                    label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noppapeli3/1.png")));
                                    break;
                                }
                                else{
                                    label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noppapeli3/1.png")));
                                    break;
                                }
                            case 2:
                                if(i == 0){
                                    label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noppapeli3/2.png")));
                                    break;
                                }
                                else{
                                    label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noppapeli3/2.png")));
                                    break;
                                }
                            case 3:
                                if(i == 0){
                                    label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noppapeli3/3.png")));
                                    break;
                                }
                                else{
                                    label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noppapeli3/3.png")));
                                    break;
                                }
                             case 4:
                                if(i == 0){
                                    label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noppapeli3/4.png")));
                                    break;
                                }
                                else{
                                    label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noppapeli3/4.png")));
                                    break;
                                }
                            case 5:
                                if(i == 0){
                                    label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noppapeli3/5.png")));
                                    break;
                                }
                                else{
                                    label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noppapeli3/5.png")));
                                    break;
                                }
                            case 6:
                                if(i == 0){
                                    label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noppapeli3/6.png")));
                                    break;
                                }
                                else{
                                    label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noppapeli3/6.png")));
                                    break;
                                }
                        }
                    }
                    int yhteensa = (lista.get(0) + lista.get(1));
                    int luku = Integer.parseInt(field3.getText());
                    if(luku == yhteensa){
                        field1.setText("VOITIT!");
                    }
                    else{
                        field1.setText("HAVISIT.");
                    }
                    field2.setText("yhteensa: " + yhteensa);
                    lista.clear();
                    
                    field3.setText("Arvaa noppien silmalukujen summa tahan ja heita noppaa");
                }
            });
            
            field3.addFocusListener(new FocusListener(){
                public void focusGained(FocusEvent e){
                    field3.setText("");
                }
                public void focusLost(FocusEvent e) {
                    // nothing
                }
            });
           
            
            b2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.exit(0);
                }
            });
           
            //tekstikentät
            p.add(field3);
            p.add(field1);
            p.add(field2);
            
            //nappulat + nopat JPaneliin
            p.add(b1);
            p.add(b2);
            p.add(label1);
            p.add(label2);
            //JPanel kehykseen
            f.add(p);
        } 
}
