package com.walking.intensive.chapter1.task2;
/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {

    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        final int totalFlatFloor = 4;
        int totalFlatsEntrance = floorAmount * totalFlatFloor;

        if (flatNumber < 1 || flatNumber > (entranceAmount * totalFlatsEntrance)) {
            return "Такой квартиры не существует";
        }

        if (floorAmount < 1) {
            return "Такого этажа не существует";
        }

        if (entranceAmount < 1) {
            return "Такого подъезда не существует";
        }

        int entranceNumber;

        if (flatNumber % totalFlatsEntrance == 0) {
            entranceNumber = flatNumber / totalFlatsEntrance;
        } else {
            entranceNumber = flatNumber / totalFlatsEntrance + 1;
        }

        int floorNumber;

        if (flatNumber % totalFlatFloor == 0) {
            floorNumber = (flatNumber / totalFlatFloor) - floorAmount * (entranceNumber - 1);
        } else {
            floorNumber = (flatNumber / totalFlatFloor + 1) - floorAmount * (entranceNumber - 1);
        }

        String flatLocation = switch (flatNumber % totalFlatFloor) {
            case (0) -> "справа от лифта, вправо";
            case (1) -> "слева от лифта, влево";
            case (2) -> "слева от лифта, вправо";
            case (3) -> "справа от лифта, влево";
            default -> "";
        };

        return flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж, " + flatLocation;
    }
}