package be.steformations.sudoku.menu;

public class Item {
	String cle;
	String libel;
	public Item(String string, String string2) {
		cle = string;
		libel = string2;
	}

	public String getKey() {
		
		return cle;
	}

	public String getLibel() {
		
		return libel;
	}

}
