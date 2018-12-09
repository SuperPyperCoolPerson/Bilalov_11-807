import java.util.Scanner;
public class Homework21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt(); }
        for (int i = 0; i < size; i++) {
            if (array[i]%2==0) {
                sum1=sum1+array[i]; }
                else sum2=sum2+array[i];
        }
        sum=sum1-sum2;
        System.out.println("Сумма чётных минус сумма нечётных: "+sum);
        }
    }