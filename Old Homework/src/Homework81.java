import java.util.Scanner;
public class Homework81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк(столбцов): ");
        int size = sc.nextInt();
        int[][] array = new int[size][size];
        int rowSum = 0;
        System.out.println("Элементы массива: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int DiagonalSum = 0;
        for (int i = 0; i < size; i++) {
            DiagonalSum = DiagonalSum + array[i][i];
        }
        int collateralDiagonalSum = 0;
        for (int i = 0; i < size; i++) {
            collateralDiagonalSum += array[i][size - i - 1];
        }

        if (DiagonalSum != collateralDiagonalSum) {
            System.out.println("Это не магический квадрат!");
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rowSum = rowSum + array[i][j];
            }
        }
        if ((rowSum/size) != DiagonalSum) {
            System.out.println("Это не магический квадрат!"); }
        else {
            System.out.println("Это магический квадрат!");
        }
    }
}