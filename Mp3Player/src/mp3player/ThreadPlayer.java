/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3player;

import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

/**
 *
 * @author Khoa
 */
public class ThreadPlayer implements Runnable {

    AdvancedPlayer player;

    public ThreadPlayer(AdvancedPlayer player) {
        this.player = player;
    }

    @Override
    public void run() {
        try {
            player.play();
        } catch (JavaLayerException ex) {
            Logger.getLogger(ThreadPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

}
