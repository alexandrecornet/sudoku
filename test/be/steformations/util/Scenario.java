package be.steformations.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.junit.Assert;

public class Scenario {

	private int step = 0;
	private String[] input = new String[0];
	private TestScenario test;
	private ByteArrayOutputStream out = new ByteArrayOutputStream();
	private Runnable application;
	private InputStream in = new InputStream() {

		private byte[] buf = new byte[0];
		private int pos = 0;

		@Override
		public int read() throws IOException {
			while (pos >= buf.length) {
				buf = Scenario.this.nextInput().getBytes();
				pos = 0;
			}
			return buf[pos++];
		}
	};
	private int testStep;

	private String nextInput() {
		if (step >= input.length) {
			Assert.fail("Scenario is finish");
		} else if (this.step == this.testStep) {
			try {
				this.test.test(out.toString("UTF-8"));
			} catch (UnsupportedEncodingException e) {
				Assert.fail(e.getMessage());
			}
		}
		out.reset();
		return input[step++];
	}

	public void setApplication(Runnable app) {
		this.application = app;
	}

	public void test(int step, TestScenario testScenario) {
		InputStream sin = System.in;
		PrintStream sout = System.out;
		try {
			System.setIn(in);
			System.setOut(new PrintStream(out, true, "UTF-8"));
			this.step = 0;
			this.testStep = step;
			this.test = testScenario;
			if (this.application != null) {
				this.application.run();
				if (this.step == this.testStep) {
					this.test.test(out.toString("UTF-8"));
				}else if(this.step < this.input.length){
					Assert.fail("Application stop before end ("+this.step+")");
				}
			}
		} catch (UnsupportedEncodingException e) {
			Assert.fail(e.getMessage());
		} finally {
			System.setIn(sin);
			System.setOut(sout);
		}

	}

	public void setInputs(String ... inputs ) {
		this.input= inputs;
	}

}
