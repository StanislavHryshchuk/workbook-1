package week_3.Constructor;

public class Cupcake {
    private String flavour;
    private int calories;
    public Cupcake(){
        this.flavour = "Unknown";
        this.calories = 0;
    }
    public Cupcake(String flavour, int calories ){
        this.flavour = flavour;
        this.calories = calories;
        System.out.println("You created " + flavour + " cake with " + calories);
        System.out.println(isHealthy());
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public boolean isHealthy(){
        if (calories < 200){
            return true;
        } else {
            return false;
        }
    }
}
