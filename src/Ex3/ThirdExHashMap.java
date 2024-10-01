package Ex3;

import java.util.HashMap;

public class ThirdExHashMap {
    // HashMap in cui le chiavi sono i nomi delle persone e i valori sono i numeri di telefono
    private HashMap<String, String> listaContatti;

    // Costruttore per inizializzare la lista
    public ThirdExHashMap() {
        listaContatti = new HashMap<>();
    }

    // Inserisco una coppia <Nome, telefono>
    public void inserisciContatto(String nome, String telefono) {
        listaContatti.put(nome, telefono);
        System.out.println("Contatto inserito: " + nome + " " + telefono);
    }

    // Cancello una coppia <Nome, telefono> a partire dal nome
    public void cancellaContatto(String nome) {
        if (listaContatti.containsKey(nome)) {   // Controllo se la chiave esiste
            listaContatti.remove(nome);  // Rimuovo il contatto dalla mappa
            System.out.println("Il contatto di " + nome + " è stato rimosso.");
        } else {
            System.out.println("Errore! Contatto " + nome + " inesistente.");
        }
    }

    // La ricerca di una Persona di cui si conosce il numero di telefono
    public String cercaNumero(String telefono) {
        for (String nome : listaContatti.keySet()) {  // Itera attraverso i nomi (chiavi)
            if (listaContatti.get(nome).equals(telefono)) {  // verifico se il numero di telefono corrisponde a uno dei valori
                return nome;  // Ritorna il nome della persona
            }
        }
        return "Errore! Nessuna persona trovata con questo numero.";
    }

    // Cerca numero di telefono con il nome della persona
    public String cercaPersona(String nome) {
        if (listaContatti.containsKey(nome)) {  // Verifico se il nome esiste nella mappa
            return listaContatti.get(nome);  // Ritorna il numero associato al nome
        } else {
            return "Errore! Nessun contatto trovato.";
        }
    }

    // La stampa di tutti i contatti con nome e numero.
    public void stampa() {
        if (listaContatti.isEmpty()) {
            System.out.println("Non ci sono contatti salvati!");
        } else {
            System.out.println("La lista dei contatti: ");
            for (String nome : listaContatti.keySet()) {  // Itera attraverso i nomi (le key)
                System.out.println("Nome contatto: " + nome + " - Telefono: " + listaContatti.get(nome));
            }
        }
    }
}
