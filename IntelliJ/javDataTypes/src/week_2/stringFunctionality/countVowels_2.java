package week_2.stringFunctionality;

public class countVowels_2 {

    public static void main(String[] args) {


        String fruit1 = "Apple";
        String fruit2 = "Banana";
        System.out.println(fruit1.compareTo(fruit2));

        String noVowels =  fruit2.replaceAll("a", "");
        noVowels =  noVowels.replaceAll("e", "");
        noVowels =  noVowels.replaceAll("i", "");
        noVowels =  noVowels.replaceAll("o", "");
        noVowels =  noVowels.replaceAll("u", "");

        System.out.println(fruit2.length() - noVowels.length());

        String noVowels1 =  fruit2.replaceAll("[aeiou]","");
        System.out.println(fruit2.length() - noVowels.length());
    }
}
