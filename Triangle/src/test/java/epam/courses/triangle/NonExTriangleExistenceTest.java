package epam.courses.triangle;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class NonExTriangleExistenceTest {

	Triangle tr = new Triangle(1.0, 2.0, 3.0);
	
	@Test
	public void test() {
		assertFalse(tr.checkTriangle());	
	}
}
