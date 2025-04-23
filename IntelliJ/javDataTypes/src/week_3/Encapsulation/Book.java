package week_3.Encapsulation;

public class Book {
    private String name;
    private int numPages;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumPages() {

        return numPages;
    }

    public void setNumPages(int numPages) {
        if (numPages >= 0){
            this.numPages = numPages;
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0){
            this.price = price;
        }

    }

    public void Book(String fairyTail, String stan) {

    }
}
