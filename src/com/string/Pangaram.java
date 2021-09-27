package com.string;
public class Pangaram {
    private static boolean pangaramChecking(String s) {
        if(s.length()<26){
            return false;
        }
        for(char ch='a';ch<='z';ch++){
            if(s.indexOf(ch)<0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String s="thequickbrownfoxjumpsoverthelazydog";
        boolean ans=pangaramChecking(s);
        System.out.println(ans);
    }


}
