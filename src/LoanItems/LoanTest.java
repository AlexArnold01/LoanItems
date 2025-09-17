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

        System.out.print("How many items would you like to register?: ");
        int numOfMedia = sc.nextInt();
        sc.nextLine();


        Media[] media = new Media[numOfMedia];

        for (int i = 0; i < media.length; i++) {

            System.out.println("ITEM No. " + (i + 1));

            System.out.print("\tWhat type of item would you like to register. Type either B or V (Book or Video): ");
            String type = sc.nextLine();

            System.out.print("\tWhat is the title of your item?: ");
            String title = sc.nextLine();

            if (type.equalsIgnoreCase("B")) {
                type = "Book";
                media[i] = new Book(title, type);
            } else if (type.equalsIgnoreCase("V")) {
                type = "Video";
                media[i] = new Video(title, type);
            } else {
                System.out.println("Invalid type! \nPlease retry and write either B or V as a type. \n  ");
                media = new Media[0];
                registerMedia();
            }
        }
        printOut(media);

    }

    public static void printOut(Media[] media) {
        System.out.print("\nLIST OF LOAN ITEMS:\n------------------------------------");
        System.out.printf("\n%-10s %-10s %-10s%n", "ID", "TYPE", "TITLE");
        for (int i = 0; i < media.length; i++) {
            System.out.printf("%-10d %-10s %-10s%n", i + 1, media[i].getType(), media[i].getTitle());
        }
        System.out.print("------------------------------------");
    }
}
