package com.company;

public class Main {

    public static void main(String[] args) {
        int counter = 0;
        for (int number = 50; number < 70; number++) {
            if (checkNumberIsSimple(number) == true && counter == 0) {              //находим первое простое число
                counter++;
                continue;
            }
            if (checkNumberIsSimple(number) == true && counter == 1) {               //находим второе простое число и выводим на экран
                System.out.println("Второе простое число в диапазоне от 50 до 70, число " + number + "!");
                break;
            }
        }
    }

    public static boolean checkNumberIsSimple(int number) {                 //метод для проверки числа (простое/не простое)
        boolean trueSimple = true;
        boolean falseSimple = false;
        int i = 2;
        for (i = 2; i < number; ++i) {
            if (number % i != 0 && number % number == 0 && number % 1 == 0) {
                continue;
            } else if (number % i == 0) {
                return falseSimple;                                         //число "не простое"
            }
        }
        return trueSimple;                                                //число простое
    }


}
