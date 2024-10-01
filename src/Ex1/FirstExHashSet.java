package Ex1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstExHashSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Chiedo il nr di elementi da inserire
        System.out.println("Quante parole vuoi inserire? (inserire un numero): ");
        int N = scanner.nextInt();
        //linea vuota
        scanner.nextLine();

        //Set duplicati
        Set<String> duplicati = new HashSet<>();

        //Set parole distinte
        Set<String> parole = new HashSet<>();

        for (int i = 0; i < N; i++) {
            System.out.println("Inserisci parola nr: " + (i + 1));
            String parolaInserita = scanner.nextLine();
            //Trovo i duplicati
            //Se parole.add(parolaInserita) - false, la parola viene inserita nei duplicati.
            if (!parole.add(parolaInserita)) {
                duplicati.add(parolaInserita);
            }
        }

        //stampa delle parole duplicate
        if (!duplicati.isEmpty()) {
            System.out.println("*************le parole duplicate: *******************");
            for (String parola : duplicati) {
                System.out.println(" " + parola);
            }
        } else {
            System.out.println("**************Zero duplicati******************");
        }

        // il numero di parole distinte
        System.out.println("***********************Il numero di parole distinte: " + parole.size());

        // l'elenco delle parole distinte
        System.out.println("************************L'elenco delle parole: ");
        for (String parola : parole) {
            System.out.println(" " + parola);
        }
        scanner.close();
    }
}
