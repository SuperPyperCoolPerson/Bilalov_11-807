import java.util.Scanner;

public class Homework51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rezult = 0;
        int k = 0;
        double one = 0.0;
        double two = 0.0;
        while (true) {
            if (k == 1) {
                one = rezult;
            } else {
                System.out.println("Введите первое значение: ");
                one = sc.nextDouble();
            }
            System.out.println("Введите знак: ");
            String arg = sc.next();
            System.out.println("Введите второе значение: ");
            two = sc.nextDouble();
            if (arg.equals("*")) {
                rezult = one * two;
            }
            if (arg.equals("/")) {
                rezult = one / two;
            }
            if (arg.equals("+")) {
                rezult = one + two;
            }
            if (arg.equals("-")) {
                rezult = one - two;
            }
            System.out.println("Результат: " + rezult);
            System.out.println("Повторить? Да/Нет");
            String ret = sc.next();
            if (ret.equals("Да")) {
                k = 1;
            } else if (ret.equals("Нет")) {
                return;
            } else {
                return;
            }
        }
    }
}