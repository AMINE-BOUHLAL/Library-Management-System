package LIBRARY;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    static ArrayList<classbooks> Arrlistename = new ArrayList<>();


    public static void addbook() {
        // declation de le object
        classbooks book1 = new classbooks();
        System.out.println("title");
        book1.title = scanner.next();
        System.out.println("author");
        book1.author = scanner.next();
        System.out.println("ISBN");
        book1.ISBN = scanner.next();
        System.out.println("Dispo");
        book1.dispo = scanner.nextBoolean();
        Arrlistename.add(book1);
    }
    public static void showBook() {
        if (Arrlistename.isEmpty()) {
            System.out.println("no book");
        } else {
            for (int i = 0; i < Arrlistename.size(); i++) {
                System.out.println("title is"+Arrlistename.get(i).title);
                System.out.println("author is"+Arrlistename.get(i).author);
                System.out.println("ISBN is"+Arrlistename.get(i).ISBN);
                System.out.println("dispo is"+Arrlistename.get(i).dispo);
            }
        }
    }
    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("-LIBRARY-");
            System.out.println("1.  Add  : ");
            System.out.println("2.   show  :");
            System.out.println("3. Search : ");
            System.out.println("4. Delete :");
            System.out.println("5. Modify : ");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addbook();
                    break;
                case 2:
                    showBook();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:

            }
        }

    }
}