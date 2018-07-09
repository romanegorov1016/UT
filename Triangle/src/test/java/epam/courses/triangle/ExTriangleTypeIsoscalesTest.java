package epam.courses.triangle;

import static org.junit.Assert.*;
import org.junit.Test;

public class ExTriangleTypeIsoscalesTest {
    	
	Triangle tr = new Triangle(1.0, 2.0, 2.0);
	private int expected_type=2;
	
	@Test
	public void test() {
		assertEquals(expected_type,tr.detectTriangle());	
	}
}