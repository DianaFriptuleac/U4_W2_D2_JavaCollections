package Ex3;

import java.util.HashMap;

public class ThirdExHashMap {
    //HashMap in cui le chiavi sono i nomi delle persone e i valori sono i numeri di telefono
    private HashMap<String, String> listaContatti;

    //costruttore per inizializzare la lista
    public ThirdExHashMap() {
        listaContatti = new HashMap<>();
    }

    // L'inserimento di una coppia <Nome, telefono>
    public void inserisciContatto(String nome, String telefono) {
        listaContatti.put(nome, telefono);
        System.out.println("Contatto inserito: " + nome + " " + telefono);
    }

    //La cancellazione di una coppia <Nome, telefono> a partire dal nome
    public void cancellaContatto(String nome) {
        if (listaContatti.containsKey(nome)) {   //prendo la key nome
            listaContatti.remove(nome);
            System.out.println("Il contatto di " + nome + " è stato rimosso");
        } else {
            System.out.println("Errore! contatto " + nome + " inesistente");
        }
    }

    //La ricerca di una Persona di cui si conosce il numero di telefono
}
