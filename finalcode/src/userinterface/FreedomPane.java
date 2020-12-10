/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import java.awt.Graphics;
import java.io.File;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class FreedomPane extends JPanel{
    private String path;
    public FreedomPane(String path){
        this.path=path;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        ImageIcon icon;
        try {
            icon = new ImageIcon(new File(path).toURI().toURL());
            g.drawImage(icon.getImage(),0,0,getWidth(),getHeight(),this);  
        } catch (MalformedURLException ex) {
            Logger.getLogger(FreedomPane.class.getName()).log(Level.SEVERE, null, ex);
        }
                  
    }
}
