package model;

public class Gallows {
	
	
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
