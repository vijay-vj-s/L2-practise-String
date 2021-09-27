package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public void anagram(String str1,String str2){

        char[]ch1=str1.toCharArray();
        char[]ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        if(Arrays.equals(ch2,ch1)){
            System.out.println("The String is anagram");
        }
        else {
            System.out.println("the String is not anagram");
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String 1 :");
        String str1=sc.nextLine();
        System.out.println("Enter the String 2:");
        String str2=sc.nextLine();
        Anagram a=new Anagram();
        a.anagram(str1,str2);
    }
}
