package string_calculator;
import java.util.Arrays;
import java.util.regex.*;
public class PatternMatcher {
private static final String DEFAULT_REGEXP="[,\n]";
private static final Pattern GENERAL_REGEXP= Pattern.compile("//(.*)\n(.*)");
private static String matchingRegExp;
private static String numbers;
public PatternMatcher(String numbers, String matchingRegExp) {
	this.numbers = numbers;
	this.matchingRegExp=matchingRegExp;	
}

String getNumbers() {
	return numbers;
}

String getMatchingString() {
	return Arrays.toString(matchingRegExp.split("[\\[\\]]"));
}

public static PatternMatcher populate(String inputString) {
	if (inputString.startsWith("//")) {
	    final Matcher matcher = GENERAL_REGEXP.matcher(inputString);
	    if (matcher.find()) {
	        return new PatternMatcher(matcher.group(2), matcher.group(1));
	    }
	    else {
	        throw new IllegalArgumentException("Invalid Input: " + inputString);
	    }
	} 
	else {
	    return new PatternMatcher(inputString, DEFAULT_REGEXP);
	}
}
} 
