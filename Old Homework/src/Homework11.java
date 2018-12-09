import java.util.Scanner;
public class Homework11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, с;
        System.out.println("Введите первое число: ");
        a = sc.nextInt();
        a = Math.abs(a);
        System.out.println("Введите второе число: ");
        b = sc.nextInt();
        b = Math.abs(b);
        с = a - b;
        System.out.println("Модуль разности чисел: " + с);
    }
}