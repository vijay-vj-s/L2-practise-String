package com.string;

import java.util.Scanner;

public class LongestPalindrome {
    int resultStart;
    int resultLength;

        public String longestPalindrome(String str){
            int len=str.length();
            if(len<2){
                return str;
            }
            for(int i=0;i<len-1;i++){
                expandRange(str,i,i);
                expandRange(str,i,i+1);
            }
            return  str.substring(resultStart,resultStart+resultLength);
        }

       public void expandRange(String str,int begin,int end){
            while (begin>=0 && end< str.length()&&str.charAt(begin)==str.charAt(end)){
                begin--;
                end++;
            }
            if(resultLength<end-begin-1){
                resultStart=begin+1;
                resultLength=end-begin-1;
            }
       }

        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=sc.nextLine();
        LongestPalindrome l=new LongestPalindrome();
        String ans=l.longestPalindrome(str);
            System.out.println(ans);
            System.out.println("Length of the SubString is :"+ans.length());
    }
}
