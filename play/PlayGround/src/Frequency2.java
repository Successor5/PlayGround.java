import java.util.Scanner;

public class Frequency2 {
     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string:");
            String word = scanner.nextLine();
            for (int i = 0; i < word.length(); i++) {
                int count = 0;
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        count++;
                    }
                }
                System.out.println(word.charAt(i) + ": " + count);
            }
        }
    }

