/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3player;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.player.Player;
import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackEvent;
import javazoom.jl.player.advanced.PlaybackListener;

public class Mp3Player {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //http://www.javazoom.net/javalayer/docs/docs1.0/index.html

//            Player p = new Player(new FileInputStream("Trap.mp3"));
//            p.play();
            final Scanner input = new Scanner(System.in);

            String[] musics = {"Trap_Trimed.mp3", "Trap_Trimed.mp3"};

            AdvancedPlayer advPlayer = null;

            
            for (String s : musics) {
                advPlayer = new AdvancedPlayer(new FileInputStream(s));
                advPlayer.setPlayBackListener(new PlaybackListener() {

                    @Override
                    public void playbackStarted(PlaybackEvent evt) {
                        super.playbackStarted(evt);
//                        System.out.println("Started");
                    }

                    @Override
                    public void playbackFinished(PlaybackEvent evt) {
                        super.playbackFinished(evt);
                        Global.currentFrame = evt.getFrame();
                        System.out.println("Stoped" + Global.currentFrame);
                    }

                });
//                advPlayer.play();

                ThreadPlayer threadPlayer = new ThreadPlayer(advPlayer);
                Thread t1 = new Thread(threadPlayer);
                synchronized (t1) {
                    t1.start();
                    System.out.println("1. Stop");
                    System.out.println("2. Next");
                    
                    int choice = input.nextInt();
                    //stop
                    if (choice == 1) {
                        threadPlayer.player.stop();
                        
                        choice = input.nextInt();
                        //resume
                        if (choice == 3) {
                            threadPlayer.player.play(Global.currentFrame, 1500);
                        }
                    }
                    
                    //next
                    if (choice == 2) {
                        threadPlayer.player.stop();
                    }
                    t1.wait();
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(Mp3Player.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
