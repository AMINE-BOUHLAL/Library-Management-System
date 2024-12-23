package LIBRARY;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    static Scanner scanner = new Scanner(System.in);           // SCANNER LI KAYSCANER GA3 VLRS LI KYDKHL L USER
    static ArrayList<classbooks> books = new ArrayList<>();     //ARRY LISTE

    public static void addBook() {
        classbooks newlivre = new classbooks();           // OBJECT

        System.out.println("Titre:");
        newlivre.title = scanner.nextLine();
        System.out.println("Auteur:");
        newlivre.author = scanner.nextLine();
        System.out.println("ISBN:");
        newlivre.ISBN = scanner.nextLine();
        System.out.println("Disponibilité (true/false):");
        while (!scanner.hasNextBoolean()) {   // ILA DKHL USER VLR MNGHIR TRUE OR FALSE
            System.out.println("Veuillez entrer true ou false.");
            scanner.next();
        }
        newlivre.dispo = scanner.nextBoolean();
        books.add(newlivre);

        System.out.println("Le livre a été ajouté avec succès!");
    }

    public static void removeBook() {
        System.out.println("Entrez le titre de livre");
        String titre = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < books.size(); i++) {
            if (titre.equals(books.get(i).title)) {
                books.remove(i);
                System.out.println("Le livre a été supprimé avec succès !");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Livre non trouvé");
        }
    }

    public static void afficherBook() {
        if (books.isEmpty()) {
            System.out.println("La liste des livres est vide");
        } else {
            for (classbooks book : books) {
                System.out.println("Titre: " + book.title);
                System.out.println("Auteur: " + book.author);
                System.out.println("ISBN: " + book.ISBN);
                System.out.println("Disponibilité: " + book.dispo);
            }
        }
    }

    public static void modifierBook() {
        System.out.println("Entrer le titre du livre à modifier");
        String titre = scanner.nextLine();
        for (int i=0;i<books.size();i++) {
            if (books.get(i).title.equals(titre)) {
                System.out.println("Entrer le nouveau titre:");
                books.get(i).title=scanner.nextLine();
                System.out.println("Entrer le nouveau auteur:");
                books.get(i).author=scanner.nextLine();
                System.out.println("Entrer le nouveau ISBN:");
                books.get(i).ISBN=scanner.nextLine();
                System.out.println("Entrer la nouvelle disponibilité :");
                books.get(i).dispo=scanner.nextBoolean();
                System.out.println("Le livre a été modifié avec succès !");
            }else{
                System.out.println("Livre non trouvé");
            }
        }
        }

    public static void rechercherLivre() {
        System.out.println("Entrez le titre du livre");
        String titre = scanner.nextLine();
        for (int i = 0; i < books.size(); i++) {
            if (titre.equals(books.get(i).title)) {
                System.out.println("Titre: " + books.get(i).title);
                System.out.println("Auteur: " + books.get(i).author);
                System.out.println("ISBN: " + books.get(i).ISBN);
                System.out.println("Disponibilité: " + books.get(i).dispo);
            }else{
                System.out.println("Livre non trouvé");
        }
        }


        }

    public static void main(String[] args) {
        
        int choix;
        System.out.println("-_-_-_-_-_-_-MENU-_-_-_-_-_-_-_-_-");
        System.out.println("1- Ajouter livres ");
        System.out.println("2- Afficher livre  ");
        System.out.println("3- Supprimer livres ");
        System.out.println("4- Modifier un livre  ");
        System.out.println("5- Rechercher les livres ");
        System.out.println("6- Quitter");
        System.out.println("Choisir une option");
        choix = scanner.nextInt();
        scanner.nextLine();

        do {
            switch (choix) {
                case 1:
                    addBook();
                    break;
                case 2:
                    afficherBook();
                    break;
                case 3:
                    removeBook();
                    break;
                case 4:
                    modifierBook();
                    break;
                case 5:
                    rechercherLivre();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Try again");
            }
            System.out.println("Choisir une option");
            choix = scanner.nextInt();
            scanner.nextLine();
        } while (choix != 6);
    }
}
