import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Исходный массив: ");
        int[] arr1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = append(arr1, 6);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = append(arr1, 7, 2);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = append(arr1, 7, 5);
        System.out.println(Arrays.toString(arr4));

    }


    private static int[] append(int[] arr, int item, int index) {
        if(index> arr.length || index < 0) {
            System.out.println("Индекс вне диапозона");
            return arr;
        }
        int[] newArr = new int[arr.length + 1];

        System.arraycopy(arr, 0, newArr,0, index);
        newArr[index] = item;

        System.arraycopy(arr, index, newArr, index+1, arr.length - index);

        return newArr;
    }

    private static int[] append(int[] arr, int item) {

        return append(arr, item, arr.length);
    }


    private static int[] add(int[] arr, int item) {
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < arr.length ; i++) {
            newArray[i] = arr[i];
        }
        newArray[arr.length] = item;
        return newArray;
    }

    private static int[] add(int[] arr, int item, int index) {
        if(index> arr.length || index < 0) {
            System.out.println("Индекс вне диапозона");
            return arr;
        }
        int[] newArray = new int[arr.length + 1];

        int delta = 0;
        for (int i =0; i < arr.length; i++) {
            if (i == index) {
                delta++;
            }
            newArray[i + delta] = arr[i];
        }
        newArray[index] = item;
        return newArray;
    }
}

