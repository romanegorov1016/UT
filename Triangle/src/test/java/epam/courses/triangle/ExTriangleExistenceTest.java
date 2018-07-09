package epam.courses.triangle;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ExTriangleExistenceTest {

	Triangle tr = new Triangle(1.5, 2.0, 3.0);
	
	@Test
	public void test() {
		assertTrue(tr.checkTriangle());	
	}
}
