package Ex2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int N = 7;

        // La prima funzione per generare e ordinare numeri casuali
        List<Integer> listaNrCasuali = SecondExArrayList.firstFunction(N);
        System.out.println("*********Lista ordinata di numeri casuali: " + listaNrCasuali);

        // Seconda funzione per creare la lista duplicata con elementi in ordine inverso
        List<Integer> listaNrDoppii = SecondExArrayList.secondFunction(listaNrCasuali);
        System.out.println(" ********Lista con duplicato inverso: " + listaNrDoppii);

        // Terza funzione per stampare i valori in posizioni pari
        System.out.println("\n *************** Stampa dei valori in posizioni pari: **************************");
        SecondExArrayList.thirdFunction(listaNrDoppii, true);

        // Terza funzione per stampare i valori in posizioni dispari
        System.out.println("\n *************** Stampa dei valori in posizioni dispari:***********************");
        SecondExArrayList.thirdFunction(listaNrDoppii, false);
    }
}
