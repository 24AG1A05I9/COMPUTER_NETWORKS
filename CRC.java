import java.util.Scanner;

public class CRC {

    static String xor(String a, String b) {
        String result = "";

        for (int i = 0; i < a.length(); i++) {
            result += (a.charAt(i) == b.charAt(i)) ? "0" : "1";
        }

        return result;
    }

    static String divide(String dividend, String divisor) {

        int n = divisor.length();
        String remainder = dividend.substring(0, n);

        for (int i = n; i < dividend.length(); i++) {

            if (remainder.charAt(0) == '1') {
                remainder = xor(remainder, divisor);
            } else {
                remainder = xor(remainder, zeros(n));
            }

            remainder = remainder.substring(1) + dividend.charAt(i);
        }

        if (remainder.charAt(0) == '1') {
            remainder = xor(remainder, divisor);
        } else {
            remainder = xor(remainder, zeros(n));
        }

        return remainder.substring(1);
    }

    static String zeros(int n) {
        String result = "";

        for (int i = 0; i < n; i++) {
            result += "0";
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter data: ");
        String data = sc.nextLine();

        System.out.print("Enter generator: ");
        String generator = sc.nextLine();

        String appendedData =
                data + zeros(generator.length() - 1);

        String crc = divide(appendedData, generator);

        String transmittedData = data + crc;

        System.out.println("Appended Data    : " + appendedData);
        System.out.println("CRC              : " + crc);
        System.out.println("Transmitted Data : " + transmittedData);

        sc.close();
    }
}
