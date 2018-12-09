import java.util.Scanner;

public class Homework35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String BigBulat = " ";
        System.out.println("Введите размер массива: ");
        int size = sc.nextInt();
        System.out.println("Элементы массива: ");
        int [] array = new int [size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            BigBulat += array[i];
        }
        System.out.println("Ответ: " + BigBulat);
        }
    }