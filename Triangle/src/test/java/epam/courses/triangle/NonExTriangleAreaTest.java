package epam.courses.triangle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NonExTriangleAreaTest {
	Triangle tr = new Triangle(2.0, -2.0, 3.0);
	private double expected_area= 0;
	
	@Test
	public void test() {
		assertEquals(expected_area,tr.getSquare(),0.0001);	
	}

}
