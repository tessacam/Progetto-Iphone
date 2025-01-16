/**
 * rappresenta un messaggio inviato tra due utenti
 *
 * @author tessa caminada
 * @version gennaio 2025
 */
class Messaggio {

    private String mittente;
    private String destinatario;
    private String contenuto;

    /**
     * crea un messaggio con mittente, destinatario e contenuto
     *
     * @param mittente il mittente del messaggio
     * @param destinatario il destinatario del messaggio
     * @param contenuto il contenuto del messaggio
     */
    public Messaggio(String mittente, String destinatario, String contenuto) {
        this.mittente = mittente;
        this.destinatario = destinatario;
        this.contenuto = contenuto;
    }

    /**
     * ritorna una i messaggi
     *
     * @return una stringa che rappresenta il messaggio
     */
    @Override
    public String toString() {
        return mittente + " a " + destinatario + ": " + contenuto;
    }
}
