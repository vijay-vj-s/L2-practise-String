package com.string;

import java.util.Scanner;

public class LengthOfLongestSubString {
    public int findLength(String str) {
        String test = "";
        int maxLength =Integer.MIN_VALUE;
        System.out.println("Maximum length is :"+maxLength);
        int length=str.length();
            if(length==0){
                return length;
            }
            if(length==1){
                return  length;
            }
        for (char ch : str.toCharArray()) {
            String current = String.valueOf(ch);
            System.out.println("Current character is :"+current);
            if (test.contains(current)) {
                test = test.substring(test.indexOf(current) + 1);
            }
            test = test + String.valueOf(ch);
            System.out.println(String.valueOf(ch));
            maxLength = Math.max(test.length(), maxLength);
        }

        return maxLength;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // String str = "geeksforgeeks";
        System.out.println("Enter the String :");
        String str=sc.nextLine();
        LengthOfLongestSubString l = new LengthOfLongestSubString();
         int length=  l.findLength(str);
        System.out.println("Length of the Longest SubString is :"+length);

    }
}
