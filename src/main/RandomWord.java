package main;

import java.util.Random;

public class RandomWord {
	
	private String randomWord;
	
	public RandomWord () {
		
		String w1 = "brasil";
		String w2 = "argentina";
		String w3 = "japao";
		String w4 = "estados unidos";
		String w5 = "alemanha";
		String w6 = "italia";
		String w7 = "russia";
		String w8 = "africa do sul";
		String w9 = "egito";
		String w10 = "paraguai";
		
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
