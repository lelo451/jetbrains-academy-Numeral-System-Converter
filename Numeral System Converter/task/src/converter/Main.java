package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radixOfNum = sc.nextInt();
        String numInString = sc.next();
        int radixTarget = sc.nextInt();

        long num;
        if (radixOfNum == 1) {
            num = numInString.length();
        } else {
            num = Long.parseLong(numInString, radixOfNum);
        }

        if (radixTarget == 1) {
            for (int i = 0; i < num; i++) {
                System.out.print(1);
            }
        } else {
            String numTarget = Long.toString(num, radixTarget);
            System.out.print(numTarget);
        }
    }
}
