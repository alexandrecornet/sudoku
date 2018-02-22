package be.steformations.sudoku;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import be.steformations.util.Scenario;
import be.steformations.util.TestScenario;

public class MainTest {

	private Scenario scenario;

	@Before
	public void before() {
		scenario = new Scenario();
		scenario.setApplication(new Runnable(){
			public void run(){
			
			Main.main(new String[0]);
			}
		
		});
		scenario.setInputs();
	}

	/**
	 * A l'ouverture de l'application affiche le titre.
	 * 
	 * <pre>
	"SUDOKU"
	"======"
	 * </pre>
	 * 
	 * , en colonne 5.
	 */
	@Test
	public void testTitre() {
		scenario.test(0, new TestScenario() {
			@Override
			public void test(String output) {
				Scanner scanner = new Scanner(output);
				Assert.assertEquals("    SUDOKU", scanner.nextLine());
				Assert.assertEquals("    ======", scanner.nextLine());
			}
		});
	}

}
