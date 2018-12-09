import java.util.Scanner;

public class CrashTest07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int a = 5;
        int b = 6;
        System.out.print("Максимальная строка: " + a + " " + b);
        System.out.println();
        System.out.println("Максимальный столбец:\n" + a +"\n"+  b );
    }
}
