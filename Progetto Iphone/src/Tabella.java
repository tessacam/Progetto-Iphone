import java.util.Scanner;

public class Tabella {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dati della tabella
        String[][] tabella = {
                {"spotify", "safari"},
                {"whatsapp", "kindle"},
                {"reaction", "scuola"}
        };

        System.out.println("benvenuto/a nel tuo telefono");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("errore durante l'attesa");
        }

        System.out.println("in accensione...");

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println("errore durante l'attesa");
        }

        // Stampa la tabella
        for (String[] strings : tabella) {
            System.out.println("+-----------+-----------+");
            System.out.printf("| %-9s | %-9s |%n", strings[0], strings[1]); //chiesto a chat gpt
        }

        System.out.println("+-----------------------+");
        System.out.printf("|           0           |%n");
        System.out.println("+-----------------------+");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("errore durante l'attesa");
        }

        while (true) {
            System.out.println("digita il numero dell'app che vuoi usare");
            System.out.println("1. spotify");
            System.out.println("2. safari");
            System.out.println("3. whatsapp");
            System.out.println("4. kindle");
            System.out.println("5. reaction");
            System.out.println("6. scuola");
            System.out.println("7. spegni");


            System.out.print("numero app:  ");




                int scelta1 = scanner.nextInt();
                scanner.nextLine();


                if (scelta1 < 1 || scelta1 > 7) {
                    System.out.println("scelta non valida, riprova");
                    continue;
                }

                switch (scelta1) {
                    case 1:
                        mainSpotify spotify = new mainSpotify();
                        spotify.avviaSpotify();
                        break;
                    case 2:
                        mainSafari safari = new mainSafari();
                        safari.avviaSafari();
                        break;
                    case 3:
                        mainWhatsapp whatsapp = new mainWhatsapp();
                        whatsapp.avviaWhatsapp();
                        break;
                    case 4:
                        mainKindle kindle = new mainKindle();
                        kindle.avviaKindle();
                        break;
                    case 5:
                        mainReactionGame reaction = new mainReactionGame();
                        reaction.avviaReactionGame();
                        break;
                    case 6: // scuola
                        mainScuola scuola = new mainScuola();
                        scuola.avviaScuola(scanner); // Passa lo stesso scanner
                        break;
                    case 7:
                        System.out.println("hai scelto di spegnere il telefono. Grazie e alla prossima!");


                        try {
                            Thread.sleep(1500);
                        } catch (InterruptedException e) {
                            System.out.println("errore durante l'attesa");
                        }

                        System.out.println("spegnimento...");

                        scanner.close();
                        return;
                }
            }
        }
    }


