package be.steformations.sudoku.menu;

import java.util.ArrayList;

public class Menu {
	// CECI EST DU BRICOLAGE A REFAIRE !!!
	
	ArrayList al;
	int i;
	public Menu(){

	  al = new ArrayList();
	  i = 0;
	}
	public void add(Item item1) {
		
		
		al.add(item1.getKey());
		al.add(item1.getLibel());
		al.add(item1);
		
		
	}

	public Object getItem(String string) {
		int pos = 0;
		for(int i = 0; i < al.size(); i= i+3 ){
			if(al.get(i) == string){
				pos = i+2;
			}	
		}
		return al.get(pos);
	}

}
