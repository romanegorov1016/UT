package epam.courses.triangle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExTriangleTypeRegularTest {

	Triangle tr = new Triangle(1.0, 2.0, 3.0);
	private int expected_type=4; 
	
	@Test
	public void test() {
		assertEquals(expected_type,tr.detectTriangle());	
	}
}
