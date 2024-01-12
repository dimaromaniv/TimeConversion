package org.example;

import java.util.Scanner;

public class Main {

    public static String timeConversion(String s) {
        // Write your code here


        String result = "";
        int prefix = 0;

        for (int i = 0 ;i < s.length();  i++){
            if (s.charAt(8) == 'A') {
                result = s.substring(0,8);
            }
            else if (s.charAt(8) == 'P') {
                String prefNumb = s.substring(0,3);
                String numericPart = prefNumb.replaceAll("[^0-9]", "");
                prefix = Integer.parseInt(numericPart);
                prefix = prefix + 12;
                result = "" + prefix + s.substring(2,8);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(timeConversion(input));
    }
}