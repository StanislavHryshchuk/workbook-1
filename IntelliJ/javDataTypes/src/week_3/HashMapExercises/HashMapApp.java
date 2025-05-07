package week_3.HashMapExercises;

import java.util.*;

public class HashMapApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String,String> favoriteCars = new HashMap<>();
        favoriteCars.put("Stan", "Audi RS 6");
        favoriteCars.put("Sviat", "BMW X6 M Competition");
        favoriteCars.put("Bob", "Toyota Prius");
        System.out.println(favoriteCars.get("Stan"));
        favoriteCars.put("Slav", "lada");
        favoriteCars.remove("Stan");
        System.out.println(favoriteCars.containsKey("Stan"));
        System.out.println(favoriteCars.containsKey("Slav"));

        for (String car: favoriteCars.keySet()){
            System.out.println(favoriteCars.get(car));
        }

        Map<String, List<Pet>> peoplePets = new HashMap<>();
        List<Pet> ownerOfPets = new ArrayList<>();
        ownerOfPets.add(new Pet("Lapa","Street cat", 3));
        ownerOfPets.add(new Pet("Lapa","Street cat", 3));
        ownerOfPets.add(new Pet("Lapa","Street cat", 3));


        peoplePets.put("Stan",ownerOfPets);
        System.out.println(peoplePets.get("Stan"));

        for (Pet p : peoplePets.get("Stan")){
            System.out.println(p.getNameOfPet());
        }
    }
}
