import java.util.Scanner;

public class CharacterStuffing {

    public static String stuff(String data, char flag, char esc) {
        StringBuilder result = new StringBuilder();

        // Starting FLAG
        result.append(flag);

        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);

            // If data contains FLAG or ESC, add ESC before it
            if (ch == flag || ch == esc) {
                result.append(esc);
            }

            result.append(ch);
        }

        // Ending FLAG
        result.append(flag);

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char FLAG = 'F';
        char ESC = 'E';

        System.out.print("Enter data: ");
        String data = sc.nextLine();

        String stuffedData = stuff(data, FLAG, ESC);

        System.out.println("Original Data : " + data);
        System.out.println("Stuffed Data  : " + stuffedData);

        sc.close();
    }
}
