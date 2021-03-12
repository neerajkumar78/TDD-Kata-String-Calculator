package string_calculator;
import java.util.regex.*;
import static java.util.Arrays.stream;
import java.util.*;
public class StringCalculator {
	static int called_count=0;
public static int Add(String numbers) {
	called_count = called_count+1;
	if(numbers.length()==0) {
		return 0;
	}
	else {
		PatternMatcher pm = PatternMatcher.populate(numbers);
		String[] allNumbers = pm.getNumbers().split(pm.getMatchingString()); 
		//System.out.println(pm.getNumbers()+ " "+pm.getMatchingString());
		List<String> list = new ArrayList<String>();

	    for(String s : allNumbers) {
	       if(s != null && s.length() > 0) {
	          list.add(s);
	       }
	    }

	    allNumbers = list.toArray(new String[list.size()]);
	    //return Arrays.toString(allNumbers);
	    int sum=0;
	    String negValue="";
	    boolean flag = true;
        for(String ele:allNumbers) {
        	int value = Integer.parseInt(ele);
        	if(value<0 && flag) {
        		negValue=negValue+ele;
        		flag=false;
        	}
        	else if(value<0) {
        		negValue=negValue+", "+ele;
        	}
        	else {
        	sum=sum+(value>=1000?0:value);
        	}
        	
        }
//        if(negValue.length()!=0) {
//        	throw new IllegalArgumentException("negative not allowed: "+negValue);
//        }
        return sum;
	   
	}
	 
}
public static int getCalledCount() {
	return called_count;
}
}
