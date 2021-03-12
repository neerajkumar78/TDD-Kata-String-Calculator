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
	
	

}