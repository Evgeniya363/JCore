import java.util.Arrays;

/*
Написать функцию, возвращающую разницу между самым большим и самым
маленьким элементами переданного не пустого массива.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] arr = {};
        int[] arr0 = {2, 1, 2, 3, 4};
        int[] arr1 = {2, 2, 0};
        int[] arr2 = {1, 3, 5};
        System.out.println("Массив -->  Разница мин-макс");
        System.out.println(Arrays.toString(arr) + "  -->  " + range(arr));
        System.out.println(Arrays.toString(arr0) + "  -->  " + range(arr0));
        System.out.println(Arrays.toString(arr1) + "  -->  " + range(arr1));
        System.out.println(Arrays.toString(arr2) + "  -->  " + range(arr2));
    }

    private static int range(int[] arr) {
        if(arr.length==0){
            return 0;
//            throw new IllegalArgumentException("Массив не должен быть пуст");
        }
        int min = arr[0], max = min;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            } else if(arr[i] < min) {
                min =arr[i];
            }
        }
        return max - min;
    }
}
