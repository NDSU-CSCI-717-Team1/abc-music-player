package abc.sound;

import org.junit.Test;

import abc.player.Main;

/*
 * This contains the TestCases for testing the individual music files
 */
public class MusicTests {


    @Test
    public void testPlaySingleNote() throws InterruptedException {
        String testFileName = "sample_abc/singlenote.abc";
        Main.play(testFileName);  
        Thread.sleep(1000);
    }
    
    @Test
    public void testPlayAbcSong() throws InterruptedException {
        String testFileName = "sample_abc/abc_song.abc";
        Main.play(testFileName);  
        Thread.sleep(1000);
    }
    

    @Test
    public void testPlayMultipleVoices() throws InterruptedException {
        String testFileName = "sample_abc/fur_elise.abc";
        Main.play(testFileName);  
        Thread.sleep(1000);
    }

}