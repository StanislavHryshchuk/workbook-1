package week_2.OOP_objectOrientedProgramming.Basic_OOP;

public class classDogs {

    String name;
    String colour;
    int age;
    int numOfLegs;

    public void bark(){
        System.out.println(name + " says: Bark! (in a " + colour + ", " + age + " years, " + numOfLegs + " legs\n");
    }
}
