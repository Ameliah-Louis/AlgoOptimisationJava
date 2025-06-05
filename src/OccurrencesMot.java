import java.util.Scanner;

//CODE A OPTIMISER
//public class OccurrencesMot {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Entrez une phrase :");
//        String phrase = sc.nextLine();
//
//        System.out.println("Entrez le mot à chercher :");
//        String mot = sc.nextLine();
//
//        long debut = System.nanoTime();
//
//        int compteur = 0;
//        String temp = "";
//        for (int i = 0; i < phrase.length(); i++) {
//            char c = phrase.charAt(i);
//            if (c != ' ') {
//                temp += c;
//            } else {
//                if (temp.equals(mot)) {
//                    compteur++;
//                }
//                temp = "";
//            }
//        }
//        if (temp.equals(mot)) {
//            compteur++; // dernier mot
//        }
//
//        long fin = System.nanoTime();
//
//        System.out.println("Le mot apparaît " + compteur + " fois.");
//        System.out.println("Temps d'exécution (ns) : " + (fin - debut));
//    }
//}

//CORRECTION
// Demande une phrase à l’utilisateur
// Demande un mot à rechercher
// Compte et affiche le nombre de fois que le mot apparaît dans la phrase
// Programme qui demande une phrase et un mot à l’utilisateur,
// puis compte le nombre de fois que ce mot apparaît dans la phrase.

public class OccurrencesMot {
    public static void main(String[] args) {
        // Création d’un objet Scanner pour lire l’entrée utilisateur
        Scanner sc = new Scanner(System.in);

        // Demande à l’utilisateur de saisir une phrase
        System.out.println("Entrez une phrase :");
        String phrase = sc.nextLine(); // Lecture de la phrase complète

        // Demande à l’utilisateur de saisir le mot à rechercher
        System.out.println("Entrez le mot à chercher :");
        String mot = sc.nextLine(); // Lecture du mot cible

        // Début de la mesure du temps d'exécution
        long debut = System.nanoTime();

        // Découpage de la phrase en mots en utilisant une expression régulière :
        // "\\s+" correspond à un ou plusieurs espaces (ou autres séparateurs blancs)
        String[] mots = phrase.split("\\s+");

        int compteur = 0; // Compteur d'occurrences

        // Parcours de chaque mot extrait de la phrase
        for (String m : mots) {
            if (m.equals(mot)) { // Comparaison sensible à la casse
                compteur++; // Incrémentation si le mot correspond
            }
        }

        // Fin de la mesure du temps d'exécution
        long fin = System.nanoTime();

        // Affichage du résultat : nombre d'occurrences
        System.out.println("Le mot apparaît " + compteur + " fois.");

        // Affichage du temps d’exécution en nanosecondes
        System.out.println("Temps d'exécution (ns) : " + (fin - debut));
    }
}
