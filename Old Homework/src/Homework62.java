import java.util.Scanner;

public class Homework62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(spaceDel(s));
    }

    public static String spaceDel(String s) {
        //return s.trim();
        //char[] arr = s.toCharArray();
        int i = 0;
        while (s.charAt(i) == ' ') {
            i++;
        }
        return s.substring(i);
    }
}