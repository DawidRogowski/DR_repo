package pl.rogowski;


public class Main {
    public static void main(String[] args) {
        String s1 = " Chcę zostać programistą (:";
        String s = "Jestem Dawid";
        System.out.println(s + s1);

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


