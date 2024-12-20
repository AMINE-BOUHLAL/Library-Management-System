package LIBRARY;

public class classbooks{
        public  String title;
        public String author;
        public  String ISBN;
        public  boolean dispo;

    // constricteur=bnay
        public classbooks() {
            this.title=title;
            this.author=author;
            this.ISBN=ISBN;
            this.dispo=dispo;
        }

    // click droit + GENERATE +GETTER AND SETTER
    public String getAuteur() {
        return author;
    }

    public void setAuteur(String auteur) {
        this.author = auteur;
    }

    public String getNom() {
        return title;
    }

    public void setNom(String nom) {
        this.title = nom;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    // to string
    @Override
    public String toString() {
        return "Titre: " + title + " Auteur: " + author + " ISBN: " + ISBN + " Disponible: " + dispo ;

    }
}
