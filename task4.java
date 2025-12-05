package com.algorithmization.practice8;

import java.util.Scanner;

public class task4 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");

        String text = sc.nextLine().toLowerCase();

        String[] words = text.split("[-_]");

        String camel = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > 0) {
                String first = words[i].substring(0, 1).toUpperCase();
                String rest = words[i].substring(1);
                camel += first + rest;
            }
        }

        System.out.println("camelCase: " + camel);
    }
}
