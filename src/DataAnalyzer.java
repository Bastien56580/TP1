import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DataAnalyzer {

    public static void main(String[] args) throws IOException {

        DataSetReader dataSetReader= new DataSetReader();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nom du fichier à analyser svp :");
        try{
            String fichierValeur = scanner.nextLine();
            dataSetReader.readFile("src/valeurs.txt");
        } catch (FileNotFoundException | BadDataException e){
            System.out.println(e.getMessage());
            System.out.println("Ressaisir le nom du fichier");
            String fichierValeur = scanner.nextLine();
            dataSetReader.readFile("src/valeurs.txt");
        }

        String chemin = new Scanner(System.in).nextLine();
    }


}
