package LoanItems;

public class Book extends Media {

    //Fuld konstruktør
    public Book(String type, String title) {
        super(type, title);
    }

    //toString metode, @overider Media() toString.
    @Override
    public String toString() {
        return "Type: " type + title;
    }
}
