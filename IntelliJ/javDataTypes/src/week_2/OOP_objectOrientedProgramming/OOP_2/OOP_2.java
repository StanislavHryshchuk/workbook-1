package week_2.OOP_objectOrientedProgramming.OOP_2;

public class OOP_2 {
    public static void main(String[] args) {

        house house1 = new house();
        house1.colour = "White";
        house1.numOfDors = 10;
        house1.stories = 3;
        house1.openDoors();

        car car1 = new car();
        car1.colour= "Purple";
        car1.make = "BMW";
        car1.model = "X6 M Competition";
        car1.numOfWheels = 4;
        car1.engineStart();
    }
}
