/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex1;

import javax.swing.JFrame;

/**
 *
 * @author 20130027
 */
public class Ex1 extends JFrame{

    MyPanel mp;
    
    Ex1(){
        this.setBounds(10, 20, 800, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mp=new MyPanel();
        this.add(mp);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ex1 e= new Ex1();
        e.setVisible(true);
        //Ex1 e1= new Ex1();
        //e1.setVisible(true);
    }
    
}
