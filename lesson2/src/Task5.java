import java.util.Scanner;
/*
Написать метод «Шифр Цезаря», с булевым параметром зашифрования/расшифрования, и числовым ключом;
 */
public class Task5 {
    public static void main(String[] args) {
        int key = 5;
        System.out.print("Введите строку: ");
        String str = (new Scanner(System.in)).nextLine();
        System.out.println("Входная строка: " + str);

        String str1 = cript(str, true, key);
        System.out.println("Зашифровали: " + str1);

        String str2 = cript(str1, false, key);
        System.out.println("Расшифровали: " + str2);
    }

    private static String cript(String str, boolean sw, int key) {
        char[] arr = str.toCharArray();
        int shift = sw ? key : -key;
        for (int i = 0; i < arr.length; i++) {
            arr[i] += (char) shift;
        }
        return String.valueOf(arr);
    }
}
