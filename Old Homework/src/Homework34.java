import java.util.Scanner;

public class Homework34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean up = true;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i;
        for (i = 1; i < n; i++) {
            if (up && arr[i]<arr[i-1]) {
                up = false;
            } else if (!up && arr[i]>arr[i-1]) {
                System.out.println("Nope");
                break;
            }
        }
        if (up) {
            System.out.println("Nope");
        } else if (i==n) {
            System.out.println("Correct");
        }
    }
}
