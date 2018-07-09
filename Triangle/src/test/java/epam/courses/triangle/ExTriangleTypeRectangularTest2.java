package epam.courses.triangle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExTriangleTypeRectangularTest2 {
	
	Triangle tr = new Triangle(1.0, 2.0, Math.sqrt(5));
	private int expected_type=8;
	
	@Test
	public void test() {
		assertEquals(expected_type,tr.detectTriangle());	
	}
}