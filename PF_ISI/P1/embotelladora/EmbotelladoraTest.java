package embotelladora;
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



public class EmbotelladoraTest {
	


	@Test public void allOK()
	{
		test=new embotelladora();
		assertTrue("Error allOk", 2==test.calculaBotellasPequenas(2,3,17));
		assertTrue("Error allOk", 0==test.calculaBotellasPequenas(1,5,20));
		assertTrue("Error allOk", 7==test.calculaBotellasPequenas(9,2,17));
	}
	
	@Test public void negativeBig()
	{
		assertTrue("Error negativeBig", -1==test.calculaBotellasPequenas(2,-3,17));
	}
	
	@Test public void negativeLittle()
	{
		assertTrue("Error negativeLittle", -1==test.calculaBotellasPequenas(2,3,-17));
	}
	
	@Test public void negativeLiters()
	{
		assertTrue("Error negativeLiters", -1==test.calculaBotellasPequenas(2,3,-17));
	}
	
	@Test public void notEnoughLittle()
	{
		assertTrue("Error notEnoughLittle", -1==Embotelladora.calculaBotellasPequenas(2,0,10));
	}
	
	@Test public void notEnoughLittle()
	{
		assertTrue("Error notEnoughLittle", -1==Embotelladora.calculaBotellasPequenas(2,0,10));
	}
	
	
}
