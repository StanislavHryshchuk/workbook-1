package week_3.HashMapExercises;

public class Pet {
    private String nameOfPet;
    private int age;
    private String breed;

    public Pet(String nameOfPet, String breed, int age){
        this.nameOfPet = nameOfPet;
        this.breed = breed;
        this.age = age;
    }

    public String getNameOfPet() {
        return nameOfPet;
    }

    public void setNameOfPet(String nameOfPet) {
        this.nameOfPet = nameOfPet;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
