package lilo;
import java.io.*;
import java.util.List;

public class DeserialisationBibliotheque {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bibliotheque.ser"))) {
            List<Livre> object = (List<Livre>) ois.readObject();
			List<Livre> livres = object;
            for (Livre livre : livres) {
                System.out.println(livre);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
