package converter;

public class Main {
    public static void main(String[] args) {
        System.out.println(10 + " is equal to 0b" + convertToBinary(10));
    }

    public static String convertToBinary(int number) {
        String str = "";
        if (number == 0) {
            str = "0";
        } else {
            while (number > 0) {
                str = number % 2 + str;
                number /= 2;
            }
        }
        return str;
    }
}
