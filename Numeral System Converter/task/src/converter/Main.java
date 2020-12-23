package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int radix = sc.nextInt();
        switch (radix) {
            case 2:
                System.out.println("0b" + Long.toString(num, radix));
                break;
            case 8:
                System.out.println("0" + Long.toString(num, radix));
                break;
            case 16:
                System.out.println("0x" + Long.toString(num, radix));
                break;
        }
    }
}
