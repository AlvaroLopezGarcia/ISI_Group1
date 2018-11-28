import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class RomanNumeralTest
{
<<<<<<< HEAD
	private String word;   // Test fixture
	private RomanNumeral number;

   @Before      // Set up - Called before every test method.
   public void setUp()
   {
	  number = new RomanNumeral();
      word = new String();
   }

   @After      // Tear down - Called after every test method.
   public void tearDown()
   {
	  number = null;
      word = null;  // redundant in this example!
   }
=======

	private RomanNumeral number;

	@Before      // Set up - Called before every test method.
	public void setUp()
	{
		number = new RomanNumeral();
	}

	// Test para String nulo
	@Test (expected = IllegalArgumentException.class)
	public void testForNullString()
	{
		number.convierte("");
	}

	// Test para String ilegal
	@Test (expected = IllegalArgumentException.class)
	public void testForNoRoman()
	{
		number.convierte("HJK");
	}

	// Test para String ilegal (pero parecido a romano)
	// @Test (expected = IllegalArgumentException.class)
	// public void testForIllegalRoman()
	// {
	// 	number.convierte("XIIII");
	// }
>>>>>>> fead333c16eaadf59bddd6f25c41e956e8905417

	@Test
<<<<<<< HEAD
   public void testForNull()
   {
      word = null;
         number.convierte (word);
   }
   
  /* @Test (expected = IllegalArgumentException.class)
   public void testEmptyList()
   {
      RomanNumeral.convierte(word);
   }*/
   
   @Test (expected = IllegalArgumentException.class)
   @SuppressWarnings ("unchecked")
   public void testMutuallyIncomparable()
   {
   	word = "II1";
      number.convierte (word);
   }
   
   @Test (expected = ClassCastException.class)
   @SuppressWarnings ("unchecked")
   public void testcuatroI()
   {
   	word = "IIII";
      number.convierte (word);
   }
   
   @Test (expected = ClassCastException.class)
   @SuppressWarnings ("unchecked")
   public void testcuatroC()
   {
   	word = "CCCC";
      number.convierte (word);
   }
   
   @Test (expected = ClassCastException.class)
   @SuppressWarnings ("unchecked")
   public void testcuatroX()
   {
   	word = "XXXX";
      number.convierte (word);
   }
   
   @Test (expected = ClassCastException.class)
   @SuppressWarnings ("unchecked")
   public void testdosL()
   {
   	word = "LL";
      number.convierte (word);
   }
   
   @Test (expected = ClassCastException.class)
   @SuppressWarnings ("unchecked")
   public void testdosV()
   {
   	word = "VV";
      number.convierte (word);
   }
   
   @Test (expected = ClassCastException.class)
   @SuppressWarnings ("unchecked")
   public void testdosD()
   {
   	word = "DD";
      number.convierte (word);
   }
   
=======
	public void testForRoman()
	{
		assertTrue("Ese numero no es romano", 17 == number.convierte("XVII")); // Se imprimirá este msg si test falla
	}

>>>>>>> fead333c16eaadf59bddd6f25c41e956e8905417
}
