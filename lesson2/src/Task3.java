/*
Написать функцию, возвращающую истину, если в переданном массиве
есть два соседних элемента, с нулевым значением.
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(isTwoNulls(new int[]{0, 0, 2, 3, 4}));
        System.out.println(isTwoNulls(new int[]{2, 0, 0}));
        System.out.println(isTwoNulls(new int[]{0, 3, 0}));
    }

    private static boolean isTwoNulls(int[] arr) {
        boolean isNull=false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                if(isNull){
                    return true;
                } else {
                    isNull = true;
                }
            } else {
                isNull = false;
            }
        }
        return false;
    }
}
