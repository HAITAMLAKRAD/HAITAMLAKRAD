package lilo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopierFichierBinaire {
    public static void main(String[] args) {
        String source = "source.pdf";
        String destination = "destination.pdf"; 

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                fos.write(byteRead);
            }
            System.out.println("Le fichier a été copié avec succès !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

