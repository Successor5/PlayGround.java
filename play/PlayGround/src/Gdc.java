import java.util.Scanner;

public class Gdc {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int number = scanner.nextInt();
        int num = scanner.nextInt();

        int greatest;
        if (number > num) {
            greatest = number;
        } else {
            greatest = num;
        }

        int gdc = 0;
        for (int i = 1; i <= greatest; i++) {
            if (number % i == 0 && num % i == 0) {
                gdc = i;
            }
        }

        if (gdc != 0) {
            System.out.printf("The GCD of %d and %d is %d", number, num, gdc);
        } else {
            System.out.println("There is no GCD for these two numbers");
        }
    }
}

