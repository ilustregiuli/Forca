package main;

public class Forca {
	
	private String word;
	private int tries;
	
	public Forca() {
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
	
	public String raffleWord (String word) {
		this.word = word;
		return this.word;
	}

}
