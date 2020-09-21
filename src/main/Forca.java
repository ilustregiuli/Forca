package main;

import java.io.IOException;
import java.util.Scanner;

public class Forca {
	
	private String word;
	private int tries = 0;
	
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
		System.out.println(this.charToSpace(word));
	}

	private String charToSpace(String w) {
		char [] wSpace = w.toCharArray();
		for(int i =0; i < w.length(); i ++) {
			if(wSpace[i] == ' ') {
				wSpace[i] = ' ';
			} else {
				wSpace[i] = '_';
			}
		}
		String s = new String(wSpace);
		return s;
	}
	
	public void chooseLetter() throws IOException {
		Scanner sc = new Scanner(System.in);
		char [] wordChar = this.word.toCharArray();
		while(this.tries < 6) {
			System.out.println("Choose a letter: ");
			char c = (char) System.in.read();
			for(int i = 0; i < wordChar.length; i++) {
				if(wordChar[i] == c) {
					
				}
			}
		}
		
		sc.close();
	}
	
	

}
