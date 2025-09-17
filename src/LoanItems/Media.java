package LoanItems;

public class Media {
    protected String title;
    protected String type;


    public Media(String title, String type) {
        this.title = title;
        this.type = type;
    }
    public void printInfo() {
        System.out.println("Title: " + title);
}

        @Override
    public String toString() {
            return type + ": " + title;
        }
    public String getTitle() {
        return title;
    }
    public String getType() {
        return type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }
}
