package com.algorithmization.practice8;

import java.util.Scanner;

public class task3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;

        System.out.println("Введите текст для проверки: ");
        text = scanner.nextLine();
        text = text.trim().toLowerCase();

        String[] words = text.split(" ");
        String shortest = words[0];
        String longest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.printf("Самое длинное слово: %s%nКоличество символов: %s", longest, longest.length());
        System.out.println();
        System.out.printf("Самое короткое слово: %s%nКоличество символов: %d", shortest, shortest.length());
    }
}
