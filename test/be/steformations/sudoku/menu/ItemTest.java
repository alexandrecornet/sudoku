package be.steformations.sudoku.menu;

import org.junit.Assert;
import org.junit.Test;

public class ItemTest {

	/**
	 * Test qu'un item de menu peut �tre cr�� avec une cl� et un libell�.
	 */
	@Test
	public void testConstructeur1(){
		Item item = new Item("a", "libell� 1");
		Assert.assertEquals("a", item.getKey());
		Assert.assertEquals("libell� 1", item.getLibel());
	}
	@Test
	public void testConstructeur2(){
		Item item = new Item("b", "libell� 2");
		Assert.assertEquals("b", item.getKey());
		Assert.assertEquals("libell� 2", item.getLibel());
	}
}
