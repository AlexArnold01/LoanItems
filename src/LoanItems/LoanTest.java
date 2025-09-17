package LoanItems;

import java.util.Scanner;

public class LoanTest {
    public static void main(String[] args) {
        welcomeMessage();
        registerMedia();
    }

public static void welcomeMessage () {
    String welcomeMessage = "Welcome to the media den!";
    System.out.println(welcomeMessage);
}

    public static void registerMedia() {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many items would you like to register?");
        int numOfMedia = sc.nextInt();

        Media[] media = new Media[numOfMedia];

        for (int i = 0; i < media.length; i++) {

            System.out.println("What type of item would you like to register. Type either B or V (Book or Video)");
            String type = sc.nextLine();
            sc.nextLine();

            System.out.println("What is the title of your item?");
            String title = sc.nextLine();

            if(type.equalsIgnoreCase("B")) {
              media[i] = new Book(" ", title);
        } else if (type.equalsIgnoreCase("V")) {
            media[i] = new Video(" ", title);
         }
     }

        printOut(media);
    }

    public static void printOut(Media[] media) {
        for (int i = 0; i < media.length; i++) {
            System.out.println(media[i]);
        }
    }
    }
