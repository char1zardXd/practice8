package com.algorithmization.practice8;

import java.util.Scanner;

public class task1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ispolyndrom = true;
        String text;

        System.out.println("Введите строку на проверку полиндрома: ");
        text = scanner.nextLine();
        String _text = text;
        _text = text.trim().toLowerCase();


        for (int i = 0; i < _text.length() / 2; i++) {
            int endIndex = _text.length() - 1 - i;
            if (_text.charAt(i) != _text.charAt(endIndex)) {
                ispolyndrom = false;
                break;
            }
        }
        if (ispolyndrom) {
            System.out.printf("Строка {%s} - является полиндромом", text);
        }
        else {
            System.out.printf("Строка {%s} - не является полиндромом", text);
        }
    }
}
