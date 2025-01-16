import java.util.Random;
import java.util.Scanner;
/**
 * un'applicazione che simula spotify con venti canzoni
 *
 * @author tessa caminada
 * @version gennaio 2025
 */

class mainSpotify {
    Scanner scanner = new Scanner(System.in); // Inizializzazione corretta
    Random random = new Random();

    public void avviaSpotify() {


        System.out.println("benvenuto/a su spotify");
        System.out.println("nella tua playlist ci sono 20 canzoni");
        System.out.println("esiste la modalità casuale mentre invece c'è quella dove puoi scegliere le canzoni da riprodurre");



        Playlist playlist = new Playlist("theonly");
        playlist.aggiungiBrano(new Brano("paqueta", "marveille"));
        playlist.aggiungiBrano(new Brano("incipit", "frankie hi-ngr mc"));
        playlist.aggiungiBrano(new Brano("teen romance", "lil peep"));
        playlist.aggiungiBrano(new Brano("drugs you should try", "travis scott"));
        playlist.aggiungiBrano(new Brano("copines", "aya nakamura"));
        playlist.aggiungiBrano(new Brano("sono di roma", "noyz narcos"));
        playlist.aggiungiBrano(new Brano("do for love", "2pac"));
        playlist.aggiungiBrano(new Brano("coming down", "the weeknd"));
        playlist.aggiungiBrano(new Brano("feel so close", "calvin harris"));
        playlist.aggiungiBrano(new Brano("embrace it", "ndotz"));
        playlist.aggiungiBrano(new Brano("blinding lights", "the weeknd"));
        playlist.aggiungiBrano(new Brano("levitating", "dua lipa"));
        playlist.aggiungiBrano(new Brano("shape of you", "ed sheeran"));
        playlist.aggiungiBrano(new Brano("bad guy", "billie eilish"));
        playlist.aggiungiBrano(new Brano("uptown funk", "mark ronson"));
        playlist.aggiungiBrano(new Brano("can't stop", "red hot chili peppers"));
        playlist.aggiungiBrano(new Brano("hotel california", "eagles"));
        playlist.aggiungiBrano(new Brano("smells like teen spirit", "nirvana"));
        playlist.aggiungiBrano(new Brano("billie jean", "michael jackson"));
        playlist.aggiungiBrano(new Brano("rolling in the deep", "adele"));


        Player player = new Player("Iphone 6", "Apple", playlist);




            System.out.print(" ");
            System.out.print(" ");

            System.out.print("scelta modalita(casuale/non casuale): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("casuale")) {
                int numerocanzone = random.nextInt(20);
                player.numberTrack(numerocanzone);
                player.play();
            } else {

                System.out.print(" ");
                System.out.print(" ");

                System.out.println("1. paqueta - marveille");
                System.out.println("2. incipit - frankie hi-ngr mc");
                System.out.println("3. teen romance - lil peep");
                System.out.println("4. drugs you should try - travis scott");
                System.out.println("5. copines - aya nakamura");
                System.out.println("6. sono di roma - noyz narcos");
                System.out.println("7. do for love - 2pac");
                System.out.println("8. coming down - the weeknd");
                System.out.println("9. feel so close - calvin harris");
                System.out.println("10. embrace it - ndotz");
                System.out.println("11. blinding lights - the weeknd");
                System.out.println("12. levitating - dua lipa");
                System.out.println("13. shape of you - ed sheeran");
                System.out.println("14. bad guy - billie eilish");
                System.out.println("15. uptown funk - mark ronson");
                System.out.println("16. can't stop - red hot chili peppers");
                System.out.println("17. hotel california - eagles");
                System.out.println("18. smells like teen spirit - nirvana");
                System.out.println("19. billie jean - michael jackson");
                System.out.println("20. rolling in the deep - adele");

                System.out.print(" ");
                System.out.print(" ");

                System.out.print("che canzone desideri ascoltare(digita il numero): ");
                int canzone = scanner.nextInt();
                scanner.nextLine();

                System.out.print(" ");
                player.numberTrack(canzone);
                player.play();
            }


            System.out.print("");
            System.out.print("");

            System.out.println("- digitare '1' per passare alla prossima canzone");
            System.out.print("");
            System.out.println("- mentre '2' per tornare alla precedente");
            System.out.print("");
            System.out.println("- digita invece 3, per uscire da spotify");


            int scelta1 = scanner.nextInt();
            scanner.nextLine();

            switch (scelta1) {
                case 1:
                    player.after();


                case 2: // Visualizzare la chat
                    player.before();

                case 3: // Esci
                    System.out.println("grazie per aver usato spotify");

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




