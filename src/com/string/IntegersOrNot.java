package com.string;

import java.util.Scanner;

public class IntegersOrNot {
    public void integerStringOrNot(String str){
        int len=str.length();
        char[]ch=str.toCharArray();
        int i=0;
        while (i<len){
            if(ch[i]>='0'&&ch[i]<='9'){
                i++;
            }
            else{
                System.out.println("Not a Integer String");
               System.exit(0);
            }
        }
        System.out.println("Integer String");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=sc.nextLine();
        IntegersOrNot i=new IntegersOrNot();
        i.integerStringOrNot(str);
    }
}
