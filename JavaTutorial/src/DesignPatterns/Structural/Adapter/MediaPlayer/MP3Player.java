package DesignPatterns.Structural.Adapter.MediaPlayer;

public class MP3Player implements AdvancedMediaPlayer{

	@Override
	public void play(String fileName) {
		System.out.println("Playing mp3 file. Name: " + fileName);			
	}

}
