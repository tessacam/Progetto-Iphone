/**
 * rappresenta una libreria che può contenere una collezione di libri
 * può di aggiungere e contare i libri
 *
 * @author Tessa Caminada
 * @version gennaio 2025
 */
import java.util.ArrayList;

public class Libreria {
    private String nome;
    private ArrayList<Libro> libri;

    /**
     * Crea una nuova libreria
     * @param nome il nome della libreria
     */
    public Libreria(String nome) {
        this.nome = nome;
        this.libri = new ArrayList<>();
    }

    /**
     * aggiunge un nuovo libro alla libreria
     * @param libro il libro da aggiungere alla collezione
     */
    public void aggiungiLibro(Libro libro) {
        libri.add(libro);
        System.out.println("Il libro \"" + libro.getTitolo() + "\" è stato aggiunto con successo!");
    }

    /**
     * Recupera un libro dalla libreria in base al numero scelto
     * @param index l'indice del libro
     * @return il libro corrispondente
     */
    public Libro getLibro(int index) {
        if (index >= 0 && index < libri.size()) {
            return libri.get(index);
        } else {
            System.out.println("Indice non valido. Nessun libro trovato.");
            return null;
        }
    }

    /**
     * Restituisce il numero totale di libri presenti nella libreria
     * @return il numero di libri nella libreria
     */
    public int getNumeroLibri() {
        return libri.size();
    }
}

