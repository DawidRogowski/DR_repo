import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//       // String s1 = "Chcę zostać programistą (:";
        //System.out.println(s + s1);

        String[] users = {"Dawid", "Magda", "Justyna", "Marek", "Jadwiga",};
        String sex = "null";
        for (String user : users) {

            if (user.endsWith("a")) {
                sex = "woman";
                System.out.println("User " + user + " is a " + sex);

            } else {
                sex = "man";
                System.out.println("User " + user + " is a " + sex);

            }
        }
    }
}


class Switch {
    public static void main(String[] args) { // modyfikacja o zapytanie ze strony uzytkownika
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



