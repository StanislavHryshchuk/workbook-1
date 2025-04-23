package week_2.OOP_objectOrientedProgramming.Basic_OOP;

public class basic_OOP {
    public static void main(String[] args) {

        classCats cat1 = new classCats();
        cat1.name = "Nightmare";
        cat1.colour = "Green";
        cat1.numOfLegs = 4;
        cat1.age = 5;
        cat1.meow();



        classDogs dog1 = new classDogs();
        dog1.name = "werewolf";
        dog1.colour = "Purple";
        dog1. numOfLegs = 2;
        dog1.age = 5;
        dog1.bark();

        monsterTransformation monsterCat = new monsterTransformation();
        monsterCat.eyesColour = "Red";
        monsterCat.numberOfLegs = 8;
        monsterCat.speed = "of light";
        monsterCat.name = cat1.name;
        monsterCat.destroingYourHome();

    }
}
