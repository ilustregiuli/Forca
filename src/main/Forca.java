package main;

import java.io.IOException;
import java.util.Scanner;

public class Forca {
	
	private String word;
	private int tries = 0;
	private char[] wSpace;
	
	public Forca(String word) {
		this.word = word;
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
		
	}

	private void charToSpace(String w) {
		this.wSpace = w.toCharArray();
		for(int i =0; i < w.length(); i ++) {
			if(wSpace[i] == ' ') {
				wSpace[i] = ' ';
			} else {
				wSpace[i] = '_';
			}
		}
	}	
	
	public void chooseLetter() throws IOException {
		Scanner sc = new Scanner(System.in);
		char [] wordChar = this.word.toCharArray();
		this.charToSpace(this.word); 			//this method create a blank space copy vector of "word"
		System.out.println("Choose a letter: ");
		
		while(tries < 6) {
			char c = (char) System.in.read();
			for(int i = 0; i < wordChar.length; i++) {
				if(wordChar[i] == c) {
					this.wSpace[i] = c;
				}
			}
			System.out.println(this.wSpace);
			tries += 1;
		}
	/*	while(this.tries < 6) {
			
			
			
		}		*/
		
		sc.close();
	}
	
	

}
