import java.util.Scanner;
public class Homework82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число строк: ");
        int m = sc.nextInt();
        System.out.println("Введите число столбцов: ");
        int n = sc.nextInt();
        System.out.println("Вводите числа");
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int maxSum = 0;
        int indxMS = 0;
        for (int i = 0; i < m; i++) {
            int sum1 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += matrix[i][j];
            }
            if (sum1 > maxSum) {
                maxSum = sum1;
                indxMS = i;
            }
        }
        System.out.println("Строка:");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + matrix[indxMS][i]);
        }
        maxSum = 0;
        indxMS = 0;
        for (int i = 0; i < n; i++) {
            int sum1 = 0;
            for (int j = 0; j < m; j++) {
                sum1 += matrix[j][i];
            }
            if (sum1 > maxSum) {
                maxSum = sum1;
                indxMS = i;
            }
        }
        System.out.println("/n столбец: ");
        for (int i = 0; i < m; i++) {
            System.out.println(" " + matrix[i][indxMS]);
        }
    }
}