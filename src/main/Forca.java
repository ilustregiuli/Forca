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
		System.out.println((this.putSpaceWord(this.word)));
		System.out.println(this.convertChartoUnderscore((this.putSpaceWord(this.word))));
		
	}

	private String putSpaceWord(String w) {
		
		int letters = w.length() + (w.length() -1);
		this.wSpace = new char[letters];
		int nextPos = 0;
		
		for(int i = 0; i < w.length(); i ++) { //"for" to run characters of the word
			
			char c = w.charAt(i);		// "c" is the letter in word character "i"
			
			if(c != ' ') {				//if "c" not blank
				wSpace[nextPos] = c;	// new vector in "i" position gets "c"
				nextPos ++;				// and then "nextPos" go to the next for don't repeat same letter
			}
				if(nextPos < letters) {		// if next position smaller than number of letters
					wSpace[nextPos] = ' ';  // next position gets a space blank to separated letters
					nextPos ++;
				}
			} 
		
		return new String(wSpace);
	}	
	
	public String convertChartoUnderscore(String w) {
		int letters = w.length();
		char [] charUnder = new char[letters];
		
		for(int i =0; i < w.length(); i++) {
			char c = w.charAt(i);
			if(c != ' ') {
				charUnder[i] = '_';
			}
		}
		return new String(charUnder);
		
	}
	
}	
