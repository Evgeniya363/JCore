import java.util.Arrays;
import java.util.Random;

/*
Написать метод, которому можно передать в качестве аргумента массив, состоящий строго из единиц и нулей
(целые числа типа int). Метод должен заменить единицы в массиве на нули, а нули на единицы и не содержать
ветвлений. Написать как можно больше вариантов метода
 */
public class Task7 {
    public static void main(String[] args) {
        int[] arr = initArray(10);
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        invert(arr);
        System.out.println("Инверсия мет.1:" + Arrays.toString(arr));
        invert1(arr);
        System.out.println("Инверсия мет.2: " + Arrays.toString(arr));
        invert2(arr);
        System.out.println("Инверсия мет.3: " + Arrays.toString(arr));
    }

    private static void invert(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - arr[i];
        }
    }

    private static void invert1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ~arr[i] + 2;
        }
    }

    private static void invert2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 1) % 2;
        }
    }

    private static int[] initArray(int len) {
        Random random = new Random();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(0,2);
        }
        return  arr;
    }
}
