import java.util.Scanner;

public class WordsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter word");
        String word = scanner.nextLine();
        for (int i = 1; i < word.length(); i++) {

            System.out.println(i);
        }
    }
}
