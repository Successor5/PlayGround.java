import java.util.InputMismatchException;
import java.util.Scanner;
public class OddNumbers {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        try {
            int number = scanner.nextInt();
            loop(number);
        }
        catch (InputMismatchException e){
            System.out.println("invalid number");

        }
    }

    public static void loop(int number){
        if (number < 1){
            System.out.println("wrong input");
        }
        else {
            for (int i = 1; i < number; i+=2) {
                System.out.println(i);
            }
        }
    }
}

