/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

/**
 *
 * @author 20130027
 */
public class MyPanel extends JPanel{
    public int move;
    MyPanel(){
        move=10;


    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.requestFocus(true);
        g.setColor(Color.yellow);
        g.fillRect(10, 20+move, 100, 200);
    }
    
}
