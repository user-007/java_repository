package org.example;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
public class TestPalindrome{
    public static void checkPalindrom(){
        String x  = "A2";
        Task task = new Task();
       assertTrue("Is palindrome",task.isPalindrome(x));
       assertFalse("Not palindrome",task.isPalindrome(x));
    }
    public static void checkText() {
        String s  = "Test";
        Task task2 = new Task();
        assertTrue("This is text",task2.isText(s));
        assertFalse("This is not text",task2.isText(s));
        //return false;
    }

    public static void checkNumber() {
        String x = "";
        Task task = new Task();
        assertTrue("This is number",task.isNumber(x));
        assertFalse("This is not number",task.isNumber(x));
    }
    public static void checkEmpty() {
        String x = "";
        Task task = new Task();
        assertTrue("This is empty",task.isEmpty(x));
        assertFalse("This is not empty",task.isEmpty(x));
    }

    public static void main(String[] args){
        checkPalindrom();
        checkNumber();
        checkText();
        checkEmpty();
    }
}
