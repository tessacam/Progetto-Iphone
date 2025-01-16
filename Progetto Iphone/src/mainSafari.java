import java.util.*;
/**
 * un'applicazione che simula safari con siti e articoli
 *
 * @author tessa caminada
 * @version gennaio 2025
 */
public class mainSafari {
    /**
     * avvia l'app Safari e stampa gli articoli
     */

    public static void avviaSafari() {
        // elenco dei siti con titoli e contenuti
        Map<String, List<String>> siti = new HashMap<>();
        Map<String, String> contenutoArticoli = new HashMap<>();

        // aggiunta di siti e articoli
        siti.put("RSI", Arrays.asList(
                "La Svizzera Brilla ai Campionati Europei Indoor",
                "Rapina in Banca a Lugano, Presi i Colpevoli",
                "Un’App Svizzera Rivoluziona i Trasporti Pubblici"
        ));

        siti.put("National Geographic", Arrays.asList(
                "I Segreti di Ötzi, l’Uomo del Ghiaccio",
                "La Riscoperta della Biodiversità nelle Foreste Svizzere",
                "Il Villaggio che Salvò un Branco di Elefanti"
        ));

        siti.put("CrimeReads", Arrays.asList(
                "Il Caso Irrisolto del Serial Killer di Long Island: Nuove Prove, Vecchi Misteri",
                "Donne Criminali: Le Storie Più Affascinanti di Lady Killer nella Storia",
                "Quando il Crimine si Misura in Byte: L’Evoluzione degli Hacker Criminali"
        ));

        siti.put("TechCrunch", Arrays.asList(
                "Apple lancia la nuova generazione di MacBook con chip M3",
                "OpenAI svela GPT-5: un passo avanti nell'intelligenza artificiale conversazionale",
                "Tesla introduce la modalità guida autonoma di nuova generazione"
        ));

        contenutoArticoli.put("La Svizzera Brilla ai Campionati Europei Indoor",
                "La delegazione svizzera ha lasciato il segno ai Campionati Europei Indoor di Atletica a Vienna.\n"+
                        "Con due medaglie d’oro e una d’argento, gli atleti elvetici hanno dimostrato grande forma e determinazione.\n"+
                        "Il momento più emozionante è stato il record personale di Lea Sprunger nei 400 metri,\n"+
                        "mentre Julien Wanders ha dominato i 3000 metri, regalando al pubblico una prestazione da manuale. Un orgoglio per tutto il Paese!"
        );


        contenutoArticoli.put("Rapina in Banca a Lugano, Presi i Colpevoli",
                "Momenti di panico ieri pomeriggio a Lugano, quando due uomini armati hanno fatto irruzione in una banca del centro.\n"+
                        "Dopo una breve fuga, i rapinatori sono stati fermati grazie al pronto intervento della polizia e alle segnalazioni dei passanti.\n"+
                        "Nessuno è rimasto ferito, ma i clienti della banca sono ancora sotto shock.\n"+
                        "I due responsabili, già noti alle forze dell’ordine, ora rischiano pene severissime."
        );


        contenutoArticoli.put("Un’App Svizzera Rivoluziona i Trasporti Pubblici",
                "La startup svizzera 'GreenMove' ha lanciato un’app rivoluzionaria che promette di semplificare i trasporti pubblici in tutta Europa.\n"+
                        "L’app integra orari, biglietti digitali e persino il car sharing, offrendo una piattaforma unica per spostarsi in modo più ecologico.\n"+
                        "Già in fase di test a Zurigo e Ginevra, l’app potrebbe presto arrivare anche nelle città ticinesi.\n"+
                        "L’obiettivo? Ridurre il traffico urbano e le emissioni di CO2, trasformando la mobilità quotidiana in un’esperienza più smart e sostenibile."
        );





        contenutoArticoli.put("I Segreti di Ötzi, l’Uomo del Ghiaccioa",
                "Ötzi, la mummia naturale scoperta nel 1991 tra le Alpi italiane, continua a svelare misteri sulla vita dell’Età del Rame.\n"+
                        "Questo articolo potrebbe esplorare le scoperte più recenti: dalla sua dieta agli strumenti che portava con sé,\n"+
                        "fino alle teorie sulla sua morte. Inoltre, si potrebbe fare un confronto tra la vita di allora e quella di oggi,\n"+
                        "mostrando quanto l’essere umano sia cambiato e, allo stesso tempo, rimasto simile."
        );



        contenutoArticoli.put("La Riscoperta della Biodiversità nelle Foreste Svizzere",
                "I ghiacciai alpini si stanno sciogliendo a un ritmo preoccupante, con il rischio di perdere oltre il 70% della loro massa entro il 2100.\n"+
                        "Questo articolo esplorerebbe il legame tra il cambiamento climatico e l’impatto sugli ecosistemi montani,\n"+
                        "mostrando anche storie di vita reale, come quella di comunità che dipendono dalle risorse idriche dei ghiacciai.\n"+
                        "Fotografie spettacolari evidenzierebbero l’urgenza di un’azione globale per preservare questo patrimonio naturale."
        );


        contenutoArticoli.put("Il Villaggio che Salvò un Branco di Elefanti",
                "Ogni anno, milioni di uccelli intraprendono viaggi straordinari,\n"+
                        "attraversando migliaia di chilometri per raggiungere luoghi più caldi o più ricchi di cibo.\n"+
                        "Questo articolo potrebbe esplorare i percorsi migratori più incredibili, come quello della sterna artica,\n"+
                        "che viaggia dall’Artico all’Antartico, o il volo senza sosta del piviere dorato del Pacifico.\n"+
                        "Potrebbe includere anche le minacce che affrontano, come i cambiamenti climatici e la perdita di habitat,\n"+
                        "e le tecnologie che i ricercatori usano per seguirne gli spostamenti, come i GPS in miniatura."
        );







        contenutoArticoli.put("Il Caso Irrisolto del Serial Killer di Long Island: Nuove Prove, Vecchi Misteri",
                "Un approfondimento su uno dei casi di cronaca nera più inquietanti degli Stati Uniti.\n" +
                        "L’articolo potrebbe esplorare le nuove prove trovate grazie ai moderni test del DNA, ma anche la frustrazione delle famiglie delle vittime,\n " +
                        "che continuano a cercare risposte. Verranno analizzati i fallimenti delle indagini iniziali e le ultime ipotesi investigative."

        );

        contenutoArticoli.put("Donne Criminali: Le Storie Più Affascinanti di Lady Killer nella Storia",
                "Questo articolo racconta le vite di donne che hanno lasciato un segno nella storia del crimine,\n " +
                        "come Aileen Wuornos o la Contessa Sanguinaria Elizabeth Báthory. Una riflessione sul perché \n " +
                        "queste figure continuano a catturare l'immaginazione pubblica e sui ruoli di genere nel mondo del crimine."
        );



        contenutoArticoli.put("Quando il Crimine si Misura in Byte: L’Evoluzione degli Hacker Criminali",
                "Con l’aumento della cybercriminalità, questo articolo esaminerebbe i casi più eclatanti,\n"+
                        "come i ransomware che hanno bloccato intere città o i furti di identità digitali.\n" +
                        "Include interviste con esperti di sicurezza informatica e approfondimenti sui confini sottili tra hacking etico e criminale."
        );





        contenutoArticoli.put("Apple lancia la nuova generazione di MacBook con chip M3",
                "Apple ha annunciato il rilascio dei nuovi MacBook Pro e MacBook Air dotati del chip M3,\n" +
                        "promuovendo un salto significativo in termini di prestazioni ed efficienza energetica. \n" +
                        "Secondo l'azienda, il chip M3 offre un incremento del 20% nelle prestazioni rispetto al precedente M2, \n" +
                        "con una migliore gestione del multitasking e della grafica avanzata. \n" +
                        "I nuovi modelli sono già disponibili per il preordine e promettono di ridefinire il mercato dei laptop professionali."
        );


        contenutoArticoli.put("OpenAI svela GPT-5: un passo avanti nell'intelligenza artificiale conversazionale",
                "OpenAI ha presentato il modello linguistico di ultima generazione, GPT-5, \n" +
                        "che promette una comprensione del linguaggio naturale ancora più sofisticata e un miglioramento significativo nella generazione di testo.\n" +
                        "Il nuovo modello, secondo l'azienda, è stato addestrato su un dataset più ampio e variegato, \n"+
                        "permettendo risposte più accurate e contestualizzate. GPT-5 è già integrato nei prodotti di punta di OpenAI, come ChatGPT e le API destinate agli sviluppatori."
        );


        contenutoArticoli.put("Tesla introduce la modalità guida autonoma di nuova generazione",
                "Tesla ha rilasciato un aggiornamento per il suo software di guida autonoma, denominato Full Self-Driving (FSD) v12.\n"+
                        "Questa versione introduce un'architettura di rete neurale più avanzata, capace di gestire scenari di guida complessi con maggiore sicurezza.\n"+
                        "Elon Musk ha dichiarato che questo aggiornamento rappresenta un passo fondamentale verso la guida completamente autonoma,\n"+
                        "anche se la supervisione del conducente è ancora richiesta. L'aggiornamento è disponibile per i possessori del pacchetto FSD attivo."
        );


        // Scanner per input dell'utente
        Scanner scanner = new Scanner(System.in);

        // Mostra i siti disponibili
        System.out.println("Benvenuto/a in Safari!");
        System.out.println("Ecco i siti disponibili per oggi:");
        for (String sito : siti.keySet()) {
            System.out.println("- " + sito);
        }

        System.out.println("\nScrivi il nome del sito per vedere gli articoli (oppure 'esci' per terminare):");

        while (true) {
            System.out.print("\n-> ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("esci")) {
                System.out.println("Grazie di aver navigato su Internet, ciao!");
                return;

            }

            if (siti.containsKey(input)) {
                System.out.println("Articoli di " + input + ":");
                List<String> articoli = siti.get(input);

                for (int i = 0; i < articoli.size(); i++) {
                    System.out.println((i + 1) + ". " + articoli.get(i));
                }

                System.out.println("\nScegli un articolo digitando il numero (oppure 'indietro' per tornare indietro):");

                while (true) {
                    if (scanner.hasNextLine()) {
                        System.out.print("\n> ");
                        String scelta = scanner.nextLine();

                        if (scelta.equalsIgnoreCase("indietro")) {
                            break;
                        }

                        try {
                            int numeroArticolo = Integer.parseInt(scelta);

                            if (numeroArticolo >= 1 && numeroArticolo <= articoli.size()) {
                                String articoloScelto = articoli.get(numeroArticolo - 1);
                                System.out.println("\nHai scelto l'articolo: " + articoloScelto);
                                System.out.println("Buona lettura!\n");
                                System.out.println(contenutoArticoli.get(articoloScelto));
                                System.out.println("\nDigita 'esci' per uscire da Safari.");
                                break;
                            } else {
                                System.out.println("Numero non valido, riprova.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Inserisci un numero valido.");
                        }
                    }
                }
            } else {
                System.out.println("Sito non trovato! Riprova.");
            }
        }

    }
}
