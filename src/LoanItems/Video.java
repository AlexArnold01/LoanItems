package LoanItems;

public class Video extends Media {
    //Fuld konstruktør
    public Video(String type, String title) {
        super(type, title);
    }
    @Override
    public void printInfo() {
        System.out.println("Title: " + title);
        super.printInfo();
    }
}
