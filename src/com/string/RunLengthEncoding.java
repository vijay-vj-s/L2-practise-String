package com.string;

import sun.plugin2.message.JavaScriptCallMessage;

import java.util.Scanner;

public class RunLengthEncoding {

    public void runLengthEncoding(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            int count = 1;
            while (i < length - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            System.out.print(str.charAt(i));
            System.out.print(count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        RunLengthEncoding r = new RunLengthEncoding();
        r.runLengthEncoding(str);
    }
}


