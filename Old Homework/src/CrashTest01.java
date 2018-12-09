public class CrashTest01 {
    public static void main(String[] args) {
        int two = 0b1111; // Двоичная система.
        int eight = 010; // Восьмеричная система.
        int sixteen = 0x10;
        int a = 5;
        int b = +908+a;
        int с = -56;
        int x=3;
        int y=2;
        int z = x<y? (x+y)  :  x-y;
        System.out.println(z);
        System.out.println(~с);
        int number = 45; // 1001 Значение, которое надо зашифровать - в двоичной форме 101101
        int key = 102; //Ключ шифрования - в двоичной системе 1100110
        int encrypt = number ^ key; //Результатом будет число 1001011 или 75
        System.out.println("Зашифрованное число: " +encrypt);
        int decrypt = encrypt ^ key; // Результатом будет исходное число 45
        System.out.println("Расшифрованное число: " + decrypt);
        System.out.println(Integer.toString(two, 10));
        System.out.println(Integer.toString(eight, 16));
        System.out.println(Integer.toString(sixteen, 2));
        System.out.println(b);
    }
}
