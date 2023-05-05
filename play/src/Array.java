import java.util.Scanner;

public class Array {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            int[] primes = lcm(num);
            int[] factors = new int[primes.length];

            for(int i = 0; i < primes.length; i++) {
                int factor = primes[i];
                while(factor <= num) {
                    factors[i] += num % factor == 0 ? 1 : 0;
                    factor *= primes[i];
                }
            }

            System.out.print("LCM is: ");
            for(int i = 0; i < primes.length; i++) {
                for(int j = 0; j < factors[i]; j++) {
                    System.out.print(primes[i] + " ");
                }
            }
        }

    public static int[] lcm(int num) {
            int[] primes = new int[num];
            int index = 0;

            while(num % 2 == 0) {
                primes[index++] = 2;
                num /= 2;
            }

            for(int i = 3; i <= Math.sqrt(num); i += 2) {
                while(num % i == 0) {
                    primes[index++] = i;
                    num /= i;
                }
            }

            if(num > 2) {
                primes[index++] = num;
            }

            int[] result = new int[index];
            for(int i = 0; i < index; i++) {
                result[i] = primes[i];
            }
            return result;
        }
    }