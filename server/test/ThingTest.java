import static org.junit.Assert.*;

import org.junit.Test;

public class ThingTest {

	@Test
	public void test() {
		Thing test = new Thing("Billy");
		
		assertEquals(0, test.getNum());
		assertEquals("Billy", test.getName());
	}

	@Test
    public void testInc() {
		Thing test = new Thing("Billy");
        test.incNum();
		assertEquals(1, test.getNum());
        test.incNum();
		assertEquals(2, test.getNum());
    }

	@Test
    public void testName() {
		Thing test = new Thing("Billy");
        test.setName("Bob");
		assertEquals("Bob", test.getName());
    }

}
