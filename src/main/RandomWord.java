package main;

import java.util.Random;

public class RandomWord {
	
	private String randomWord;
	
	public RandomWord () {
		
		String w1 = "b r a s i l";
		String w2 = "a r g e n t i n a";
		String w3 = "j a p a o";
		String w4 = "e s t a d o s u n i d o s";
		String w5 = "a l e m a n h a";
		String w6 = "i t a l i a";
		String w7 = "r u s s i a";
		String w8 = "a f r i c a d o s u l";
		String w9 = "e g i t o";
		String w10 = "p a r a g u a i";
		
		Random r = new Random();
		int x = r.nextInt(10) + 1;
		
		switch (x) {
		
			case 1:	this.randomWord = w1;
			break;

			case 2: this.randomWord = w2;
			break;
			
			case 3: this.randomWord = w3;
			break;
			
			case 4: this.randomWord = w4;
			break;
			
			case 5: this.randomWord = w5;
			break;
			
			case 6: this.randomWord = w6;
			break;
			
			case 7: this.randomWord = w7;
			break;
			
			case 8: this.randomWord = w8;
			break;
			
			case 9: this.randomWord = w9;
			break;
			
			case 10: this.randomWord = w10;
			break;
			
			default: System.out.println("System Error!");
			break;
		}
		
	}
	
	public String getRandomWord() {
		return this.randomWord;
	}

}
