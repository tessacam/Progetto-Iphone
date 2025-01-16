/**
 * Classe che rappresenta un libro con titolo, autore, anno di pubblicazione e prezzo.
 *
 * @author tessa caminada
 * @version gennaio 2025
 */
public class Libro {
    private String titolo;
    private String autore;
    private int anno;
    private String prezzo;

    /**
     * Costruttore per inizializzare le informazioni di un libro.
     *
     * @param titolo il titolo del libro
     * @param autore l'autore del libro
     * @param anno l'anno di pubblicazione
     * @param prezzo il prezzo del libro
     */
    public Libro(String titolo, String autore, int anno, String prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
        this.prezzo = prezzo;
    }

    /**
     * Restituisce il titolo del libro.
     *
     * @return il titolo del libro
     */
    public String getTitolo() {
        return titolo;
    }

    /**
     * Imposta il titolo del libro.
     *
     * @param titolo il nuovo titolo del libro
     */
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    /**
     * Restituisce l'autore del libro.
     *
     * @return l'autore del libro
     */
    public String getAutore() {
        return autore;
    }

    /**
     * Imposta l'autore del libro.
     *
     * @param autore il nuovo autore del libro
     */
    public void setAutore(String autore) {
        this.autore = autore;
    }

    /**
     * Restituisce l'anno di pubblicazione del libro.
     *
     * @return l'anno di pubblicazione del libro
     */
    public int getAnno() {
        return anno;
    }

    /**
     * Imposta l'anno di pubblicazione del libro.
     *
     * @param anno il nuovo anno di pubblicazione
     */
    public void setAnno(int anno) {
        this.anno = anno;
    }

    /**
     * Restituisce il prezzo del libro.
     *
     * @return il prezzo del libro
     */
    public String getPrezzo() {
        return prezzo;
    }

    /**
     * Imposta il prezzo del libro.
     *
     * @param prezzo il nuovo prezzo del libro
     */
    public void setPrezzo(String prezzo) {
        this.prezzo = prezzo;
    }

    /**
     * Restituisce una rappresentazione in formato stringa delle informazioni del libro.
     *
     * @return una stringa che rappresenta il libro
     */
    @Override
    public String toString() {
        return  titolo +", autore=" + autore + ", anno=" + anno + ", prezzo=" + prezzo + ".-";
    }
}
