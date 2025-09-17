package LoanItems;
//Superclass
public class Media {
//Attributter
    protected String title;
    protected String type;

//Fuld konstruktør
    public Media(String title, String type) {
        this.title = title;
        this.type = type;
    }
//Tostring metode()
        @Override
    public String toString() {
            return type + ": " + title;
        }
//Getters
    public String getTitle() {
        return title;
    }
    public String getType() {
        return type;
    }
//Setters (Har ingen funktion i denne kode)
    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }
}
