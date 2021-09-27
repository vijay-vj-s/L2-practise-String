package com.string;

import java.util.Scanner;

public class NonRepeatingCharacters{
    private static final int MAX = 256;
    public void lastNonRepeating(String str, int n) {
      int [] array = new int[MAX];
        for (int i = 0; i < n; i++){
            array[str.charAt(i)]++;
        }
        for (int i = n - 1; i >= 0; i--) {
            char ch = str.charAt(i);
           System.out.println(ch);
        }
    }


    public static void main(String[] args)
    {
        NonRepeatingCharacters nr=new NonRepeatingCharacters();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str =sc.nextLine();
        int n = str.length();
       nr.lastNonRepeating(str, n);
    }
}
