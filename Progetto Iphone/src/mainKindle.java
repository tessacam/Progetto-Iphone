import java.util.Scanner;

/**
 * Simula l'applicazione Kindle dove l'utente può sfogliare e acquistare libri.
 *
 * @author tessa caminada
 * @version gennaio 2025
 */
class mainKindle {

    /**
     * Avvia l'applicazione Kindle.
     * L'utente può scegliere un libro dalla libreria e acquistarlo.
     * Dopo aver visualizzato i libri, l'utente può decidere se continuare a scegliere libri o uscire dall'applicazione.
     */
    public void avviaKindle() {

        Libreria libreria = new Libreria("");
        Scanner scanner = new Scanner(System.in);

        libreria.aggiungiLibro(new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", 1954, "19.99"));
        libreria.aggiungiLibro(new Libro("1984", "George Orwell", 1949, "14.99"));
        libreria.aggiungiLibro(new Libro("Harry Potter e la Pietra Filosofale", "J.K. Rowling", 1997, "12.99"));
        libreria.aggiungiLibro(new Libro("Il Nome della Rosa", "Umberto Eco", 1980, "18.50"));

        GestoreLibreria gestore = new GestoreLibreria(libreria);

        while (true) {
            System.out.println("vuoi aprire Kindle? (si/no)");
            String risposta = scanner.nextLine();

            if (risposta.equalsIgnoreCase("si")) {

                while (true) {
                    System.out.println("ecco i libri disponibili:");
                    gestore.mostraTuttiILibri();

                    System.out.println("inserisci il numero del libro che vuoi comprare:");
                    int numeroLibro = scanner.nextInt();
                    scanner.nextLine(); // Consuma il newline residuo

                    gestore.mostraLibro(numeroLibro);
                    System.out.println("se vuoi scegliere un altro libro scrivi 'indietro', se vuoi uscire da Kindle scrivi 'esci'");
                    String scelta = scanner.nextLine();
                    if (scelta.equalsIgnoreCase("esci")) {
                        System.out.println("okay, sarà per la prossima volta");
                        break;
                    } else if (!scelta.equalsIgnoreCase("indietro")) {
                        System.out.println("scelta non valida, uscita forzata da kindle");
                        break;
                    }
                }
                break;
            }
            System.out.println("okay, sarà per la prossima volta");
        }
        scanner.close();
    }
}

