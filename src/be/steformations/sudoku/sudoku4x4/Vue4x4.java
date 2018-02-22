package be.steformations.sudoku.sudoku4x4;

public class Vue4x4 {
	public void afficheGrilleVide(){
		System.out.println(" SUDOKU 4 x 4");
		System.out.println(" ============");
		for( int j =0; j<2; j++)
		{
			System.out.println("+-----+-----+");
			for(int i=0; i<2 ; i++){
				System.out.println("| . . | . . |");
			}
		}
		System.out.println("+-----+-----+");
		
		
	}
}
