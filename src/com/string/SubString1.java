package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class SubString1 {
    public void replacement(String string){

      String[] array=string.split(" ");
       for(int i=0;i<array.length;i++){
         if(array[i].equals("fox")) {
             array[i] = "cat";
         }
     }
        System.out.println(Arrays.toString(array));


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String string=sc.nextLine();

        SubString1 s=new SubString1();
          s.replacement(string);


    }
}
