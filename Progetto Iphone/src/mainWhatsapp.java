import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    class mainWhatsapp {
        public void avviaWhatsapp() {
            Scanner scanner = new Scanner(System.in);

            // Una lista per memorizzare i messaggi
            List<Messaggio> chat = new ArrayList<>();

            System.out.println("benvenuto/a su whatsapp!");

            while (true) {
                System.out.println("1. invia un messaggio");
                System.out.println("2. visualizza la chat");
                System.out.println("3. esci");
                System.out.print("scegli un'opzione(numero): ");
                System.out.println("");
                System.out.println("");
                System.out.print("");

                int scelta1 = scanner.nextInt();
                scanner.nextLine();

                switch (scelta1) {
                    case 1: // Invia un messaggio
                        System.out.println("hai scelto di inviare un messaggio: ");

                        System.out.print("inserisci il tuo nome: ");
                        String mittente = scanner.nextLine();
                        System.out.print("inserisci il nome della persona a cui vuoi messaggiare: ");
                        String destinatario = scanner.nextLine();
                        System.out.print("scrivi il messaggio: ");
                        String contenuto = scanner.nextLine();

                        // Aggiungi il messaggio alla chat
                        chat.add(new Messaggio(mittente, destinatario, contenuto));
                        System.out.println("messaggio inviato!");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");


                        break;

                    case 2: // Visualizzare la chat
                        if (chat.isEmpty()) {
                            System.out.println("la chat è vuota");
                        } else {
                            System.out.println("chat: ");
                            for (Messaggio messaggio : chat) {
                                System.out.println(messaggio);
                            }
                        }
                        break;

                    case 3: // Esci
                        System.out.println("grazie per aver usato whatsapp!");

                        try {
                            Thread.sleep(1500); // 1500 millisecondi = 1.5 secondi
                        } catch (InterruptedException e) {
                            // In caso di errore (improbabile), mostra un messaggio
                            System.out.println("Errore durante l'attesa");
                        }

                        System.out.println("ritorno alla homepage");
                        return;

                    default:
                        System.out.println("opzione non valida o non esistente, riprova!");
                }
            }
        }
    }




