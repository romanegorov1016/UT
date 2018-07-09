package epam.courses.triangle;

import org.junit.Test;

public class NonExTriangleAriphmeticExpTest {
	
	double inf = Double.POSITIVE_INFINITY;
	Triangle tr = new Triangle(inf, inf, inf);

	@Test(expected = ArithmeticException.class)
	public void test()throws ArithmeticException {
		tr.getSquare();
	}
}
