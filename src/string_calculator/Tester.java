package string_calculator;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class Tester {

	public static void main(String[] args) {
		org.junit.runner.JUnitCore.main("string_calculator.Test");
    }
	
	@Test
	public void testNumberWithValueMoreThanThausand() {
		assertEquals(2,StringCalculator.Add("2,1001"));
	}
	
	@Test
	public void testNumberWithNegativeValue() {
		try {
			StringCalculator.Add("2,-1,-2,-3");
		}
		catch(IllegalArgumentException e) {
		assertEquals(e.getMessage(),"negative not allowed: -1, -2, -3");
	}
	}
	
	@Test
	public void testDefaultDelimiter() {
		assertEquals(6,StringCalculator.Add("1\n2,3"));
	}
	
	@Test
	public void testDelimiterWithAnyLength() {
		assertEquals(6,StringCalculator.Add("//[***]\n1***2***3"));
	}
	
	@Test
	public void testMultipleDelimiter() {	
		assertEquals(6,StringCalculator.Add("//[*][%]\n1*2%3"));
	}
	

}