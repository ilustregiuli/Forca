package main;

import java.io.IOException;

public class PlayGame {

	public static void main(String[] args) throws IOException {
		RandomWord rw = new RandomWord();
	//	Forca f = new Forca(rw.getRandomWord());
		Forca f = new Forca("ivoti");
	//	System.out.println(rw.getRandomWord());
		f.chooseLetter();
	}

}
