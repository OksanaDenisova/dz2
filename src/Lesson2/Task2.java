package Lesson2;

//  чтобы появилось исключение ArithmeticException необходимо обьявить и инициализировать массив
// intArray. Тогда  при попытке поделить массив на 0 сработает исключение.

public class Task2 {
        public static void main(String[] args) {
            int[] intArray = {1, 2, 3}; // Пример инициализации массива intArray
            try {
                int d = 0;
                double catchedRes1 = intArray[2] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            } catch (ArithmeticException e) {
                System.out.println("Catching exception: " + e);
            }
        }
    }

