package org.lessons.lesson1;

import java.util.Arrays;

public class Lesson_1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        boolean answer = true;
        //Байт 8 бит
        byte bt = -128;
        byte bt2 = 127;
        //Короткое число 16 бит
        short sh = -32768;
        short sh2 = 32767;
        //Целое число 32 бит
        int integer = -2_147_483_648;
        int integer2 = 2_147_483_647;
        //Длинное целое число 64 бит
        long lon = 3_000_000_000_000L;
        //Хранит 7 цифр после запятой
        float flo = 3.1234567f;
        //Хранит 15 цифр после запятой
        double doub = 3.123456789012345;

        //Математические операции

        int x = 4;
        int y = 2;
        int c = x + y;
        int c1 = x - y;
        int c2 = x / y;
        int c3 = x * y;
        int c4 = x % y;

        //Тип данных символ

        char ch = 'l';
        char ch2 = 228;

        System.out.println(ch2);

        //Массив данных

        char[] abc = new char[6];
        abc[0] = 'B';
        abc[1] = 'A';
        abc[2] = 'T';
        abc[3] = 'T';
        abc[4] = 'L';
        abc[5] = 'E';

        //Как заполнить массив быстрее

        char[] big = {'a', 'b', 'c', 'd'};

        //Как вывести массив с примитивными типами данных, типа int

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(numbers));

        //Текстовый тип данных

        String word1 = "hello";
        String word2 = " WORLD!";

        //Конкатенация(объединение строк)

        String result = word1 + word2;

        System.out.println(result);

        //Преобразовать массив char в текст String

        String stringFromCharArray = String.valueOf(abc);
        System.out.println(stringFromCharArray + "e");

        //Перевести все буквы в верхний/нижний регистр

        System.out.println(word1.toUpperCase());
        System.out.println(word2.toLowerCase());

        //Вывести длину строки

        System.out.println(word1.length());

        //Заменить часть слова

        String newWord1 = word1.replaceAll("llo", "licopter");
        System.out.println(newWord1);

        //Повторить строку несколько раз

        System.out.println(word1.repeat(10));

        //Убрать пробелы перед и после слова

        String word3 = "           word            ";
        System.out.println(word3.trim());

        System.out.println("Новые измнения");

    }
}
