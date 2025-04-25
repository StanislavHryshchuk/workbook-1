package week_3.writingReadingFile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class userAddBook {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        writingFile();
    }

    public static void writingFile(){
        try (FileWriter fr = new FileWriter("index1.txt",true)){
            fr.write((new Book(scanner.nextLine(),scanner.nextLine()).toFile()));
//
//
//            int count = 0;
//            Book[] books = new Book[3];
//            while (count < 3) {
//                System.out.println("Please enter the Title and Author of the Book " + (count + 1));
//                books[count] = new Book(scanner.nextLine(),scanner.nextLine());
//                count++;
//            }
//            for (Book book: books){
//                fr.write(book.getTitle() + "|" + book.getAuthor() + "\n");
//            }

//                books [count] = new Book(scanner.nextLine(),scanner.nextLine());

//                fr.write(fr.append(scanner.nextLine()).toString());

        }catch (IOException | InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }
}
