package epam.courses.triangle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExTriangleTypeRectangularTest {
	
	Triangle tr = new Triangle(3.0, 4.0, 5.0);
	private int expected_type=8;
	
	@Test
	public void test() {
		assertEquals(expected_type,tr.detectTriangle());	
	}
}
