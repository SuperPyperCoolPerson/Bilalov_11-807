import java.util.Scanner;

public class Homework31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int all = 0;
        int cred = 0;
        System.out.println("Введите размер массива: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
            sum = sum + array[i];
        }
        cred = sum / all;
        for (int i = 0; i < n ; i++) {
            if (a[i]>cred) all++;
        }
        System.out.println("Средний рост:" + cred);
        System.out.println("Количество студентов, которые выше среднего роста" + all);
    }
}
