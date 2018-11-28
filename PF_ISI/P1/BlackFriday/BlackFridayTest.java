package BlackFriday;
import static org.junit.Assert.*;
import org.junit.*;


public class BlackFridayTest {

	@Test public void bisiestoTest()
	{
		assertTrue("BFriday",7.0==DescuentoBlackFriday.PrecioFinal(10,true));
		assertTrue("NBFriday",10.0==DescuentoBlackFriday.PrecioFinal(10, false));
		try {
			assertTrue("Menor 0",10==DescuentoBlackFriday.PrecioFinal(-10, true));	
		} catch (IllegalArgumentException e) {
			return;
		}
		fail("Valor menor de cero");
	}
}
