import java.util.Scanner;
public class Main {
    public String loadMadLib(String n1, String n2, String adj1, String v1, String n3, String v2, String adj2, String adj3, String n4, String n5) {

        String madLib = "One " + n1 + " named " + n2 + " was a very\n " + adj1 + " chum. He moped and " + v1 + " a lot, in \n fact, they called him a big " + n3 + ". Then one day, he\n " + v2 + " to school he was " + adj2 + " all the way.\n Though now he was " + adj3 + ". Yayyyyy. Santa came on his \n" + n4 + " with many many " + n5 + " and with all these\n gifts recieved, we all smiled in glee.";

        return madLib;


    }

    static String capitalizeFirstLetter(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        s = s.toLowerCase();
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

    static String lowercaseString(String s) {
        if (s == null) return null;
        return s.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun1 = scanner.nextLine();
        noun1 = lowercaseString(noun1);

        System.out.print("Enter a name: ");
        String name1 = scanner.nextLine();
        name1 = capitalizeFirstLetter(name1);

        System.out.print("Enter an adjective: ");
        String adj1 = scanner.nextLine();
        adj1 = lowercaseString(adj1);

        System.out.print("Enter an verb in past tense: ");
        String verb1 = scanner.nextLine();
        verb1 = lowercaseString(verb1);

        System.out.print("Enter an noun: ");
        String noun2 = scanner.nextLine();
        noun2 = lowercaseString(noun2);

        System.out.print("Enter an verb in past tense: ");
        String verb2 = scanner.nextLine();
        verb2 = lowercaseString(verb2);

        System.out.print("Enter an adjective: ");
        String adj2 = scanner.nextLine();
        adj2 = lowercaseString(adj2);

        System.out.print("Enter an adjective: ");
        String adj3 = scanner.nextLine();
        adj3 = lowercaseString(adj3);

        System.out.print("Enter an noun: ");
        String noun3 = scanner.nextLine();
        noun3 = lowercaseString(noun3);

        System.out.print("Enter an noun: ");
        String noun4 = scanner.nextLine();
        noun4 = lowercaseString(noun4);

        Main madLibInstance = new Main();
        System.out.println(madLibInstance.loadMadLib(noun1, name1, adj1, verb1, noun2, verb2, adj2, adj3, noun3, noun4));

        scanner.close();
    }

}