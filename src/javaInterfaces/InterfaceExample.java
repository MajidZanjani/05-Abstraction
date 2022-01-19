package javaInterfaces;

interface Song {
	void playSong();
	static String playing(String songName) {
		return songName + " is playing...";
	}
}

class Music implements Song {
	public void playSong() {
		System.out.println("Playing songs in Jazz...");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		Song song = new Music();
		
		song.playSong();
		System.out.println(Song.playing("RockMe"));
		
	}

}
