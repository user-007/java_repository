package org.example;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Write a program that accepts text lines as input
//        and returns the following data for every line:
//
//        * line number: 0,1,2, etc
//        * line content: raw line text
//        * line type: Empty, Number, Palindrome, Text
class Task{
    public  boolean isEmpty(String s){
        return s.isEmpty();
    }
    public   boolean isNumber(String s){
        try {
            int number = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
        }
        return false;
    }
    public  boolean isPalindrome(String s){
        /*
         * 4 - 0
         * 3 - 1
         * 2 -2
         * 1 3
         * 0 4
         * */
        // [a-zA-Z]+
        for (int i = 0; i <(s.length()-1)/2; i++) {
//            ss[i]  = ss[ss.length()-i-1]
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
    public  boolean isText(String s){
        Pattern pattern = Pattern.compile("^[a-zA-Z\s]");
        Matcher matcher = pattern.matcher(s);
        boolean matchFound= matcher.find();
        return matchFound;
    }
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Pavel");
        arrayList.add("Panayotov");
        arrayList.add("12321");
        Scanner scn = new Scanner(System.in);
        Task task  = new Task();
        for (int i = 0; i < arrayList.size(); i++) {
            String line = arrayList.get(i);
            System.out.println(i);
            if(task.isEmpty(line))
                System.out.println("Empty");
            if(task.isPalindrome(line))
                System.out.println("Is palindrome");
            if(task.isNumber(line))
                System.out.println("Is number");
            if(task.isText(line))
                System.out.println("Is text");
        }
    }
}