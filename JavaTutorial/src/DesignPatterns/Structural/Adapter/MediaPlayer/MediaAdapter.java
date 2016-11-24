package DesignPatterns.Structural.Adapter.MediaPlayer;

public class MediaAdapter implements MediaPlayer {

	   AdvancedMediaPlayer advancedMusicPlayer;

	   public MediaAdapter(String audioType){
	   
	      if(audioType.equalsIgnoreCase("vlc") ){
	         advancedMusicPlayer = new VlcPlayer();	         
	      }else if (audioType.equalsIgnoreCase("mp4")){
	         advancedMusicPlayer = new Mp4Player();
	      }else if (audioType.equalsIgnoreCase("mp3")){
		     advancedMusicPlayer = new MP3Player();
		  }		
	      
	   }

	   @Override
	   public void play(String audioType, String fileName) {
	   
	        advancedMusicPlayer.play(fileName);
	         
	   }

}