import java.util.Scanner;
public class Homework12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius, s1, s2;
        System.out.println("Введите радиус шара: ");
        radius = sc.nextDouble();
        if (radius<0) {
            System.out.println("Радиус круга может быть только положительным!");
            return;
        }
        s1 =1.33*java.lang.Math.PI*Math.pow(radius, 3);
        s2 =4*java.lang.Math.PI*Math.pow(radius, 2);
        System.out.println("Примерный объём шара: " + s1);
        System.out.println("Примерная площадь поверхности шара: " + s2);
    }
}
