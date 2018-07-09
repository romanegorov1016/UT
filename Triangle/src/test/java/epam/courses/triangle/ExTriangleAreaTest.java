package epam.courses.triangle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExTriangleAreaTest {
	
	Triangle tr = new Triangle(3.0, 3.0, 2.0);
	private double expected_area= 2.8284;
	
	@Test
	public void test() {
		assertEquals(expected_area,tr.getSquare(),0.0001);	
	}
}
