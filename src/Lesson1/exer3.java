package Lesson1;
/* Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
    Необходимо посчитать и вернуть сумму элементов этого массива.
    При этом накладываем на метод два ограничения:
    метод может работать только с квадратными массивами ( кол-во строк = кол-ву столбцов),
    в каждой ячейке может лежать значение только 0 или 1.
    Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.

 */
public class exer3 {
    public static void main(String[] args) {
        int [][] array = new int [][] {
                {1,0,0},
                {1,1,5},
                {0,1,0}};
        try {
            System.out.println("Сумма элементов массива равна: " + sumElement(array));}
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
     static int sumElement(int [][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length){
                throw new RuntimeException("Массив не квадрратный");
            }
            for (int j = 0; j < array[i].length; j++){
                int item = array[i][j];
                if (item !=0 && item != 1){
                    throw new RuntimeException("Элемент под индексом [" + i + ", " + j +"] " +
                             "не равен 1 или 0");
                }
                sum += item;
            }
        }
        return sum;
     }
}
