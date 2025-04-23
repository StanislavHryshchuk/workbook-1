package week_3.Encapsulation;

public class encapsulation {
    public static void main(String[] args) {
        Car car = new Car("RS 6", "Audi", 200);
        car.setPrice(50000);
        car.setMake("BMW");
        car.setModel("X6 M Competition");
        car.setPrice(-20);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getPrice());
        Car car1 = new Car();

        Book book = new Book();
        book.setPrice(23.50);
        book.setName("Fairytale");
        book.setNumPages(120);


    }
}
