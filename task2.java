package com.algorithmization.practice8;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;

        System.out.println("Введите текст для переверота: ");
        text = scanner.nextLine();

        String[] words = text.split(" ");
        String[] reversedWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            reversedWords[i] = new String("");
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reversedWords[i] += words[i].charAt(j);
            }
        }
        System.out.println("Перевёрнутый текст: " + Arrays.toString(reversedWords));
    }
}
