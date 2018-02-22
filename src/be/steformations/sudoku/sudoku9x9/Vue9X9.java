package be.steformations.sudoku.sudoku9x9;

public class Vue9X9 {

	public void afficheGrilleVide(){
		System.out.println("      SUDOKU 9 x 9      ");
		System.out.println("      ============      ");
		for( int j =0; j<3; j++)
		{
			System.out.println("+-------+-------+-------+");
			for(int i=0; i<3 ; i++){
				System.out.println("| . . . | . . . | . . . |");
			}
		}
		System.out.println("+-------+-------+-------+");
		
		
	}
}
