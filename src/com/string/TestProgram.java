package com.string;

import java.util.Arrays;

public class TestProgram{
    public static void main(String[] args) {
        String str1="CBA";
        String str2="BCA";
        char [] array1=str1.toCharArray();
        char [] array2=str2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.equals(array1,array2));
    }
}