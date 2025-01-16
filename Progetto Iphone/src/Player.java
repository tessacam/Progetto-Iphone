/**
 * classe che rappresenta spotify con la capacità di riprodurre brani da una playlist
 * permette di gestire la riproduzione di brani, andare avanti, tornare indietro e selezionare un brano specifico
 *
 * @author Tessa Caminada
 * @version gennaio 2025
 */
public class Player {
    private String modello;
    private String marca;
    private Playlist playlist;
    private int posizione;

    /**
     *
     * dice il modello, la marca e la playlist del lettore
     *
     * @param modello il modello del lettore
     * @param marca la marca del lettore
     * @param playlist la playlist associata al lettore
     */
    public Player(String modello, String marca, Playlist playlist) {
        this.modello = modello;
        this.marca = marca;
        this.playlist = playlist;
        this.posizione = 0;
    }

    /**
     * riproduce il brano selezionato nella playlist
     */
    public void play() {
        Brano branoSelezionato = playlist.getBrano(posizione);
        if (branoSelezionato != null) {
            System.out.println(branoSelezionato.getTitolo() + " è in riproduzione (posizione: " + posizione + ")");
        } else {
            System.out.println("brano non disponibile.");
        }
    }

    /**
     * avanza al prossimo brano della playlist e lo riproduce
     * se si è all'ultimo brano, stampa un messaggio di fine playlist
     */
    public void after() {
        if (posizione < playlist.getDimensione() - 1) {
            posizione++;
            System.out.println("verrà riprodotto il prossimo brano...");
            play();
        } else {
            System.out.println("fine della playlist");
        }
    }

    /**
     * torna al brano precedente della playlist e lo riproduce
     * se si è già al primo brano, stampa un messaggio che indica che non è possibile tornare indietro
     */
    public void before() {
        if (posizione > 0) {
            posizione--;
            System.out.println("verrà riprodotto il brano precedente...");
            play();
        } else {
            System.out.println("Sei già al brano che vuoi");
        }
    }

    /**
     * imposta la posizione del brano da riprodurre in base al numero passato
     * se il numero non è valido, stampa un messaggio di errore
     *
     * @param n la posizione del brano da selezionare
     */
    public void numberTrack(int n) {
        if (n >= 0 && n < playlist.getDimensione()) {
            posizione = n;
        } else {
            System.out.println("il brano che vuoi non è in questa posizione " + n);
        }
    }

    /**
     * stampa le informazioni del lettore, modello, marca e playlist
     */
    public void player() {
        System.out.println("modello='" + modello + '\n' +
                ", marca='" + marca + '\n' +
                ", playlist=" + playlist);
    }
}
