package week_3.ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListWork {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Manta ray");
        animals.add("Giraffe");
        animals.add("Octopus");
        animals.add("cat");
        animals.remove(1);
        System.out.println(animals.indexOf("Octopus"));
        animals.forEach(System.out::println);

        for (String animal:animals){
            System.out.println(animal);
        }

    }
}
