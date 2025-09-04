package OOPS.sessional_;
    import java.util.Scanner;

    public class brejesh1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            String[] words = input.split(" ");
            StringBuilder result = new StringBuilder();

            for (String word : words) {
                int sum = calculateDifferenceSum(word);
                result.append(sum);
            }

            System.out.println("Resulting number: " + result.toString());
        }

        private static int calculateDifferenceSum(String word) {
            int sum = 0;
            int length = word.length();
            for (int i = 0; i < length / 2; i++) {
                sum += Math.abs(word.charAt(i) - word.charAt(length - 1 - i));
            }
            if (length % 2 != 0) {
                sum += Math.abs(word.charAt(length / 2) - 'a'); // Assuming 'a' as the center for odd-length words
            }
            return sum;
        }
    }
