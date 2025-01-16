/**
 * rappresenta una nota scolastica con materia, voto e descrizione
 *
 * @author tessa caminada
 * @version gennaio 2025
 */
import java.util.Objects;

class Nota {
    private String materia;
    private double voto;
    private String descrizione;

    /**
     * crea una nota con materia, voto e descrizione
     *
     * @param materia la materia della nota
     * @param voto il voto della nota
     * @param descrizione una descrizione della nota
     */
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nota nota = (Nota) o;

        return Double.compare(nota.voto, voto) == 0 &&
                Objects.equals(materia, nota.materia) &&
                Objects.equals(descrizione, nota.descrizione);
    }

    @Override
    public int hashCode() {
        return Objects.hash(materia, voto, descrizione);
    }

    /**
     * ritorna la nota
     *
     * @return una stringa che rappresenta la nota
     */
    @Override
    public String toString() {
        return "Materia: " + materia + ", Voto: " + voto + ", Descrizione: " + descrizione;
    }
}

