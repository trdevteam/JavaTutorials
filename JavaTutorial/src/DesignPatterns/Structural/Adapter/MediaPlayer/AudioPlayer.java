package DesignPatterns.Structural.Adapter.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
	
	   MediaAdapter mediaAdapter; 

	   @Override
	   public void play(String audioType, String fileName) {		

	      if(audioType.equals("mp3") || audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
	         mediaAdapter = new MediaAdapter(audioType);
	         mediaAdapter.play(audioType, fileName);
	      } else{
	         System.out.println("Invalid media. " + audioType + " format not supported");
	      }
	   }   
	   
}