package pl.rogowski;
import java.util.Scanner;

class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Choose a day  (1-7):");
            int day = scanner.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday . It's weekend !");
                    break;
                case 7:
                    System.out.println("Sunday . It's weekend!");
                    break;
                default:
                    System.out.println("Probably this day doesn't exist. Try one more time (:");
                    continue;
            }
            break;
        }
    }
}
