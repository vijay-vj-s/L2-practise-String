package com.string;

import java.util.Scanner;

public class ConvertCase {
    public void caseConvert(String string) {
        char[] ch = string.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] -= 32;
            } else if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] += 32;
            }
        }
        System.out.println(String.valueOf(ch));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String string1 = sc.nextLine();
        ConvertCase cc = new ConvertCase();
        cc.caseConvert(string1);
    }
}
