import java.util.Scanner;

public class StringOp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try {
            if (input.isEmpty()) {
                throw new Exception("Empty String");
            }

            System.out.println(input.length());  // Display length of string
            System.out.println(input.charAt(0)); // Display first character
            System.out.println(input.charAt(input.length() - 1)); // Display last character
            System.out.println(input.substring(1, 5)); // Display substring from index 1 to index 4
        } catch (Exception e) {
            System.out.println("Empty String");
        }
    }
}
