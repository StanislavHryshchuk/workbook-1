package week_3.ListsExercise;


public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private float price;
    private int quantityOfItem;

    public Product(int id, int quantityOfItem,String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantityOfItem = quantityOfItem;

    }
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public float getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Product name: " + name + "\nID - " + id + "\n" + "Quantity: " + quantityOfItem + "\nPrice: " +"$"+ price + "\n";
    }

    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.id,o.id);
    }



}