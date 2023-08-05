package Lesson2;
import java.util.Scanner;

public class Task4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
//Запрашиваем и сохраняем введенное пользователем

            System.out.print("Введите строку: ");
            String input = scanner.nextLine();
// Проверяем введенную строку и выводим сообщение
            try {
                if (input.isEmpty()) {
                    throw new Exception("Пустые строки вводить нельзя!");
                }
                System.out.println("Вы ввели строку: " + input);
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

