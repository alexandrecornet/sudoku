package be.steformations.sudoku.menu;

import org.junit.Assert;
import org.junit.Test;

public class ItemTest {

	/**
	 * Test qu'un item de menu peut être créé avec une clé et un libellé.
	 */
	@Test
	public void testConstructeur1(){
		Item item = new Item("a", "libellé 1");
		Assert.assertEquals("a", item.getKey());
		Assert.assertEquals("libellé 1", item.getLibel());
	}
	@Test
	public void testConstructeur2(){
		Item item = new Item("b", "libellé 2");
		Assert.assertEquals("b", item.getKey());
		Assert.assertEquals("libellé 2", item.getLibel());
	}
}
