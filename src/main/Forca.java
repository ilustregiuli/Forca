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
		
//		System.out.println((this.putSpaceWord(this.word)));
//		System.out.println(this.word);
		System.out.println(this.convertChartoUnderscore(this.word));
		System.out.println(" ");
		System.out.println("Choose a letter: ");
		this.pickTheChar(this.word);
		
		
	}

/*	private String putSpaceWord(String w) {
		
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
	}	       */
	
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
		boolean continueGame = true;	// true = don't discover word / false = discover word
		
			while(this.tries < 6 && continueGame == true) {	
				String picS = sc.nextLine();	// get the option for user
				char picC = picS.charAt(0);  // put "char" of the String into var to compare
				
				boolean correct = false;
				
				for(int i =0; i < w.length(); i++) {
					
					if(picC == w.charAt(i)) {
						this.charUnder[i] = picC;
						 correct = true;
					} 
				}
				
				if (!correct){
					this.tries ++;
					if(tries == 6) {
						System.out.println("Acabaram as tentativas! Jogo encerrado!");
					} else {
						System.out.println("Letra errada!");
						System.out.println("Você tem mais " + (6 - tries) + " tentativas!");
					}
				}
				
				System.out.println(new String(charUnder));
				continueGame = false;
				for(int i = 0; i < charUnder.length; i++) {			//method for indicate victory
					if(charUnder[i] == '_') {
						continueGame = true;
						break;
					} 
				} // end For
				
				if(!continueGame) {
					System.out.println("Parabéns! Você acertou a palavra!");
				}
			}	// end While
		
		sc.close();
	}
	
}	
