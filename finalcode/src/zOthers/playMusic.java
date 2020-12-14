/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zOthers;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;


/**
 *
 * @author admin
 */
public class playMusic {
    public static void play(String path) throws FileNotFoundException, IOException{
        //"src/zOthers/alert.wav"
        File f=new File(path);
        URI uri=f.toURI();
        URL url;
        AudioClip ac;
        try {
            url=uri.toURL();          
            ac=Applet.newAudioClip(url);
            ac.play();
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } 
    }
}
