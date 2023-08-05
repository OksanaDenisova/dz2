package Lesson2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        float userInput = getFloatInput();
        System.out.println("Вы ввели: " + userInput);
    }

    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float userInput = 0.0f;
        boolean validInput = false;

        do {
            try {
                System.out.print("Введите дробное число: ");
                userInput = Float.parseFloat(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введите корректное дробное число.");
            }
        } while (!validInput);

        return userInput;
    }
}

