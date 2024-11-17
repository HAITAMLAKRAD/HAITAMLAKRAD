package lilo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LectureEtEcritureTexte {
    public static void main(String[] args) {
        String fichierEntree = "livres.txt";
        String fichierSortie = "sortie.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fichierEntree));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fichierSortie))) {

            String ligne;
            while ((ligne = br.readLine()) != null) {
                bw.write(ligne);
                bw.newLine(); 
            }

            System.out.println("Les livres ont été sauvegardés dans le fichier 'sortie.txt'.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
