import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String word = scanner.nextLine();
        int count=0;
        for (int i = 0; i < word.length(); i++) {
            if (count<i)
                count++;
            System.out.println(word.charAt(i));
            System.out.println(count);

        }
    }
}
