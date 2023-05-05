import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        int largest = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int number = scanner.nextInt();
        System.out.println("enter a number");
        int num = scanner.nextInt();
        if (number> num){
            largest=number;
            System.out.println( largest);
        }
        else System.out.println(num);
    }
}
