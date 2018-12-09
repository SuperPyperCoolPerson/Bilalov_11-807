import java.util.Scanner;

public class Homework32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = sc.nextInt();
        int max = 0;
        int index = 0;
        System.out.println("Элементы массивы: ");
        int[] array = new  int[size];
        for (int i = 0; i < size; i++) {
            array[i]=sc.nextInt();
            array[i]=Math.abs(array[i]);
        }
        for (int i = 0; i < size; i++) {
            if (array[i]>max) {
                max=array[i];
                index = i;
            }
        }
        System.out.println("Индекс максимального по модулю элемента в массиве: "+ index);
        }
    }
