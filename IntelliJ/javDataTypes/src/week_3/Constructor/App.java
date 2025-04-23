package week_3.Constructor;



public class App {
    public static void main(String[] args) {
        Book book1 = new Book("FairyTail", "Stan", 15);
        Book book2 = new Book("longStoryShort", "Stan", 20);
        book1.describe();
        book2.describe2();
        Book book3 = new Book();
        book3.setNumPages(15);

        Cupcake cupcake1 = new Cupcake("Strawberry", 150);
        System.out.println(cupcake1);
    }
}
