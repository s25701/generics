
package main.test.eu.glowacki.unitTesting.test;
import main.java.eu.glowacki.unitTesting.Dummy;
import org.junit.*;


public final class DummyTest {

	private Dummy _dummy;
	
	@Before
	public void before() {
		//
		_dummy = new Dummy();
	}
	
	@Test
	public void returnsOne() {
		//
		Assert.assertEquals(1, _dummy.returnsOne());
		Assert.assertNotEquals(2, _dummy.returnsOne());
		Assert.assertTrue(_dummy.returnsOne() == 1);
		Assert.assertFalse(_dummy.returnsOne() == 2);
		//Assert.fail();
	}
}