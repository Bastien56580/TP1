import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DataSetReader {
    private double[] data;


    public double[] readFile(String filename) throws IOException {

        Scanner sc = new Scanner(new File(filename));
        this.readData(sc);

        return data;
    }

    private void readData(Scanner sc) throws BadDataException {


        if (sc.hasNextInt()) {
            int taille = (int) sc.nextDouble();
            this.data = new double [taille];
            int longueur = sc.nextInt();
            for (int i = 0; i < longueur; i++) {
                readValue(sc, i);
            }
        } else {
            throw new BadDataException("La première valeur n'est pas un int ou est null");
        }

    }

    private void readValue(Scanner in, int i) throws BadDataException {
        if (in.hasNextDouble()) {
            this.data[i] = in.nextDouble();
        } else {
            throw new BadDataException("DatasetReader.readValue() : La donnée " + (i + 1) + " n'est pas un double");
        }
    }
}
