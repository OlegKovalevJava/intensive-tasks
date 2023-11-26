package com.walking.intensive.chapter1.task1;
/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {

    }

    static String getAgeString(int age) {
        if (age < 0 || age > 127) {
            return "Введенное число за пределами заданного периода.\n" +
                    "Запустите программу снова и введите число от 1 до 127 включительно.";
        }

        int lastDigit = age % 10;
        int last2Digits = age % 100;

        if (lastDigit == 1 && last2Digits != 11) {
            return "Вам " + age + " год";
        }

        if (lastDigit >= 2 && lastDigit <= 4 && (last2Digits < 12 || last2Digits > 14)) {
            return "Вам " + age + " года";
        }

        return "Вам " + age + " лет";
    }
}