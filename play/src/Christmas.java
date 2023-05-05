import java.util.Scanner;

public class Christmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a day");
        int day = scanner.nextInt();
        switch (day){
            case 12:
                System.out.println(" on the twelve day of christams");
                break;
            case 11:
                System.out.println(" on the  eleven day of christmas");
                break;
            case 10:
                System.out.println("on the tenth day of christmas");
                break;
            case 9:
                System.out.println(" on the nineth day of christam");
                break;
            case 8:
                System.out.println(" on the eight day of christmas");
                break;
            case 7:
                System.out.println("on the seven  day of christmas");
                break;
            case 6:
                System.out.println("on the sixth day of christmas");
                break;
            case 5:
                System.out.println("on the fifth day of christmas");
                break;
            case 4:
                System.out.println("on the forth day of christmas");
                break;
            case 3:
                System.out.println("on the third day of christmas");
                break;
            case 2:
                System.out.println("on the secound day of christmas");
                break;
            case 1:
                System.out.println("on the first day of christmas");
                break;
            default:
                System.out.println("invalid imput");
        }
        if (day>=1&& day<=12){
            switch (day){
                case 12:
                    System.out.println("twelve drummer dumming");
                case 11:
                    System.out.println("eleven pipers piping");
                case 10:
                    System.out.println("ten loard are leaping");
                case 9:
                    System.out.println("nine ladies dancing");
                case 8:
                    System.out.println("eight maids are making");
                case  7:
                    System.out.println("seven swans are swining");
                case 6:
                    System.out.println("six geese are laying");
                case 5:
                    System.out.println("five golden ring");
                case 4:
                    System.out.println("four calling bird");
                case 3:
                    System.out.println("three french hen");
                case 2:
                    System.out.println("two turtle doves");
                case 1:
                    System.out.println("a partridge in a pear tree");
                    break;
                default:
                    System.out.println("invalid input");

            }
        }
    }
}
