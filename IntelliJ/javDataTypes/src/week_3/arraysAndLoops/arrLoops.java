package week_3.arraysAndLoops;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class arrLoops {
    static Scanner scanner = new Scanner (System.in);

    public static void main(String[] args) {

        //1
        int[] arr1 = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        //2
        int num = 5;
        while (num != 0) {
            System.out.println(num--);
        }

        //3
        String[] names = {"Stan", "Maaike", "Willmer", "Linda", "Yohaness"};
        for (String name : names) {
            System.out.println("Hello " + name);
        }

        //4
        int total = 0;
        int[] sum = {5, 45, 75, 12, 20};
        for (int number : sum) {
            total += number;
        }
        System.out.println(total);

        //6
        int[] arr2 = {1, 3, 5, 7, 9};
        int i = 0;
        while (i != arr2.length) {

            if (arr2[i] == 7) {
                break;
            } else {
                System.out.println(arr2[i++]);
            }
        }

        //5
        int[] arr3 = {4, 7, 10, 15, 18};
        for (int num3 : arr3) {
            if (num3 % 2 == 0) {
                System.out.println(num3);
            }
        }

        //7
        String userInput;
        do {
            System.out.println("Please enter the password");
            userInput = scanner.nextLine();
        } while (!userInput.equals("secret123"));

        //8
        String[] words = {"Java", "Python", "Java", "C#", "Java"};
        int match = 0;
        for (String word : words) {
            if (word.equals("Java")) match++;
        }
        System.out.println(match);

        //9
        int[] numbers = {12,1235,90,34,7,150,22550};
        int maxValue = 0;
        for (int number: numbers){
            if (maxValue < number) {
              maxValue = number;
            }
        }
        System.out.println(maxValue);

        //10
        int[] num1 = {1,3,5,12,4};
        int[] num2 = {1,2,5,12,6};
        for (i = 0; i< num1.length; i++){
            System.out.println(num1[i] == num2[i]);
        }

        //11
        int[] a = {1, 2, 3, 4};
        int[] b = new int[a.length];
        for (i=0; i< a.length; i++){
            b[i] = a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        //12
        int[] arr4 = {10,20,30};
        for (int j = arr4.length-1; j >=0; j--){
            System.out.println(arr4[j]);
        }
        //13-14-15
        Book[] books = {new Book("Stan", "Fairytail",14), new Book("Alice", "tail",50),new Book("Mom","Twins",350)};
        int count = 0;
        for (Book book: books){
            System.out.println(book.getTitle());
            if (book.getAuthor().equals("Alice")){
                count ++ ;
            }
            if (book.getPages() > 300){
                System.out.println(book.getTitle());
            }
        }
        System.out.println(count);
    }
}



