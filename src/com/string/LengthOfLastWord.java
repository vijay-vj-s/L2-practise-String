package com.string;

import java.util.Scanner;

public class LengthOfLastWord {
    public int findLastWordLength(String str){
        String[]s=str.split(" ");
        String lastWord=s[s.length-1];
        int len=lastWord.length();
        return len;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=sc.nextLine();
        LengthOfLastWord l=new LengthOfLastWord();
        int length= l.findLastWordLength(str);
        System.out.println("Length of the Last Word is :"+length);
    }
}
