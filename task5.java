package com.algorithmization.practice8;

import java.util.Scanner;

public class task5 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        String[] badWords = {"барбос", "бармалей", "дурачьё", "простофиля", "обормот", "козявка", "балбес", "пухлящ", "глупый"};
        String censor = "****";

        System.out.println("Введите злой текст: ");
        text = scanner.nextLine();

        for (String word: badWords) {
            text = text.replaceAll(word, censor);
        }
        System.out.println(text);
    }
}
