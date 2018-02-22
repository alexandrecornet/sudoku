package be.steformations.sudoku.sudkuEtoile;

public class VueEtoile {
	public void afficheGrilleVide(){
		System.out.println("                      SUDOKU ETOILE                      ");
		System.out.println("                      =============                      ");
		for( int j =0; j<2; j++)
		{
			System.out.println("+-------+-------+-------+       +-------+-------+-------+");
			for(int i=0; i<3 ; i++){
				System.out.println("| . . . | . . . | . . . |       | . . . | . . . | . . . |");
			}
		}
		System.out.println("+-------+-------+-------+-------+-------+-------+-------+");
		
		for(int i=0; i<3 ; i++){
			System.out.println("| . . . | . . . | . . . | . . . | . . . | . . . | . . . |");
		}
		
		System.out.println("+-------+-------+-------+-------+-------+-------+-------+");
		
		for(int i=0; i<3 ; i++){
			System.out.println("                | . . . | . . . | . . . |                ");
		}
		
		System.out.println("+-------+-------+-------+-------+-------+-------+-------+");
		
		for(int i=0; i<3 ; i++){
			System.out.println("| . . . | . . . | . . . | . . . | . . . | . . . | . . . |");
		}
		System.out.println("+-------+-------+-------+-------+-------+-------+-------+");
		
		for(int i=0; i<3 ; i++){
			System.out.println("| . . . | . . . | . . . |       | . . . | . . . | . . . |");
		}
		
		System.out.println("+-------+-------+-------+       +-------+-------+-------+");
		
		
		for(int i=0; i<3 ; i++){
			System.out.println("| . . . | . . . | . . . |       | . . . | . . . | . . . |");
		}
		
		System.out.println("+-------+-------+-------+-------+-------+-------+-------+");
		
	}
}
