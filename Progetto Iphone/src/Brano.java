/**
 * brano singolo su spotify con nome e autore
 *
 * @author Tessa Caminada
 * @version gennaio 2025
 */
public class Brano {
    private String titolo;
    private String autore;

    /**
     * Crea un nuovo brano musicale.
     * @param titolo il titolo del brano
     * @param autore l'autore del brano
     */
    public Brano(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
    }

    /**
     * Restituisce il titolo del brano
     * @return titolo del brano
     */
    public String getTitolo() {
        return titolo;
    }

    /**
     * Imposta un nuovo titolo per il brano
     * @param titolo nuovo titolo del brano
     */
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    /**
     * Restituisce l'autore del brano
     * @return l'autore del brano
     */
    public String getAutore() {
        return autore;
    }

    /**
     * Imposta un nuovo autore per il brano
     * @param autore il nuovo autore del brano
     */
    public void setAutore(String autore) {
        this.autore = autore;
    }

    @Override
    public String toString() {
        return "titolo='" + titolo + '\n' +
                "autore='" + autore + '\n';
    }
}

