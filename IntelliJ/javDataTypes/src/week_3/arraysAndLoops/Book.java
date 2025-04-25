package week_3.arraysAndLoops;

public class Book {
    private String author;
    private String title;
    private int pages;
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Book(){

    }

    public Book(String author, String title, int pages){
        this.author = author;
        this.title = title;
        this.pages = pages;
    }
}
