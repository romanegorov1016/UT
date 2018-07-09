package epam.courses.triangle;

import org.junit.Test;

public class NonExTriangleTypeTest {

	Triangle tr = new Triangle(-3.0, 2, 4);

	@Test(expected = IllegalArgumentException.class)
	public void test()throws IllegalArgumentException {
		tr.detectTriangle();
	}
}
