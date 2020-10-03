package main;

import java.util.Scanner;

public class Forca {
	
	private String word;
	private int tries = 0;
	private char[] wSpace;
	private char[] charUnder;
	
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
		
		System.out.println((this.putSpaceWord(this.word)));
		System.out.println(this.convertChartoUnderscore((this.putSpaceWord(this.word))));
		System.out.println(" ");
		System.out.println("Choose a letter: ");
		this.pickTheChar(this.word);
		
		
	}

	private String putSpaceWord(String w) {
		
		int letters = w.length() + (w.length() -1); //auxiliar var to count letters of the word plus spaces between hers (w.length -1)
		this.wSpace = new char[letters]; 			// 
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
		this.charUnder = new char[letters];
		
		for(int i =0; i < w.length(); i++) {
			char c = w.charAt(i);
			if(c != ' ') {
				this.charUnder[i] = '_';
			}
		}
		return new String(this.charUnder);
	}
	
	public void pickTheChar(String w) {
		Scanner sc = new Scanner(System.in);
		
			while(this.tries < 6) {	
				String picS = sc.nextLine();	// get the option for user
				char picC = picS.charAt(0);  // put "char" of the String into var to compare
				
				for(int i =0; i < w.length(); i++) {
					if(picC == w.charAt(i)) {
						this.charUnder[i] = w.charAt(i);
						this.charUnder[i+1] = ' ';
					} 
				}
				System.out.println(new String(charUnder));
				this.tries ++;
			}	
		
		sc.close();
	}
	
}	
