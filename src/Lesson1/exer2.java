package Lesson1;

import java.util.Scanner;

/*Реализуте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
    Метод ищет в массиве заданное значение и возвращает его индекс.
    При этом, например:
    * если длинна массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки
    * если искомый элемент не найден, метод вернет -2, в качестве кода ошибки
    * если вместо массива пришел null, метод вернет -3, в качестве кода ошибки

    Придумайте свои вариантыи исключительных ситуаций и верните соответсвующие коды ошибок.
    Напишите метод,в котором реализуйте взаимодействие с пользователем. То есть, этот метод
    запросит искомое число у пользователя, вызовет первый, обработает возвращенное значение
    и покажет читаемый результат пользователю. Например, если вернулся -2, то пользователелю
    выведется сообщение с надписью "Искомый элемент не найден"
     */
public class exer2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.printf("Введите число для поиска в массиве: ");
            int number = input.nextInt();
            int[] array = new int [] {1,2,3,4,5,6,7} ;
            decoder(indexOfNumber(array, number));
            input.close();


        }

        public static int indexOfNumber(int[] array, int userNumber) {
            int minLenght = 5;
            if (array == null){
                return -3;
            }
            if(array.length < minLenght) {
                return -1;
            }
            for (int i = 0; i < array.length; i++) {
                if(array[i] == userNumber)
                    return i;
            }
            return -2;
        }


        public static void decoder (int code) {
            switch (code) {
                case -1:
                    System.out.println("Длинна массива меньше 5 элементов");
                    break;
                case -2:
                    System.out.println("Искомый элемент не найден");
                    break;
                case -3:
                    System.out.println("Массив равен null");
                    break;
                default:
                    System.out.printf("Индекс элемента равен %d", code);
            }

        }


//        public static void main(String[] args) {
//            int [] arr =  new int[]{1,2,3,4,5,6,7,8};
//            System.out.println(length(arr));
//        }
//
//        static int length (int[] arr){
//            int minlenght = 5;
//            if (arr.length < minlenght){
//                return -1;
//            }
//            return arr.length;
//        }

}
