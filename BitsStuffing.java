import java.util.Scanner;

public class BitsStuffing {

    public static String bitStuff(String data) {
        StringBuilder result = new StringBuilder();
        int count = 0;

        for (int i = 0; i < data.length(); i++) {
            char bit = data.charAt(i);

            result.append(bit);

            if (bit == '1') {
                count++;

                // After five consecutive 1s, insert 0
                if (count == 5) {
                    result.append('0');
                    count = 0;
                }
            } else {
                count = 0;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bit string: ");
        String data = sc.nextLine();

        String stuffed = bitStuff(data);

        System.out.println("Original data : " + data);
        System.out.println("Stuffed data  : " + stuffed);

        sc.close();
    }
}
