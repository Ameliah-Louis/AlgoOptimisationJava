import java.util.Scanner;

// CODE INITIAL A CORRIGER
//public class InverserChaine {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Entrez une chaîne :");
//        String texte = sc.nextLine();
//
//        long debut = System.nanoTime();
//
//        String inverse = "";
//        for (int i = 0; i < texte.length(); i++) {
//            inverse = inverse + texte.charAt(texte.length() - i - 1);
//        }
//
//        long fin = System.nanoTime();
//
//        System.out.println("Chaîne inversée : " + inverse);
//        System.out.println("Temps d'exécution (ns) : " + (fin - debut));
//    }
//}

//CORRECTION
// Demande une chaîne à l’utilisateur
// Affiche la même chaîne inversée

import java.util.Scanner;

public class InverserChaine {
    public static void main(String[] args) {
        // Création du Scanner pour lire l'entrée utilisateur
        Scanner sc = new Scanner(System.in);

        // Demande à l'utilisateur d'entrer une chaîne de caractères
        System.out.println("Entrez une chaîne :");
        String texte = sc.nextLine(); // Lecture de la ligne complète

        // Début du chronométrage
        long debut = System.nanoTime();

        // Appel de la méthode qui inverse la chaîne
        String inverse = inverser(texte);

        // Fin du chronométrage
        long fin = System.nanoTime();

        // Affichage du résultat
        System.out.println("Chaîne inversée : " + inverse);
        System.out.println("Temps d'exécution (ns) : " + (fin - debut));

        // Fermeture du Scanner (bonne pratique)
        sc.close();
    }

    /**
     * Méthode qui inverse une chaîne de caractères sans utiliser StringBuilder ou StringBuffer.
     * Elle convertit la chaîne en tableau de caractères, puis échange les caractères de manière symétrique.
     */
    public static String inverser(String texte) {
        // Conversion de la chaîne en tableau de caractères
        char[] chars = texte.toCharArray();
        int n = chars.length;

        // Boucle pour échanger les caractères du début et de la fin
        for (int i = 0; i < n / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[n - i - 1];
            chars[n - i - 1] = temp;
        }

        // Conversion du tableau de caractères inversé en chaîne
        return new String(chars);
    }
}

