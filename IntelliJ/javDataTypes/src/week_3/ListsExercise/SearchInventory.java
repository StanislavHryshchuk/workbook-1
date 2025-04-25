package week_3.ListsExercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f\n",
                    p.getId(), p.getName(), p.getPrice());
        }

        List<Product> returnFromFile = getProductsFromFile();
        Collections.sort(returnFromFile, Comparator.comparing(Product::getName));
        returnFromFile.forEach(System.out::println);

    }
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();
        inventory.add(new Product(1,10,"Hammer",9.31F));
        inventory.add(new Product(2,2,"Drill", 15.99F));
        inventory.add(new Product(3,3,"Box of Nails", 5.22F));
        return inventory;
    }

    public static ArrayList<Product> getProductsFromFile(){
        ArrayList<Product> inventory = new ArrayList<>();
        try(BufferedReader bf = new BufferedReader( new FileReader( "IntelliJ/javDataTypes/src/week_3/ListsExercise/inventory.csv" ))){
            String line;

            while ((line = bf.readLine())!= null){
                String[] splitLine = line.split("\\|");
                inventory.add(new Product(Integer.parseInt(splitLine[0]),Integer.parseInt(splitLine[1]),splitLine[2],Float.parseFloat(splitLine[3])));

            }

        }catch(IOException | InputMismatchException e){
            System.out.println(e.getMessage());
        }return inventory;
    }
}
