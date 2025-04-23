package week_3.Encapsulation;

public class Car {
    private String model;
    private String make;
    private int price;

    public int getPrice() {
        return price;
    }
    public Car(){}
    public Car(String model, String make, int price){
        this.model = model;
        this.make = make;
        this.price = price;
    }
    public void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        }

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
