package Lesson2;
import java.io.FileNotFoundException;
public class Task3 {
    //
        public static void main(String[] args) throws Exception {
            try {
                int a = 90;
                int b = 3;
                System.out.println(a / b);
                printSum(23, 234);
                int[] abc = {1, 2};
                abc[3] = 9;

                // Изменен порядок исключений от более конкретного типа исключений к общему
                // тк. если сработает самый первый то другие не будут проверяться.

            } catch (NullPointerException ex) {
                System.out.println("Указатель не может указывать на null!");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Массив выходит за пределы своего размера!");
            } catch (Exception ex) {
                System.out.println("Что-то пошло не так...");
            }
        }
// удалила исключение FileNotFoundException тк в самом коде оно не выбрасывается
        public static void printSum(Integer a, Integer b) {
            System.out.println(a + b);
        }
    }

