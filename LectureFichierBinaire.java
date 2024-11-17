package lilo;
import java.io.FileInputStream;
import java.io.IOException;
public class LectureFichierBinaire {
    public static void main(String[] args) {

        String fichier = "exemple.bin";

        try (FileInputStream fis = new FileInputStream(fichier)) {
            int byteRead;
  
            while ((byteRead = fis.read()) != -1) {
                System.out.printf("%02X ", byteRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
