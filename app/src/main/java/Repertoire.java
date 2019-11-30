import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Repertoire {

    String individu;

    private ArrayList  tab;
    public Repertoire (String Filename) {
        File filere = new File("");
        filere.exists();
        tab= new ArrayList();
    }


    public void Ajouter(){

        Scanner entree;
        String texte;
        String nom, numero;
        int age;

        entree = new Scanner(System.in);
        System.out.println("Entrez votre nom : ");//saisir nom etc,pour récupérer les infos de l'individu
        nom = entree.nextLine();
        System.out.println("Entrez votre telephone : ");
        numero = entree.nextLine();

        Individu contact; // ranger individu dans répertoire (a faire)

        contact = new Individu (nom,numero);
        // chaque fois qu'un individu est ajouté il va etre incrémenté de 1
        tab.add(contact);
    }

    public void sauver() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileOutputStream fos = new  FileOutputStream("SauvegardeFichierIndividu.txt" );
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(individu); //
        fos.close();
        FileInputStream fis = new FileInputStream("SauvegardeFichierIndividu.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ois.readObject();
        fis.close();

    }

    public void supprimer() {
        Scanner sc;
        sc= new Scanner(System.in);
        System.out.println("Insérer le nom de l'individu à supprimer");
        String nom = sc.nextLine();
        char reponse = 'O';


    }

    public static void Afficher(){

        System.out.println();
    }

    }
