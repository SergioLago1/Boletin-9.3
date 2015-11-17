/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author slagogonzalez
 */
public class Area {

    public void calArea(){
        
        int altura= 0;
        int base=0;
       
        do{altura= Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: "));}
       
        while (altura<0);
       
        do {base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base: "));}
        
        while (base<0);
       
        JOptionPane.showMessageDialog(null,"El área es: " +(base*altura));}}
