package be.steformations.sudoku.menu;


import org.junit.Assert;
import org.junit.Test;

public class MenuTest {

	/**
	 * Test que les items d'un menu sont r�cup�rables via leur cl�.
	 */
	@Test
	public void testGetItem(){
		Menu menu = new Menu();
		Item item1 = new Item("a","lib 1");
		menu.add(item1);
		Item item2 = new Item("c","lib 2");
		menu.add(item2);
		Item item3 = new Item("z","lib 3");
		menu.add(item3);
		Item item4 = new Item("b","lib 4");
		menu.add(item4);
		Assert.assertSame(item1, menu.getItem("a"));
		Assert.assertSame(item4, menu.getItem("b"));
		Assert.assertSame(item3, menu.getItem("z"));
		Assert.assertSame(item2, menu.getItem("c"));
	}
}
