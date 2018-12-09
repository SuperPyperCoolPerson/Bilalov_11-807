import java.util.Scanner;

public class Homework72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        System.out.println("Сумма всех чисел равна: " +recursion(n));
    }

    public static int recursion(int n) {
        if(n==0){
            return 0;
        }
        return n%10+recursion(n/10);
    }
}

