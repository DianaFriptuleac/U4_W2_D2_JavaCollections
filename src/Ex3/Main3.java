package Ex3;

public class Main3 {
    public static void main(String[] args) {
        ThirdExHashMap rubricaTelefonica = new ThirdExHashMap();

        rubricaTelefonica.inserisciContatto("Mario", "388-1254788");
        rubricaTelefonica.inserisciContatto("Anna", "388-6391225");
        rubricaTelefonica.inserisciContatto("Simone", "388-1254846");
        rubricaTelefonica.inserisciContatto("Francesca", "388-1255688");
        rubricaTelefonica.inserisciContatto("Luca", "333-1254788");


        System.out.println("*******************************************************************************");
        rubricaTelefonica.stampa();


        // Cerco il numero di "Mario"
        String numeroPersona = rubricaTelefonica.cercaPersona("Mario");
        System.out.println("Numero di Mario: " + numeroPersona);

        // Cerco la persona associata al numero "388-6391225"
        String personaConNumero = rubricaTelefonica.cercaNumero("388-6391225");
        System.out.println("La persona con il numero 388-6391225 è: " + personaConNumero);

        // Cancello il contatto di "Simone"
        rubricaTelefonica.cancellaContatto("Simone");

        System.out.println("*******************************************************************************");
        // Stampa di tutti i contatti dopo la cancellazione
        rubricaTelefonica.stampa();
    }
}
