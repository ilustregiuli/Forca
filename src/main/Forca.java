package main;

import java.io.IOException;
import java.util.Scanner;

public class Forca {
	
	private String word;
	private int tries = 0;
	private char[] wSpace;
	
	public Forca() {
		// draw the gallows
		System.out.println("    ");
		System.out.println("																");
		System.out.println("    *************												");
		System.out.println("    *		*");
		System.out.println("    *		*");
		System.out.println("    *");
		System.out.println("    *");
		System.out.println("    *");
		System.out.println("    *");
		System.out.println("    *");
		System.out.println("    *");
		System.out.println("    *");
		System.out.println("    *");
		System.out.println(" *********");
		//method to raffle 
		RandomWord rw = new RandomWord();
		this.word = rw.getRandomWord();
		System.out.println("Choose a letter: ");
		System.out.println((this.charToSpace(this.word)));
		
	}

	private String charToSpace(String w) {
		
		int letters = w.length() + (w.length() -1);
		this.wSpace = new char[letters];
		int nextPos = 0;
		int tamanho = w.length();
		for(int i = 0; i < w.length(); i ++) {
			
			char c = w.charAt(i);
			
			if(c != ' ') {
				wSpace[nextPos] = c;
				nextPos ++;
			}
				if(nextPos < letters) {
					wSpace[nextPos] = ' ';
					nextPos ++;
				}
			} 
		
		return new String(wSpace);
	}	
	
}	
