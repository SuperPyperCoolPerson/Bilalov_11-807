import java.util.Scanner;

public class Homework71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();

        if(recursion(n)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public static boolean recursion (int n){
        if (n==1) {
            return true;
        }

        if(n%2==0){
            return recursion(n/2);
        } else{
            return false;
        }
    }

}



