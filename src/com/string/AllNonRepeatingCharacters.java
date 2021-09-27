package com.string;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AllNonRepeatingCharacters {
    public void nonRepeatingChar(String str) {
        char[] ch = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        while (i < str.length()) {
            if (map.containsKey(ch[i]) == false) {
                map.put(ch[i], 1);
            } else {
                int oldVal = map.get(ch[i]);
                int newVal = oldVal + 1;
                map.put(ch[i], newVal);
            }
            i++;
        }

        for (Map.Entry <Character, Integer> ans : map.entrySet()) {
            if (ans.getValue() == 1) {
                System.out.println(ans.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        AllNonRepeatingCharacters a = new AllNonRepeatingCharacters();
        a.nonRepeatingChar(str);
    }
}
