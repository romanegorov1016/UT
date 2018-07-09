package epam.courses.triangle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExTriangleTypeEquilateralTest {

	Triangle tr = new Triangle(3.0, 3.0, 3.0);
	private int expected_type=3; //Комбинация признаков
	
	@Test
	public void test() {
		assertEquals(expected_type,tr.detectTriangle());	
	}
}
