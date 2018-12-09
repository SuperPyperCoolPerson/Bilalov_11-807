import java.util.Scanner;

public class CrashTest05 {
    public static String recursion(int n) {
        // Базовый случай
        if (n == 1) {
            return "1";
        }
        return recursion(n - 1) + " " + n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println(recursion(n));
    }
}