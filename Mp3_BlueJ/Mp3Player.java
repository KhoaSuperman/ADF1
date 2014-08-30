
import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackEvent;
import javazoom.jl.player.advanced.PlaybackListener;

public class Mp3Player
{
   public static void main(String[] args){
       try {
//            Player p = new Player(new FileInputStream("Trap.mp3"));
//            p.play();

            String[] musics = {"Trap_Trimed.mp3", "Trap_Trimed.mp3"};

            AdvancedPlayer advPlayer = null;
            
            for (String s : musics) {
                advPlayer = new AdvancedPlayer(new FileInputStream(s));
                advPlayer.setPlayBackListener(new PlaybackListener() {

                    @Override
                    public void playbackStarted(PlaybackEvent evt) {
                        super.playbackStarted(evt);
                        System.out.println("Played");
                    }

                    @Override
                    public void playbackFinished(PlaybackEvent evt) {
                        super.playbackFinished(evt);
                        System.out.println("Stoped");
                    }

                });
                advPlayer.play();

            }

        } catch (Exception ex) {
            Logger.getLogger(Mp3Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
