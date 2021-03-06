package source.overload;

import static def.dom.Globals.console;

public class OverloadWithAbstractClass {

	public static abstract class AbstractTest {

		public void draw(int x, int y) {
			draw(x, y, 1, -1, 1);
		}

		public abstract void draw(int i_1, int i_2, int i_3, int i_4, int i_5);

	}

	public static class AbstractTestImpl extends AbstractTest {

		@Override
		public void draw(int i_1, int i_2, int i_3, int i_4, int i_5) {
			console.log("Hello world.");
		}

	}

	public static void main(String[] args) {
		AbstractTest test = new AbstractTestImpl();
		test.draw(0, 0);
	}
}
