/**
 * gestisce l'archiviazione e il recupero delle note da un file
 *
 * @author tessa caminada
 * @version gennaio 2025
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NotaManager {
    private String filePath;

    /**
     * crea un gestore per le note, specificando il percorso del file dove salvarle e caricarle
     *
     * @param filePath il percorso del file per il salvataggio delle note
     */
    public NotaManager(String filePath) {
        this.filePath = filePath;
    }

    /**
     * salva una singola nota nel file
     *
     * @param nota la nota da salvare
     */
    public void salvaNota(Nota nota) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(nota.getMateria() + ";" + nota.getVoto() + ";" + nota.getDescrizione() + "\n");
        } catch (IOException e) {
            System.out.println("errore durante il salvataggio della nota: " + e.getMessage());
        }
    }

    /**
     * carica tutte le note da un file txt
     *
     * @return una lista di note caricate dal file
     */
    public List<Nota> caricaNote() {

        List<Nota> note = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parti = line.split(";");
                if (parti.length == 3) {
                    String materia = parti[0];
                    double voto = Double.parseDouble(parti[1]);
                    String descrizione = parti[2];
                    note.add(new Nota(materia, voto, descrizione));
                }
            }
        } catch (IOException e) {
            System.out.println("errore nell'aggiungimento delle note al file " + e.getMessage());
        }
        return note;
    }
}


