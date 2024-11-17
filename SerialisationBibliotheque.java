package lilo;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerialisationBibliotheque {
    public static void main(String[] args) {
        List<Livre> livres = new ArrayList<>();
        livres.add(new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 1943));
        livres.add(new Livre("1984", "George Orwell", 1949));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bibliotheque.ser"))) {
            oos.writeObject(livres);
            System.out.println("La bibliothèque a été sérialisée avec succès !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
