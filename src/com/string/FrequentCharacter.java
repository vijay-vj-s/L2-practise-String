package  com.string;

import java.util.Scanner;

public class FrequentCharacter {          //Doubt

    public String getSecondMostFreq(String str) {
        int NO_OF_CHARS = 256;
        int[] frequency = new int[NO_OF_CHARS];
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }
        for (int i = str.length() - 1; i >= 0 ; i--) {
            char ch = str.charAt(i);
            if (frequency[ch] == 2) {
                return (" " + ch);
            }
        }
            return "-1";
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str =sc.nextLine();
        FrequentCharacter fc=new FrequentCharacter();
        String  res =fc. getSecondMostFreq(str);
        if (res != "-1")
            System.out.println("Second most frequent char"+
                    " is " + res);
        else
            System.out.println("No second most frequent"+
                   "character");
    }
}

