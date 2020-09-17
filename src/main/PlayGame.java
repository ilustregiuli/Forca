package main;

public class PlayGame {

	public static void main(String[] args) {
		RandomWord rw = new RandomWord();
		Forca f = new Forca(rw.getRandomWord());
		System.out.println(rw.getRandomWord());
	}

}
