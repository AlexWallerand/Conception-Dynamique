import java.util.Scanner;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Systeme systeme = new Systeme();
        Utilisateur utilisateur = systeme.creerUtilisateur("Francis", "francis-saucisse@gmail.com", "jeSuisUneSaucisse");

        Annonce annonce1 = systeme.creerAnnonce(utilisateur, "demande", "service", "blabla", "cours de maths");
        Annonce annonce2 = systeme.creerAnnonce(utilisateur, "demande", "bien", "blabla", "perceuse");
        Annonce annonce3 = systeme.creerAnnonce(utilisateur, "proposition", "bien", "blabla", "marteau");
        Annonce annonce4 = systeme.creerAnnonce(utilisateur, "proposition", "service", "blabla", "cours de poterie");

        boolean run = true;
        while (run) {
            System.out.println("\nBonjour " + utilisateur.getNom() + "\n 1. Créer une annonce\n 2. Voir vos annonces\n 3. Rechercher des annonces");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            switch (choice) {
                case "1": {
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
                    if (end == "non") {
                        run = false;
                    }
                    break;
                }
                case "2": {
                    System.out.println("Vos annonces :\n");
                    utilisateur.afficherAnnonces();
                    System.out.println("Voulez-vous revenir au menu principal ?");
                    String end = scanner.nextLine();
                    if (end == "non") {
                        run = false;
                    }
                    break;
                }
                case "3": {
                    boolean run2 = true;
                    while (run2) {
                        System.out.println("Voulez-vous rechercher :\n1. Toutes les annonces\n2. Les annonces de demandes \n3. Les annonces de propositions \n4. Les annonces de biens\n5. Les annonces de service\n6. Quitter le menus de recherche");
                        Scanner scanner2 = new Scanner(System.in);
                        String choice2 = scanner.nextLine();
                        switch (choice2) {
                            case "1" -> {
                                systeme.getFilAnnonces();
                            }
                            case "2" -> {
                                systeme.getFilAnnonces(TypeAnnonce.demande);
                            }
                            case "3" -> {
                                systeme.getFilAnnonces(TypeAnnonce.proposition);
                            }
                            case "4" -> {
                                systeme.getFilAnnonces("Bien");
                            }
                            case "5" -> {
                                systeme.getFilAnnonces("Service");
                            }
                            case "6" -> {
                                run2 = false;
                            }
                        }

                    }

                }
                break;
            }
        }

    }


}
