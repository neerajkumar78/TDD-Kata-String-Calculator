package string_calculator;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.TestInstance;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Tester {

	public static void main(String[] args) {
		org.junit.runner.JUnitCore.main("string_calculator.Test");
    }
	
	//Test Case for input string having number value more
	//than thausand
	@Test
	public void testNumberWithValueMoreThanThausand() {
		assertEquals(2,StringCalculator.Add("2,1001"));
	}
	
	//Test case for input string having negative numbers
	@Test
	public void testNumberWithNegativeValue() {
		try {
			StringCalculator.Add("2,-1,-2,-3");
		}
		catch(IllegalArgumentException e) {
		assertEquals(e.getMessage(),"negative not allowed: -1, -2, -3");
	}
	}
	
	//Test Case to count how many times Add has been called 
	//till now
	@Test
	public void testCalledCount() {
		assertEquals(2,StringCalculator.getCalledCount());
	}
	
	//Test Case for default delimiter
	@Test
	public void testDefaultDelimiter() {
		assertEquals(6,StringCalculator.Add("1\n2,3"));
	}
	
	//Test Case for multiple delimiter
	@Test
	public void testMultipleDelimiter() {	
		assertEquals(6,StringCalculator.Add("//[*][%]\n1*2%3"));
	}
	
	//Test Case for delimiter with any length
	@Test
	public void testDelimiterWithAnyLength() {
		assertEquals(6,StringCalculator.Add("//[***]\n1***2***3"));
	}
	
	//Test Case for multiple delimiter with any length
	@Test
	public void testMultipleDelimiterWithAnyLength() {		
		assertEquals(6,StringCalculator.Add("//[**][%%]\n1**2%%3"));
	}
	
	

}