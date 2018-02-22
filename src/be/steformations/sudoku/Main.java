package be.steformations.sudoku;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("          SUDOKU        ");
		System.out.println("          ======        ");
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
