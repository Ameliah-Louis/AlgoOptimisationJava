import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        int i, j;
        String key;

        // Déclaration et initialisation d'un tableau de chaînes de caractères
        String[] inputArray = {"kiwi", "pomme", "ananas", "pomme", "abricot"};

        // Affichage du tableau initial
        System.out.println(Arrays.toString(inputArray));

        // Début de la boucle principale du tri par insertion
        for (j = 1; j < inputArray.length; j++) { // Commence à l'index 1 (le 2e élément)
            key = inputArray[j]; // Élément à insérer
            i = j - 1;

            // Déplacement des éléments plus grands que 'key' vers la droite
            while (i >= 0) {
                // compareTo renvoie :
                //   - un entier > 0 si inputArray[i] > key
                //   - 0 si égaux
                //   - un entier < 0 si inputArray[i] < key
                // Ici on trie par ordre alphabétique croissant
                if (key.compareTo(inputArray[i]) > 0) { // Si key est plus grand, on arrête de déplacer
                    break;
                }

                inputArray[i + 1] = inputArray[i]; // Décalage de l'élément vers la droite
                i--;
            }

            // Insertion de 'key' à la bonne position
            inputArray[i + 1] = key;

            // Affichage du tableau après chaque insertion
            System.out.println(Arrays.toString(inputArray));
        }

        // Affichage final du tableau trié
        System.out.println(Arrays.toString(inputArray));
    }
}
