 
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
 
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
 
/**
 * This is an example program that demonstrates how to play back an audio file
 * using the Clip in Java Sound API.
 * @author www.codejava.net
 *
 */
public class AudioPlayer implements LineListener {
     
    /**
     * this flag indicates whether the playback completes or not.
     */
    static String resourcePath = "resources/audio/";
    static String audioFilePath;
    
    boolean playCompleted;
     
    /**
     * Play a given audio file.
     * @param audioFilePath Path of the audio file.
     */
    void play(String audioFilePath) {
        try {
            // Load from classpath (works in both JAR and development)
            InputStream audioStreamInput = AudioPlayer.class.getResourceAsStream("/" + resourcePath + audioFilePath);
            if (audioStreamInput == null) {
                throw new IOException("Resource not found: /" + resourcePath + audioFilePath);
            }
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioStreamInput);
 
            AudioFormat format = audioStream.getFormat();
 
            DataLine.Info info = new DataLine.Info(Clip.class, format);
 
            Clip audioClip = (Clip) AudioSystem.getLine(info);
 
            audioClip.addLineListener(this);
 
            audioClip.open(audioStream);
             
            audioClip.start();
             
            while (!playCompleted) {
                // wait for the playback completes
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
             
            audioClip.close();
             
        } catch (UnsupportedAudioFileException ex) {
            System.out.println("The specified audio file is not supported.");
            ex.printStackTrace();
        } catch (LineUnavailableException ex) {
            System.out.println("Audio line for playing back is unavailable.");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error playing the audio file.");
            ex.printStackTrace();
        }
         
    }
     
    /**
     * Listens to the START and STOP events of the audio line.
     */
    @Override
    public void update(LineEvent event) {
        LineEvent.Type type = event.getType();
         
        if (type == LineEvent.Type.START) {
            System.out.println("Playback started.");
             
        } else if (type == LineEvent.Type.STOP) {
            playCompleted = true;
            System.out.println("Playback completed.");
        }
 
    }
 
    public static void called(int c)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("Enter y/n to play voice of respective animal");
        char con=sc.next().charAt(0);
        if(con=='y' || con=='Y')
        {
        if(c==1)
        audioFilePath = "peacock.wav";
        else if(c==2)
        audioFilePath = "tiger.wav";
        else if(c==3)
        audioFilePath = "giraffe.wav";
        else if(c==4)
        audioFilePath = "zebra.wav";
        else if(c==5)
        audioFilePath = "nightingale.wav";
        else if(c==6)
        audioFilePath = "lion.wav";
        else if(c==7)
        audioFilePath = "crocodile.wav";
        else if(c==8)
        audioFilePath = "elephant.wav";
        else if(c==9)
        audioFilePath = "chimpanzee.wav";
        else if(c==10)
        audioFilePath = "eagle.wav";
        else if(c==11)
        audioFilePath = "rabbit.wav";
        else if(c==12)
        audioFilePath = "cat.wav";
        else if(c==13)
        audioFilePath = "koala.wav";
        else if(c==14)
        audioFilePath = "dog.wav";
        else if(c==15)
        audioFilePath = "snake.wav";
        else if(c==16)
        audioFilePath = "ostrich.wav";
    
        AudioPlayer player = new AudioPlayer();
        player.play(audioFilePath);
    }
    }
}