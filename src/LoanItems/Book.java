package LoanItems;

public class Book extends Media {

    //Fuld konstruktør
    public Book(String type, String title) {
        super(type, title);
    }

    //toString metode
    @Override
    public String toString() {
        return type + title;
    }
}
