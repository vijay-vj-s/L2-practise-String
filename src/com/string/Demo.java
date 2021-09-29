package com.string;
import java.util.HashMap;
import java.util.Scanner;

public class Demo {

    private static void println(String str) {
        System.out.println(str);
    }

    private static void print(String str) {
        System.out.print(str);
    }


    private static Character findLastNonRepeatingCharacter(String string) {
        HashMap<Character, Integer> characterMap = new HashMap<>();

        //iterate the string and store count of each character in the map
        for (int i = 0; i < string.length(); i++) {
            Character currentCharacter = string.charAt(i);
            if (characterMap.containsKey(currentCharacter)) {
                characterMap.put(currentCharacter, characterMap.get(currentCharacter) + 1);
            }
            else
            { //character is not added to the map. add it with value as 1 characterMap.put(currentCharacter, 1); } } for (int i = string.length() - 1; i >= 0; i--) {
                if (characterMap.get(string.charAt(i)) == 1) {
                    return string.charAt(i);
                }
            }

            return null;
        }
        return null;
    }
        public static void main (String[]args) {

            String userInputString;
            Scanner scanner = new Scanner(System.in);

            println("Enter a string : ");
            userInputString = scanner.nextLine();

            Character c = findLastNonRepeatingCharacter(userInputString);

            if (c == null) {
                println("No character found.");
            } else {
                println("Last non repeating character is " + c);
            }
        }

    }
