package com.string;

import java.util.Scanner;
public class LastWordOfTheString {
    public String lengthOfLastWord(String s){
      String[] array= s.split(" ");
        String lastWord=array[array.length-1];
        System.out.println(" length of the String :"+lastWord.length());
        return lastWord;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String string=sc.nextLine();
        LastWordOfTheString l=new LastWordOfTheString();
        String lastWord=l.lengthOfLastWord(string);
        System.out.println("Last word of the String is :"+lastWord);
    }
}
