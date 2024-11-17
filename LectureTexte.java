package lilo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectureTexte {
    public static void main(String[] args) {
        String fichier = "livres.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = br.readLine()) != null) {
                System.out.println(ligne); 
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

