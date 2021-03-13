package string_calculator;
import java.util.regex.*;
import static java.util.Arrays.stream;
import java.util.*;

public class StringCalculator {
	
	//called_count hold the value that how many times
	//Add is called
	static int called_count = 0;

	public static int Add(String numbers) {
		called_count = called_count + 1;
		
		//if length of input string is zero,
		//then return zero
		if(numbers.length() == 0) {
			return 0;
		}
		else {
			PatternMatcher pm = PatternMatcher.populate(numbers);
			
			String[] allNumbers = pm.getNumbers().split(pm.getMatchingString()); 
			
			//creating list to remove null strings
			List<String> list = new ArrayList<String>();
	
		    for(String s : allNumbers) {
		       if(s != null && s.length() > 0) {
		          list.add(s);
		       }
		    }
	
		    allNumbers = list.toArray(new String[list.size()]);
		   
		    int sum = 0;
		    String negValue = "";
		    boolean flag = true;
		    
		    //traverse array containing all numbers in
		    //string type
	        for(String ele:allNumbers) {
	        	int value = Integer.parseInt(ele);
	        	
	        	//if value is negative and come first time then 
	        	//cancatenate to negValue
	        	if(value < 0 && flag) {
	        		negValue = negValue + ele;
	        		flag=false;
	        	}
	        	else if(value<0) {
	        		negValue = negValue + ", " + ele;
	        	}
	        	else {
	        	sum=sum + (value > 1000 ? 0 : value);
	        	}
	        	
	        }
	        
	        //if negative number exists throw exception
	        if(negValue.length() != 0) {
	        	throw new IllegalArgumentException("negative not allowed: "+negValue);
	        }
	        return sum;
	   
	}
	 
}
public static int getCalledCount() {
	return called_count;
}
}
