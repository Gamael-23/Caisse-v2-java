import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int choix ;
         do{
             System.out.println("\n=====================================");
             System.out.println("             SHOP MANAGER          ");
             System.out.println("=====================================");
             System.out.println("1. Gestion des articles");
             System.out.println("2. Gestion des clients");
             System.out.println("3. Ventes");
             System.out.println("4. Statistique");
             System.out.println("5. Quitter");

             System.out.print("\nChoix : ");
             choix = sc.nextInt();

             switch(choix){
                 case 1:
                     System.out.println("==============GESTION DES ARTICLES==================");
                     System.out.println("En construction....");
                     break;

                 case 2:
                     System.out.println("==============GESTION DES CLIENTS=================");
                     System.out.println("En construction.....");
                     break;

                 case 3:
                     System.out.println("================= VENTES ===================");
                     System.out.println("En construction ....");
                     break;

                 case 4:
                     System.out.println("=============== STATISTIQUES ================");
                     System.out.println("En construction....");
                     break;

                 case 5:
                     System.out.println("Fin du programme");
                     break;

                 default :
                     System.out.println("Choix invalide");
             }
         }while(choix != 5);

        sc.close();
    }
}
