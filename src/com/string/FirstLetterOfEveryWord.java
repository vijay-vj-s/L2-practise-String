package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class FirstLetterOfEveryWord {
    public String firstLetter(String str) {
        String result = "";
        boolean v = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                v = true;
            }
            else if (str.charAt(i) != ' ' && v == true) {
                result += (str.charAt(i));
                v = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=sc.nextLine();
        FirstLetterOfEveryWord f=new FirstLetterOfEveryWord();
        String ans= f.firstLetter(str);
        System.out.println("First Letter Of the Every Word Is :"+ans);
    }
}


