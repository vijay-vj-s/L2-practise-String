package com.string;

import java.util.Scanner;

public class TestProgram {
    public void palin(int num){
       int sum=0,reminder;
       int temp=num;
       while(num!=0){
           reminder=num%10;
           sum=(sum*10)+reminder;
           num=num/10;
       }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        TestProgram t=new TestProgram();
        t.palin(num);
    }

}
