import java.util.Scanner;

public class MadLibsRevised {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String madLib1 = new String(
                "I went to the animal <noun>, the <plural noun> and the <number> beasts were there.");

        System.out.println("The original story is: " + madLib1);
        System.out.println("Enter a " + madLib1.substring(madLib1.indexOf("<") + 1, madLib1.indexOf(">")) + ":");
        String userInput = scanner.nextLine();
        madLib1 = madLib1.substring(0, madLib1.indexOf("<")) + userInput + madLib1.substring(madLib1.indexOf(">") + 1);
        System.out.println("Enter a " + madLib1.substring(madLib1.indexOf("<") + 1, madLib1.indexOf(">")) + ":");
        userInput = scanner.nextLine();
        madLib1 = madLib1.substring(0, madLib1.indexOf("<")) + userInput + madLib1.substring(madLib1.indexOf(">") + 1);
        System.out.println("Enter a " + madLib1.substring(madLib1.indexOf("<") + 1, madLib1.indexOf(">")) + ":");
        userInput = scanner.nextLine();
        madLib1 = madLib1.substring(0, madLib1.indexOf("<")) + userInput + madLib1.substring(madLib1.indexOf(">") + 1);
        System.out.println(madLib1);

        madLib1 = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        System.out.println("The original story is: " + madLib1);
        System.out.println("Enter a " + madLib1.substring(madLib1.indexOf("<") + 1, madLib1.indexOf(">")) + ":");
        userInput = scanner.nextLine();
        madLib1 = madLib1.substring(0, madLib1.indexOf("<")) + userInput + madLib1.substring(madLib1.indexOf(">") + 1);
        System.out.println("Enter a " + madLib1.substring(madLib1.indexOf("<") + 1, madLib1.indexOf(">")) + ":");
        userInput = scanner.nextLine();
        madLib1 = madLib1.substring(0, madLib1.indexOf("<")) + userInput + madLib1.substring(madLib1.indexOf(">") + 1);
        System.out.println("Enter a " + madLib1.substring(madLib1.indexOf("<") + 1, madLib1.indexOf(">")) + ":");
        userInput = scanner.nextLine();
        madLib1 = madLib1.substring(0, madLib1.indexOf("<")) + userInput + madLib1.substring(madLib1.indexOf(">") + 1);
        System.out.println(madLib1);

        madLib1 = "I was late to school today because my <noun> <adverb> stole my <another noun>.";
        System.out.println("The original story is: " + madLib1);
        System.out.println("Enter a " + madLib1.substring(madLib1.indexOf("<") + 1, madLib1.indexOf(">")) + ":");
        userInput = scanner.nextLine();
        madLib1 = madLib1.substring(0, madLib1.indexOf("<")) + userInput + madLib1.substring(madLib1.indexOf(">") + 1);
        System.out.println("Enter a " + madLib1.substring(madLib1.indexOf("<") + 1, madLib1.indexOf(">")) + ":");
        userInput = scanner.nextLine();
        madLib1 = madLib1.substring(0, madLib1.indexOf("<")) + userInput + madLib1.substring(madLib1.indexOf(">") + 1);
        System.out.println("Enter a " + madLib1.substring(madLib1.indexOf("<") + 1, madLib1.indexOf(">")) + ":");
        userInput = scanner.nextLine();
        madLib1 = madLib1.substring(0, madLib1.indexOf("<")) + userInput + madLib1.substring(madLib1.indexOf(">") + 1);
        System.out.println(madLib1);

    }
}