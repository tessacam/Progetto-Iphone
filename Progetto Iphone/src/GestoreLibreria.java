public class GestoreLibreria {
    private Libreria libreria;

    public GestoreLibreria(Libreria libreria) {
        this.libreria = libreria;
    }

    public void mostraLibro(int index) {
        if (index >= 0 && index < libreria.getNumeroLibri()) {
            Libro libro = libreria.getLibro(index);
            System.out.println("il libro che vuoi comprare è:");
            System.out.println(libro.toString());
        } else {
            System.out.println("libro non trovato!");
        }
    }

    public void mostraTuttiILibri() {
        for (int i = 0; i < libreria.getNumeroLibri(); i++) {
            Libro libro = libreria.getLibro(i);
            System.out.println(i + ". " + libro.getTitolo() + " - " + libro.getAutore());
        }
    }
}



