package task4;
/*
Напишите метод бинарного поиска в одномерном массиве. В случае, если массив не отсортирован, метод должен
бросать проверяемое исключение.
 */
import java.util.Scanner;

public class CheckBinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Введите элемент массива для поиска: ");
        int key = scanner.nextInt();
        try {
            int index = binarySearch(arr, key);
            if (index != -1) {
                System.out.println("Элемент найден на индексе: " + index);
            } else {
                System.out.println("Элемент не найден");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int binarySearch(int[] arr, int key) throws Exception {
        if (!isSorted(arr)) {
            throw new Exception("Массив не отсортирован");
        }
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
