package LoanItems;

public class Book extends Media {

    //Fuld konstruktør
    public Book(String type, String title) {
        super(type, title);
    }
    @Override
    public void printInfo() {
        System.out.println("Book: " + title);
        super.printInfo();
    }
}
