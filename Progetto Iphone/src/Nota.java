import java.util.Objects;

class Nota {
    private String materia;
    private double voto;
    private String descrizione;

    public Nota(String materia, double voto, String descrizione) {
        this.materia = materia;
        this.voto = voto;
        this.descrizione = descrizione;
    }

    public String getMateria() {
        return materia;
    }

    public double getVoto() {
        return voto;
    }

    public String getDescrizione() {
        return descrizione;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Se gli oggetti sono la stessa istanza
        if (o == null || getClass() != o.getClass()) return false; // Se l'oggetto è null o di tipo diverso
        Nota nota = (Nota) o; // Cast dell'oggetto

        // Confronto dei campi significativi
        return Double.compare(nota.voto, voto) == 0 &&
                Objects.equals(materia, nota.materia) &&
                Objects.equals(descrizione, nota.descrizione);
    }

    @Override
    public int hashCode() {
        return Objects.hash(materia, voto, descrizione); // Crea un hash combinato dei campi
    }

    @Override
    public String toString() {
        return "Materia: " + materia + ", Voto: " + voto + ", Descrizione: " + descrizione;
    }
}
