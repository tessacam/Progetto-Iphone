public class Libro {
    private String titolo;
    private String autore;
    private int anno;
    private String prezzo;

    public Libro(String titolo, String autore, int anno, String prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
        this.prezzo = prezzo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(String prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return  titolo +", autore=" + autore + ", anno=" + anno + ", prezzo=" + prezzo + ".-";
    }
}

