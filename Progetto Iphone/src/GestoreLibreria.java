/**
 * gestisce una libreria che permette di visualizzare i libri di kindle
 *
 * @author Tessa Caminada
 * @version gennaio 2025
 */
public class GestoreLibreria {
    private Libreria libreria;

    /**
     * Crea un nuovo gestore per la libreria specificata.
     * @param libreria la libreria da gestire
     */
    public GestoreLibreria(Libreria libreria) {
        this.libreria = libreria;
    }

    /**
     * Mostra le informazioni di un libro in base all'indice specificato.
     * @param index l'indice del libro da visualizzare
     */

    public void mostraLibro(int index) {
        if (index >= 0 && index < libreria.getNumeroLibri()) {
            Libro libro = libreria.getLibro(index);
            System.out.println("ecco il libro che hai scelto:");
            System.out.println(libro.toString());
        } else {
            System.out.println("questo libro non è disponibile");
        }
    }

    /**
     * Mostra tutti i libri presenti nella libreria con un formato amichevole.
     */
    public void mostraTuttiILibri() {

        System.out.println("ecco tutti i libri disponibili nella libreria:");


        for (int i = 0; i < libreria.getNumeroLibri(); i++) {
            Libro libro = libreria.getLibro(i);
            System.out.println((i + 1) + ". " + libro.getTitolo() + " - " + libro.getAutore());
        }
    }
}



