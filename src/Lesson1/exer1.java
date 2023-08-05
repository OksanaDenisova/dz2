package Lesson1;

public class exer1 {
    /* Ревлизуйте метод принимающий в качестве аргумента целочисленный массив.
    Если длина массива меньше некоторого заданного минимума, то метод возвращает -1,
    в качестве ошибки кода, иначе - длинну массива.

    */
    public static void main(String[] args) {
        int [] arr =  new int[]{1,2,3,4,5,6,7,8};
        System.out.println(length(arr));
    }

     static int length (int[] arr){
        int minlenght = 5;
        if (arr.length < minlenght){
            return -1;
        }
        return arr.length;
     }
}