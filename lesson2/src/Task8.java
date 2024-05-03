/*
Создать квадратный целочисленный массив (количество строк и
столбцов одинаковое), заполнить его диагональные элементы единицами,
используя цикл(ы)
 */
public class Task8 {
    public static void main(String[] args) {
        final int size = 5;
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] =1;
            arr[arr.length-i-1][i]=1;
        }
        show(arr);
    }

    private static void show(int[][] arr) {
        for (int i = 0; i < arr[0].length ; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                System.out.print(arr[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
