import java.util.Scanner;

public class Homework33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элеметов: ");
        int size = sc.nextInt();
        int sum = 0;
        System.out.println("Элементы массива: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i]=sc.nextInt();
        }
        for (int i = 1; i < size; i++) {
            if (array[i - 1] < array[i] && array[i]>array[i+1]) {
                sum++;
            }
            }
        System.out.println("Количество локальных максимумов: " + sum);
        }
        }
