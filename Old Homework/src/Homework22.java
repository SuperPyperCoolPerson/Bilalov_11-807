import java.util.Scanner;
public class Homework22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int max1 = 0;
        int max2 = 0;
        System.out.println("Введите размер массива: ");
        size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (array[i] > max1) {
                max2 = max1;
                max1 = array[i];
            }
            else if (array[i] > max2 && max1 > max2) {
                max2 = array[i];
            }

        }
        System.out.println("Максимальное число в массиве: " + max1);
        System.out.println("Второе максимальное число в массиве: " + max2);
    }
}