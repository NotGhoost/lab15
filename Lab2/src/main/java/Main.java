import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Массив можно изменить: индексы начинаются с нуля.
        int[] numbers = {15, 7, 30, -15, 4, 0, 45, 12};
        System.out.println("Задание 1. Массив: " + Arrays.toString(numbers));
        System.out.print("Индексы элементов, кратных 3 и 5: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0 && numbers[i] % 5 == 0) System.out.print(i + " ");
        }
        System.out.println();

        int[][] a = {{1, 2, -3, 4}, {5, 6, 7, -8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println("\nЗадание 2. Матрица:");
        for (int[] row : a) System.out.println(Arrays.toString(row));
        long sum = 0;
        int count = 0;
        for (int row = 0; row < a.length; row++) {
            for (int col = row + 1; col < a[row].length; col++) {
                if (a[row][col] > 0) { sum += a[row][col]; count++; }
            }
        }
        System.out.println("Положительных элементов над главной диагональю: " + count);
        System.out.println("Их сумма: " + sum);
    }
}
