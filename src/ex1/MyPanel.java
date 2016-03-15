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
        this.addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent ke) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                if(ke.getKeyCode()==KeyEvent.VK_UP)
                {
                    move+=10;
                }
                repaint();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        });

    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.requestFocus(true);
        g.setColor(Color.yellow);
        g.fillRect(10, 20+move, 100, 200);
    }
    
}
