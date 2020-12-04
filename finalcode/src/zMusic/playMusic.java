/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zMusic;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author admin
 */
public class playMusic {
    public static void play() throws FileNotFoundException, IOException{
        FileInputStream fileau=new FileInputStream("C:/Users/admin/Desktop/Finalproject/Finalproject/finalcode/src/alert.wav");
        AudioStream as=new AudioStream(fileau);
        AudioPlayer.player.start(as);
    }
}
