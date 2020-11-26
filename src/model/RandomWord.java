package model;

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
		String w11 = "a r a b i a s a u d i t a";
		String w12 = "e q u a d o r";
		String w13 = "s u i c a";
		String w14 = "e s p a n h a";
		String w18 = "m o n g o l i a";
		String w15 = "c h i n a";
		String w16 = "a u s t r a l i a";
		String w17 = "m e x i c o";
		
		Random r = new Random();
		int x = r.nextInt(17) + 1;
		
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
			
			case 11:	this.randomWord = w11;
			break;

			case 12: this.randomWord = w12;
			break;
			
			case 13: this.randomWord = w13;
			break;
			
			case 14: this.randomWord = w14;
			break;
			
			case 15: this.randomWord = w15;
			break;
			
			case 16: this.randomWord = w16;
			break;
			
			case 17: this.randomWord = w17;
			break;
			
			case 18: this.randomWord = w18;
			break;
			
			default: System.out.println("System Error!");
			break;
		}
		
	}
	
	public String getRandomWord() {
		return this.randomWord;
	}

}
