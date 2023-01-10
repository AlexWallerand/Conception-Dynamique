import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Systeme systeme = new Systeme();
        Utilisateur utilisateur = systeme.creerUtilisateur("Francis", "francis-saucisse@gmail.com","jeSuisUnFDP");
        boolean run = true;
        while(run){
            System.out.println("\nBonjour " + utilisateur.getNom() + "\n 1. Créer une annonce\n 2.Voir les annonces");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            switch (choice){
                case "1":{
                    System.out.println("Quel type d'annonce ? (bien ou service) :");
                    String typePrestation = scanner.nextLine();
                    System.out.println("Nom de l'annonce : ");
                    String nom = scanner.nextLine();
                    System.out.println("Description de l'annonce : ");
                    String description = scanner.nextLine();
                    System.out.println("Est-ce une demande ou une proposition");
                    String typeAnnonce = scanner.nextLine();
                    Annonce annonce = systeme.creerAnnonce(utilisateur, typeAnnonce, typePrestation, description, nom);
                    System.out.println("\nAnnonce créé avec succès :\n" + annonce);
                    System.out.println("Voulez-vous revenir au menu principal ?");
                    String end = scanner.nextLine();
                    if(end == "non"){
                        run = false;
                    }
                    break;
                }
                case "2":{
                    systeme.getFilAnnonces();
                    break;
                }
            }

        }




    }
}