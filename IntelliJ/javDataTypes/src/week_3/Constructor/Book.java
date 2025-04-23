package week_3.Constructor;

public class Book {
    private String title;
    private String author;
    private int numPages;
    public String getTitle() {
        return title;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
    }

    public Book(){
        this.title = "untitled";
        this.author = "unknown";
        this.numPages = 0;
    }

    public void describe(){
        System.out.println("This book is " + title + " by " + author + " (" + numPages + " pages.)");
    }

    public void describe2(){
        System.out.println("The book name is " + title + " written by " + author + " with " + numPages + " pages.");
    }


}