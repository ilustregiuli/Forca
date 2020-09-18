package main;

public class Forca {
	
	private String word;
	private int tries;
	
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
	
	

}
