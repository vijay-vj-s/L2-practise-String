package com.string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {
    public void duplicates(String string){
       char[] ch=string.toCharArray();
       Set<Character>dup=new HashSet<>();
       for(int i=0;i<ch.length;i++){
           dup.add(ch[i]);
       }
        System.out.println("After Removing Duplicate Elements :"+dup);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String string=sc.nextLine();
        RemoveDuplicate rd=new RemoveDuplicate();
        rd.duplicates(string);
    }
}
