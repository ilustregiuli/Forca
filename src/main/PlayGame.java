package main;

public class PlayGame {

	public static void main(String[] args) {
		Forca f = new Forca();
		RandomWord rw = new RandomWord();
		f.raffleWord(rw.getRandomWord());
	}

}
