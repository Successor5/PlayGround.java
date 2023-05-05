import java.util.Arrays;
import java.util.Scanner;

public class Revers {
    public static void main(String[] args) {
        String letters = "year";
        char[] array = letters.toCharArray();
        for (int i = array.length; i > 0 ; i--) {
            System.out.print(array[i-1]);
        }
    }
}
