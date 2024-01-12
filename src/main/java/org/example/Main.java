package org.example;

import java.util.Scanner;

public class Main {

    public static String timeConversion(String s) {

        String result = "";
        int prefix = 0;

        if (s.charAt(8) == 'A') {
            if (s.substring(0, 2).equals("12")) {
                result = "00" + s.substring(2, 8);
            } else {
                result = s.substring(0, 8);

            }
        } else if (s.charAt(8) == 'P') {
            if (!s.substring(0, 2).equals("12")) {
                String prefStr = s.substring(0, 2);
                prefix = Integer.parseInt(prefStr);
                prefix = prefix + 12;
                result = prefix + s.substring(2, 8);
            } else {
                result = s.substring(0,8);
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