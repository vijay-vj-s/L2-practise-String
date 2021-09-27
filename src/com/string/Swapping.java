package com.string;
import java.util.Scanner;

public class Swapping {
    public void swap(String str, int length)
    {
//        String []array =str.split(" ");
//        String temp = array[0];
//        array[0] = array[array.length - 1];
//        array[array.length - 1] = temp;
//        String mid = " ";
//        for (int i = array.length - 2; i >= 1; --i) {
//            String tempStr = array[i];
//            for (int j = tempStr.length() - 1; j >= 0; --j) {
//                mid += tempStr.charAt(j);
//            }
//            mid += " ";
//        }
//        System.out.print(array[0] + " " + mid + " "
//                + array[array.length - 1]);
        String[]string=str.split(" ");

        String temp=string[0];
        string[0]=string[string.length-1];
        string[string.length-1]=temp;

        String mid=" ";

        for(int i=string.length-2;i>=1;i--){
            String temp1=string[i];
            for (int j = temp1.length()-1; j>=0; j--) {
                mid+=temp1.charAt(j);
            }
            mid+=" ";
        }
        System.out.println(string[0]+ " "+mid+ " "+string[string.length-1]);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String m = sc.nextLine();
        int length = m.length();
        Swapping s=new Swapping();
        s. swap(m , length);
    }
}
