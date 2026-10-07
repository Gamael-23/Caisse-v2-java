import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Article> articles = new ArrayList<>();

        char continuer;
        double total = 0.0;

        System.out.println("============ CAISSE ============");

        System.out.print("Votre nom : ");
        String prenom = sc.nextLine();

        do {

            String nom;

                System.out.print("Entrez un article : ");
                nom = sc.nextLine();
                
           
            double prix;

            while (true) {

                try {

                    System.out.print("Prix : ");
                    prix = sc.nextDouble();

                    if (prix < 0) {
                        System.out.println("Erreur : le prix ne peut pas être négatif.");
                        continue;
                    }

                    sc.nextLine(); 
                    break;

                } catch (InputMismatchException e) {

                    System.out.println("Entrer un nombre valide !");
                    sc.nextLine();
                }
            }

            articles.add(new Article(nom, prix));

            total += prix;

            while (true) {

                System.out.print( "Voulez-vous ajouter un autre article ? (o/n) : ");
                String reponse = sc.nextLine();

                if (reponse.equalsIgnoreCase("o")) {
                    continuer = 'o';
                    break;
                }

                if (reponse.equalsIgnoreCase("n")) {
                    continuer = 'n';
                    break;
                }

                System.out.println( "Erreur : choisissez o/O pour continuer ou n/N pour arrêter.");
            }

        } while (continuer == 'o');

        System.out.println("---------------------------------------------");
        System.out.println("============= TICKET DE CAISSE =============");
        System.out.println("NOM : " + prenom);

        int i = 0;

        for (Article article : articles) {
            System.out.println((i + 1) + " . "+ article.getNom() + " : " + article.getPrix() + " G" );
            i++;
        }

        if (total > 1000) {
            total = total - (total * 0.1);
        }

        System.out.println("Total : " + total + " G");

        sc.close();
    }
}

