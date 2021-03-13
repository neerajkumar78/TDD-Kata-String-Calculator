# TDD-Kata-String-Calculator<br/>
Test Driven Development of a Java program to calculate sum of the numbers in string with given constraints. <br/>
String Calculator<br/>
 &emsp;1. In a test-first manner, create a simple class class StringCalculator
with a method public int Add(string numbers)<br/>
       &emsp;&emsp;&emsp;1. The method can take 0, 1 or 2 numbers, and will return their sum
       (for an empty string it will return 0)
       for example
       “” == 0 , “1” == 1 , “1,2” == 3<br/>
       &emsp;&emsp;&emsp;2. Start with the simplest test case of an empty string and move to one & two
       numbers<br/>
       &emsp;&emsp;&emsp;3. Remember to solve things as simply as possible so that you force yourself to
       write tests you did not think about<br/>
       &emsp;&emsp;&emsp;4. Remember to refactor after each passing test<br/><br/>
&emsp;2. Allow the Add method to handle an unknown amount of numbers<br/><br/>
&emsp;3. Allow the Add method to handle new lines between numbers (instead of commas).<br/>
      &emsp;&emsp;&emsp;1. the following input is ok: &emsp;“1\n2,3” == 6<br/>
      &emsp;&emsp;&emsp;2. the following is INVALID input so do not expect it : “1,\n” (not need to write a
      test for it)<br/><br/>
&emsp;4. Support different delimiters:
to change a delimiter, the beginning of the string will contain a separate line
that looks like this:
“//[delimiter]\n[numbers…]”
for example
“//;\n1;2” == 3
since the default delimiter is ‘;’ .
Note: All existing scenarios and tests should still be supported<br/><br/>
&emsp;5. Calling Add with a negative number will throw an exception “negatives not allowed” -
and the negative that was passed.<br/><br/>
&emsp;6. If there are multiple negatives, show all of them in the exception message<br/><br/>
&emsp;7. Using TDD, Add a method to StringCalculator
called public int GetCalledCount()
that returns how many times Add() was invoked.
&emsp;&emsp;&emsp;Remember - Start with a failing (or even non compiling) test.<br/><br/>
&emsp;8. Numbers bigger than 1000 should be ignored, for example:<br/><br/>
2 + 1001 == 2<br/><br/>
&emsp;9. Delimiters can be of any length with the following format:
“//[delimiter]\n”
for example:
“//[***]\n1***2***3” == 6<br/><br/>
&emsp;10. Allow multiple delimiters like this:
“//[delim1][delim2]\n”
for example
“//[*][%]\n1*2%3” == 6.<br/><br/>
&emsp;11. make sure you can also handle multiple delimiters with length longer than one char
for example
“//[**][%%]\n1**2%%3” == 6.<br/><br/>
OUTPUT<br/><br/>
![alt text](https://github.com/neerajkumar78/TDD-Kata-String-Calculator/blob/master/image/Capture.PNG)
