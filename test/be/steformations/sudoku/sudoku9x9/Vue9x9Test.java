package be.steformations.sudoku.sudoku9x9;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

import be.steformations.util.Scenario;
import be.steformations.util.TestScenario;

public class Vue9x9Test {

	/**
	 * Vue9X9.afficheGrilleVide() affiche une grille vide d'un sudoku 9x9.
	 * 
	 * <pre>
	 * 	"      SUDOKU 9 x 9      "
	 * 	"      ============      "
	 * 	"+-------+-------+-------+"
	 * 	"| . . . | . . . | . . . |"
	 * 	"| . . . | . . . | . . . |"
	 * 	"| . . . | . . . | . . . |"
	 * 	"+-------+-------+-------+"
	 * 	"| . . . | . . . | . . . |"
	 * 	"| . . . | . . . | . . . |"
	 * 	"| . . . | . . . | . . . |"
	 * 	"+-------+-------+-------+"
	 * 	"| . . . | . . . | . . . |"
	 * 	"| . . . | . . . | . . . |"
	 * 	"| . . . | . . . | . . . |"
	 * 	"+-------+-------+-------+"
	 * </pre>
	 */
	@Test
	public void testafficheGrilleVide() {
		final Vue9X9 vue9x9 = new Vue9X9();
		Scenario scenario = new Scenario();
		scenario.setApplication(new Runnable() {

			public void run() {
				vue9x9.afficheGrilleVide();
			}
		});
		scenario.test(0, new TestScenario() {
			@Override
			public void test(String output) {
				Scanner scanner = new Scanner(output);
				Assert.assertEquals("      SUDOKU 9 x 9      ",
						scanner.nextLine());
				Assert.assertEquals("      ============      ",
						scanner.nextLine());
				Assert.assertEquals("+-------+-------+-------+",
						scanner.nextLine());
				Assert.assertEquals("| . . . | . . . | . . . |",
						scanner.nextLine());
				Assert.assertEquals("| . . . | . . . | . . . |",
						scanner.nextLine());
				Assert.assertEquals("| . . . | . . . | . . . |",
						scanner.nextLine());
				Assert.assertEquals("+-------+-------+-------+",
						scanner.nextLine());
				Assert.assertEquals("| . . . | . . . | . . . |",
						scanner.nextLine());
				Assert.assertEquals("| . . . | . . . | . . . |",
						scanner.nextLine());
				Assert.assertEquals("| . . . | . . . | . . . |",
						scanner.nextLine());
				Assert.assertEquals("+-------+-------+-------+",
						scanner.nextLine());
				Assert.assertEquals("| . . . | . . . | . . . |",
						scanner.nextLine());
				Assert.assertEquals("| . . . | . . . | . . . |",
						scanner.nextLine());
				Assert.assertEquals("| . . . | . . . | . . . |",
						scanner.nextLine());
				Assert.assertEquals("+-------+-------+-------+",
						scanner.nextLine());
			}
		});
	}
}
