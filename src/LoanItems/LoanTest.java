package LoanItems;

import java.util.Scanner;

public class LoanTest {

    public static void main(String[] args) {
        welcomeMessage();
        registerMedia();
    }

    public static void welcomeMessage() {
        String welcomeMessage = "Welcome to the media den!";
        System.out.println(welcomeMessage);
    }

    public static void registerMedia() {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many items would you like to register?");
        int numOfMedia = sc.nextInt();
        sc.nextLine();


        Media[] media = new Media[numOfMedia];

        for (int i = 0; i < media.length; i++) {

            String itemNum = ((i + 1));

            System.out.print("What type of item would you like to register. Type either B or V (Book or Video): ");
            String type = sc.nextLine();

            System.out.print("What is the title of your item? ");
            String title = sc.nextLine();

            if (type.equalsIgnoreCase("B")) {
                media[i] = new Book(type, title);
            } else if (type.equalsIgnoreCase("V")) {
                media[i] = new Video(type, title);
            } else {
                System.out.println("Invalid type! \nPlease retry and write either B or V as a type. \n  ");
                media = new Media[0];
                registerMedia();
            }
        }
        printOut(media);

    }

    public static void printOut(Media[] media) {
        for (int i = 0; i < media.length; i++) {
            System.out.println((i + 1) + "# " + media[i]);
        }
    }
}
