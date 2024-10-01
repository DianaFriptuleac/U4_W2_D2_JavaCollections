package Ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SecondExArrayList {

    //Scrivere una funzione che accetti un intero N e restituisca una lista ordinata di N interi casuali da 0 a 100.
    public static List<Integer> firstFunction(int N) {
        List<Integer> nrList = new ArrayList<>();  // Crea una nuova lista vuota per memorizzare i numeri casuali
        Random randomNumb = new Random(); // Oggetto Random per generare numeri casuali

        for (int i = 0; i < N; i++) {
            //nr random da 0 a 100
            nrList.add(randomNumb.nextInt(101));  //101- 0 e 100 inclusi
        }
        //ordina la nrList
        Collections.sort(nrList);
        return nrList;  // return la lista orndinata
    }
    //funzione che accetti una lista e restituisca una nuova lista composta dagli elementi della prima lista
    //seguiti dagli stessi elementi disposti in ordine inverso

    public static List<Integer> secondFunction(List<Integer> firstList) { //List<Integer> firstList - lista di interi con nome firstList
        List<Integer> newList = new ArrayList<>(firstList);  // Creo una nuova lista copiando gli elementi di firstList
        List<Integer> nrInvertiti = new ArrayList<>(firstList);  //// Crea un'altra copia della lista originale x invertire i nr.

        // Inverto l'ordine degli elementi della lista
        Collections.reverse(nrInvertiti);

        // Aggiungo la lista invertita alla lista originale
        newList.addAll(nrInvertiti);

        return newList;
    }
    //funzione che accetti una lista ed un
    //booleano: se il booleano è true stampa i valori in posizioni pari, altrimenti stampa i i valori in posizioni pari.

    public static void thirdFunction(List<Integer> elencoNumeri, boolean pari) {
        //Ternario x pari o dispari
        System.out.println(pari ? "I valori in posizioni pari:" : "I valori in posizioni dispari:");

        for (int i = 0; i < elencoNumeri.size(); i++) {
            // Se 'pari' e true e l'indice e pari, stampa il valore alla posizione i
            if (pari && i % 2 == 0) {
                System.out.println("Nella posizione " + i + " si trova - " + elencoNumeri.get(i));
                // Se 'pari' e false e l'indice e dispari, stampa il valore alla posizione i
            } else if (!pari && i % 2 != 0) {
                System.out.println("Nella posizione " + i + " si trova - " + elencoNumeri.get(i));
            }
        }
    }

}

