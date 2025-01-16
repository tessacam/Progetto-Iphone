import java.util.*;

/**
 * Gioco per testare la velocità di reazione dell'utente.
 *
 * @author tessa caminada
 * @version gennaio 2025
 */
class mainReactionGame {

    /**
     * Avvia il gioco di reazione.
     * Il gioco mostra un messaggio casuale e l'utente deve premere il tasto ENTER nel minor tempo possibile.
     * Il tempo di reazione viene poi misurato e il punteggio viene assegnato.
     */
    public void avviaReactionGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Messaggio iniziale
        System.out.println("benvenuto/a nel REACTION GAME!");
        System.out.println("scopo: testa la tua velocità di reazione");
        System.out.println("quando appare il messaggio devi premere il tasto ENTER il più velocemente possibile");

        while (true) {
            // chiede se l'utente vuoel cominciare a giocare
            System.out.println("vuoi cominciare il gioco?(vai/no)");
            String risposta = scanner.nextLine();
            if (risposta.equalsIgnoreCase("vai")) {
                break;
            }
            System.out.println("okay, sarà per la prossima volta");
            scanner.close();
        }

        // Loop del gioco
        while (true) {
            System.out.println("\npreparati...");
            // Tempo casuale tra 2 e 5 secondi
            int ritardo = random.nextInt(4000) + 2000; // tra 2000ms e 4000ms ovvero 2 e 4 secondi  -> https://stackoverflow.com/questions/10317041/exception-handling-in-case-of-thread-sleep-and-wait-method-in-case-of-threads
            try {
                Thread.sleep(ritardo);  // Attendi un tempo casuale
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Avviso che l'utente deve premere il tasto
            System.out.println("PREMILO ORA!");

            // Registra il tempo di reazione -> https://www.tutorialspoint.com/java/lang/system_currenttimemillis.htm
            long inizio = System.currentTimeMillis();
            scanner.nextLine();  // Aspetta che l'utente prema ENTER

            long tempo_reazione = System.currentTimeMillis() - inizio;

            // Mostra il tempo di reazione
            System.out.println("tempo di reazione: " + tempo_reazione + " millisecondi");

            // Assegna il punteggio in base al tempo di reazione
            int punti = 0;

            if (tempo_reazione <= 0) {
                punti = 0;
                System.out.println("ERRORE!!");
                System.out.println("hai cliccato il pulsante prima di vedere il messaggio, non barare dai");

            } else if (tempo_reazione <= 500) {
                punti = 10;
            } else if (tempo_reazione <= 1000) {
                punti = 9;
            } else if (tempo_reazione <= 1500) {
                punti = 8;
            } else {
                System.out.println("meglio che ci riprovi...");
                continue;  // Riprendi il gioco senza assegnare punteggio
            }

            // Mostra il punteggio
            System.out.println("hai fatto: " + punti + " punti!");

            // Chiedi se l'utente vuole giocare di nuovo
            System.out.println("vuoi giocare di nuovo? (si/no)");
            String risposta = scanner.nextLine();
            if (risposta.equalsIgnoreCase("no")) {

                System.out.println("grazie per aver giocato alla prossima");

                try {
                    Thread.sleep(1500); // 1500 millisecondi = 1.5 secondi
                } catch (InterruptedException e) {
                    // In caso di errore (improbabile), mostra un messaggio
                    System.out.println("errore durante l'attesa");
                }

                System.out.println("ritorno alla homepage");
                return;
            }
        }
    }
}
