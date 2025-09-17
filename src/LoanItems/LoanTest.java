package LoanItems;

import java.util.Scanner;

public class LoanTest {

    public static void main(String[] args) {
        welcomeMessage();
        registerMedia();
    }
//Printer velkomstbesked til brugeren
    public static void welcomeMessage() {
        String welcomeMessage = "Welcome to the media den!";
        System.out.println(welcomeMessage);
    }
//Initialisere scanneren så vi kan tage imod bruger input og tage imod en integer
    public static void registerMedia() {
        Scanner sc = new Scanner(System.in);//laver nyt scanner object
//Beder brugeren intaste et tal for hvor mange bøger/film de vil registrere tallet og registrere det i medie arrayet på linje 25.
        System.out.print("How many items would you like to register?: ");
        int numOfMedia = sc.nextInt();
        sc.nextLine();


        Media[] media = new Media[numOfMedia];
//Foor-loop der tæller hver ting brugeren registrere og viser det i tælleren der bliver printet på linje 29.
        for (int i = 0; i < media.length; i++) {

            System.out.println("ITEM No. " + (i + 1));
//Spørger om hvilken type medie det er samt beder om input fra brugeren.
            System.out.print("\tWhat type of item would you like to register. Type either B or V (Book or Video): ");
            String type = sc.nextLine();
//Beder om navnet på mediet og tager imod input.
            System.out.print("\tWhat is the title of your item?: ");
            String title = sc.nextLine();
//If statement der tjekker hvad brugeren har inputtet og beder om korrekt input hvis der er tastet noget der ikke passer.
//Hvis typen er B eller V så bliver der kreeret et array med typen subclass
            if (type.equalsIgnoreCase("B")) {
                type = "Book";
                media[i] = new Book(title, type);
            } else if (type.equalsIgnoreCase("V")) {
                type = "Video";
                media[i] = new Video(title, type);
//Hvis typen ikke er B eller V vil den gendanne den originale værdi af arrayet (null) og køre metoden igen.
            } else {
                System.out.println("Invalid type! \nPlease retry and write either B or V as a type. \n  ");
                media = new Media[0];
                registerMedia();
            }
        }
        printOut(media);

    }
//printer liste af alle de objekter der er tastet ind og sætter dem i kolonner med fast størrelse.
    public static void printOut(Media[] media) {
        System.out.print("\nLIST OF LOAN ITEMS:\n------------------------------------");
        System.out.printf("\n%-10s %-10s %-10s%n", "ID", "TYPE", "TITLE");
        for (int i = 0; i < media.length; i++) {
            System.out.printf("%-10d %-10s %-10s%n", i + 1, media[i].getType(), media[i].getTitle());
        }
        System.out.print("------------------------------------");
    }
}
