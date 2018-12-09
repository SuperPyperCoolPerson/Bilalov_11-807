import java.util.Scanner;
public class Homework13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ten;
        System.out.println("Введите число для конвертирования: ");
        ten = sc.nextInt();
        System.out.println("Двоичная система данного числа: "+ Integer.toBinaryString(ten));
        System.out.println("Троичная система данного числа: "+Integer.toString(ten,3));
        System.out.println("Восьмеричная система данного числа: "+ Integer.toOctalString(ten));
        System.out.println("Шестнадцатеричная система данного числа: "+ Integer.toHexString(ten));
    }
}


