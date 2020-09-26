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
	
/*	public void chooseLetter() throws IOException {
		Scanner sc = new Scanner(System.in);
		char [] wordChar = this.word.toCharArray();
		this.charToSpace(this.word); 			//this method create a blank space copy vector of "word"
		
		
		while(tries < 6) {
			char c = (char) System.in.read();
			for(int i = 0; i < wordChar.length; i++) {
				if(wordChar[i] == c) {
					this.wSpace[i] = c;
				}
			}
			System.out.println(this.wSpace);
			tries += 1;
		}  		*/

	
	

}
