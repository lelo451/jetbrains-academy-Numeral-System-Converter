package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String radix = Integer.toString(num, 8);
        System.out.println(radix.charAt(radix.length() - 1));
    }
}
