package week_3.writingReadingFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class writingReading {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        //writeFile();
        readFile();


    }
    public static void writeFile(){

        try (FileWriter fr = new FileWriter("input.txt")){
            fr.write("Hello Reader. My name is Stan and i'm a creator of this File. Welcome...\n");
            fr.write("I'm livin in Seattle. ");
            fr.write("Enjoying summer, hate the rain)\n");

            String[] myText = {"My name is Stan, ", "my home is in Seattle.\n"};
            for (String text: myText){
                fr.write(text);
            }

            System.out.println("Please write a word u looking for");
            fr.write((scanner.nextLine() + "\n"));

            Book[] books = {new Book("Stan", "FairyTail"), new Book("Maaike", "Java for Teapots")};
            for (Book book: books){
                fr.write(book.getTitle() + " | " + book.getAuthor()+ "\n");
            }



        } catch (IOException | InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }
    public static void readFile(){
        try (BufferedReader bf = new BufferedReader(new FileReader("input.txt"))){

            String line;
            int count = 0;
            int count1 = 0;

            Book[] books2 = new Book[100];
            while ((line = bf.readLine()) != null){
                System.out.println(line);

                if (line.contains("|")){
                    String[] bookLine = line.split("\\|");
                    books2 [count1] = new Book(bookLine[0],bookLine[1]);
                    count1++;
                }
            }
            System.out.println(Arrays.toString(books2));
            System.out.println(count1);

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
