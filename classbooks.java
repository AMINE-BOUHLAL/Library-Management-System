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


    // to string
    @Override
    public String toString() {
        return "Titre: " + title + " Auteur: " + author + " ISBN: " + ISBN + " Disponible: " + dispo ;

    }
}

