import java.util.ArrayList;

/**
 * classe che rappresenta una playlist di brani musicali
 * e permette di aggiungere nuovi brani, scegliere un brano in base alla posizione
 *
 * @author Tessa Caminada
 * @version gennaio 2025
 */
public class Playlist {
    private String titolo;
    private ArrayList<Brano> brani;

    /**
     * dice il titolo della playlist e la lista di brani vuota
     *
     * @param titolo il titolo della playlist
     */
    public Playlist(String titolo) {
        this.titolo = titolo;
        this.brani = new ArrayList<>();
    }

    /**
     * aggiunge un brano alla playlist
     *
     * @param brano il brano da aggiungere alla playlist
     */
    public void aggiungiBrano(Brano brano) {
        brani.add(brano);
    }

    /**
     * recupera un brano dalla playlist
     *
     *
     * @param index l'indice del brano da recuperare
     * @return il brano all'indice specificato, oppure null se l'indice è fuori dai limiti
     */
    public Brano getBrano(int index) {
        if (index >= 0 && index < brani.size()) {
            return brani.get(index);
        } else {
            return null;
        }
    }

    /**
     * ritorna la dimensione della playlist, il numero di brani presenti
     *
     * @return la dimensione della playlist
     */
    public int getDimensione() {
        return brani.size();
    }

    /**
     * restituisce una rappresentazione in formato stringa della playlist,
     * inclusi il titolo e i brani presenti
     *
     * @return una stringa che rappresenta la playlist
     */
    @Override
    public String toString() {
        return "titolo='" + titolo + '\n' +
                ", brano=" + brani;
    }
}


