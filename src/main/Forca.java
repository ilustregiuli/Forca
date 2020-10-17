package main;

import java.util.Scanner;

public class Forca {
	
	private String word;
	private int tries = 0;
	private char[] wSpace;
	private char[] charUnder;
	private String charConverted;
	
	public Forca() {
		//method to raffle 
		RandomWord rw = new RandomWord();
		this.word = rw.getRandomWord();
		
//		System.out.println(this.word);
		this.drawGallows(0);
		this.charConverted = this.convertChartoUnderscore(this.word);
		System.out.println(" ");
		System.out.println("Choose a letter: ");
		this.pickTheChar(this.word);
		
		
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
		boolean continueGame = true;	// true = don't discover word / false = discover word
		String lettersWrongs = "";
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
					lettersWrongs = lettersWrongs +" " + picC;
					this.tries ++;
					this.drawGallows(tries);
					if(tries == 6) {
						System.out.println("Acabaram as tentativas! Jogo encerrado!");
					} else {
						System.out.println("Letra errada!");
						System.out.println("Letras já utilizadas: ");
						System.out.println(lettersWrongs);
						System.out.println("Você tem mais " + (6 - tries) + " tentativas!");
					}
				}
				
				System.out.println(new String(charUnder));
				continueGame = false;
				
				for(char cUnder : charUnder) {	//method for indicate victory
					if(cUnder == '_') {
						continueGame = true;
						break;
					}
				}
					
				if(!continueGame) {
					System.out.println("Parabéns! Você acertou a palavra!");
				}
			}	// end While
		
		sc.close();
	}
	
	public void drawGallows(int errors) {
		switch(errors) {
		case 0:
		
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
				break;
				
		case 1:		
			System.out.println("    ");
			System.out.println("																");
			System.out.println("    *************												");
			System.out.println("    *		*");
			System.out.println("    *		*");
			System.out.println("    *           00");
			System.out.println("    *          0..0");
			System.out.println("    *           **");
			System.out.println("    *");
			System.out.println("    *");
			System.out.println("    *");
			System.out.println("    *");
			System.out.println("    *");
			System.out.println("    *");
			System.out.println("    *");
			System.out.println("    *");
			System.out.println(" *********");
			break;

		
		case 2:
			System.out.println("    ");
			System.out.println("																");
			System.out.println("    *************												");
			System.out.println("    *		*");
			System.out.println("    *		*");
			System.out.println("    *           00");
			System.out.println("    *          0..0");
			System.out.println("    *           **");
			System.out.println("    *          0000");
			System.out.println("    *          0000");
			System.out.println("    *          0000");
			System.out.println("    *          0000");
			System.out.println("    *");
			System.out.println("    *");
			System.out.println("    *");
			System.out.println("    *");
			System.out.println(" *********");
			break;

			
			
		case 3:
			System.out.println("    ");
			System.out.println("																");
			System.out.println("    *************												");
			System.out.println("    *		*");
			System.out.println("    *		*");
			System.out.println("    *           00");
			System.out.println("    *          0..0");
			System.out.println("    *           **");
			System.out.println("    *         /0000");
			System.out.println("    *        / 0000");
			System.out.println("    *       /  0000");
			System.out.println("    *          0000");
			System.out.println("    *");
			System.out.println("    *");
			System.out.println("    *");
			System.out.println("    *");
			System.out.println(" *********");
			break;

			
		case 4:
			System.out.println("    ");
			System.out.println("																");
			System.out.println("    *************												");
			System.out.println("    *		*");
			System.out.println("    *		*");
			System.out.println("    *           00");
			System.out.println("    *          0..0");
			System.out.println("    *           **");
			System.out.println("    *         /0000\\");
			System.out.println("    *        / 0000 \\");
			System.out.println("    *       /  0000  \\");
			System.out.println("    *          0000");
			System.out.println("    *");
			System.out.println("    *");
			System.out.println("    *");
			System.out.println("    *");
			System.out.println(" *********");
			break;
			
		case 5:
			System.out.println("    ");
			System.out.println("																");
			System.out.println("    *************												");
			System.out.println("    *		*");
			System.out.println("    *		*");
			System.out.println("    *           00");
			System.out.println("    *          0..0");
			System.out.println("    *           **");
			System.out.println("    *         /0000\\");
			System.out.println("    *        / 0000 \\");
			System.out.println("    *       /  0000  \\");
			System.out.println("    *          0000");
			System.out.println("    *          |");
			System.out.println("    *          |");
			System.out.println("    *          |");
			System.out.println("    *         --");
			System.out.println(" *********");
			break;	
		case 6:
			System.out.println("    ");
			System.out.println("																");
			System.out.println("    *************		YOU DEAD!!!!			");
			System.out.println("    *		*");
			System.out.println("    *		*");
			System.out.println("    *           00");
			System.out.println("    *          0xx0");
			System.out.println("    *            O");
			System.out.println("    *         /0000\\");
			System.out.println("    *        / 0000 \\");
			System.out.println("    *       /  0000  \\");
			System.out.println("    *          0000");
			System.out.println("    *          |  |");
			System.out.println("    *          |  |");
			System.out.println("    *          |  |");
			System.out.println("    *         --  --");
			System.out.println(" *********");
			break;	


		}
	}
	
}	
