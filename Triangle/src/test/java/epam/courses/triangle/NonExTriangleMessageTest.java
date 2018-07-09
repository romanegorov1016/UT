package epam.courses.triangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class NonExTriangleMessageTest {

	Triangle tr = new Triangle(-3.0, 2.0, 3.0);
	private String expected_message= "a<=0";
	
	@Test
	public void test() {
		tr.checkTriangle();
		assertEquals(expected_message, tr.getMessage());	
	}
}
