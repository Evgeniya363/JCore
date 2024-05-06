
//Задача: Написать метод, осуществляющий сортировку одномерного
//массива подсчётом. Важное ограничение состоит в том, что для этой
//сортировки диапазон значений исходного массива должен находиться в
//разумных пределах, например, не более 1000.
//x[2, 1, 0, 4, 3, 0, 0, 1, 2] → t[3(x0
//), 2(x1
//), 2(x2
//), 1(x3
//), 1(x4
//)] → x[0, 0, 0, 1, 1, 2, 2, 3, 4]

import java.util.Arrays;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int[] arr = {1,2,3,1,2,3,4,5,3,4,5,6,1,3,4,7,6,5,2,3,4};
        System.out.println(Arrays.toString(arr));
        int[] arr1 = sortArr(arr);
        System.out.println(Arrays.toString(arr1));
    }

    private static int[] sortArr(int[] arr) {
        int[] tmp = new int[arr.length];

        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            treeMap.put(arr[i],treeMap.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(treeMap);

        int j=0;
        for(Integer key: treeMap.keySet()) {

            for (int i = 0; i < treeMap.get(key); i++) {
                tmp[j++] = key;
            }
        }
        return tmp;
    }


}