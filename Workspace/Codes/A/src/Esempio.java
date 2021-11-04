import aeroporto.Aeroporto;

/**
 * Classe con un main di esempio
 */

public class Esempio {

  public static void main(String[] args) {
    
    System.out.println("Creazione aeroporto e impostazione degli attributi\n\n");

    Aeroporto a = new Aeroporto("Sandro Pertini Torino-Caselle", "Via Aeroporto 12", 50);
    
    String denominazione = a.getDenominazione();
    String indirizzo = a.getIndirizzo();
    int numeroAerei = a.getNumeroAerei();
    
    System.out.println("Creato aeroporto " + denominazione + " all'indirizzo " + indirizzo + " che puo ospitare " + numeroAerei + " aerei\n\n");
    System.out.println("Impostazione numero di decolli e descrizione dell'aeroporto\n\n");
    
    a.setNumeroDecolli(2);
    String descrizioneAeroporto = a.descrizioneAeroporto();
    System.out.println("Descrizione aeroporto: " + descrizioneAeroporto + "\n\n");
    
    System.out.println("Creazione di tre aerei\n\n");
    int id1 = a.aggiungiAereo("Modello0", 20, 3000);
    int id5 = a.aggiungiAereo("Modello5", 200, 3000);
    int id6 = a.aggiungiAereo("Modello6", 200, 3000);
    int id7 = a.aggiungiAereo("Modello7", 200, 3000);
    int id8 = a.aggiungiAereo("Modello8", 200, 3000);
    int id2 = a.aggiungiAereo("Modello1", 160, 3000);
    int id9 = a.aggiungiAereo("Modello9", 160, 3000);
    int id10 = a.aggiungiAereo("Modello9", 160, 3000);
    int id3 = a.aggiungiAereo("Modello2", 200, 2900);
    int id11 = a.aggiungiAereo("Modello21", 200, 2900);
    int id12 = a.aggiungiAereo("Modello22", 200, 2900);
    int id13 = a.aggiungiAereo("Modello23", 200, 2900);
    int id14 = a.aggiungiAereo("Modello24", 200, 2900);
    int id15 = a.aggiungiAereo("Modello25", 200, 2900);
    int id16 = a.aggiungiAereo("Modello26", 200, 2900);
    int id17 = a.aggiungiAereo("Modello27", 200, 2900);
    int id18 = a.aggiungiAereo("Modello28", 200, 2900);
    int id19 = a.aggiungiAereo("Modello29", 200, 2900);
    int id20 = a.aggiungiAereo("Modello30", 200, 2900);
    int id21 = a.aggiungiAereo("Modello31", 200, 2900);
    int id22 = a.aggiungiAereo("Modello32", 200, 2900);
    int id23 = a.aggiungiAereo("Modello33", 200, 2900);
    int id24 = a.aggiungiAereo("Modello34", 200, 2900);
    int id25 = a.aggiungiAereo("Modello35", 200, 2900);
    int id26 = a.aggiungiAereo("Modello36", 200, 2900);
    int id27 = a.aggiungiAereo("Modello37", 200, 2900);
    int id28 = a.aggiungiAereo("Modello38", 200, 2900);
    int id29 = a.aggiungiAereo("Modello39", 200, 2900);
    int id30 = a.aggiungiAereo("Modello40", 200, 2900);
    int id52 = a.aggiungiAereo("Modello62", 176, 2900);
    int id31 = a.aggiungiAereo("Modello41", 200, 2900);
    int id32 = a.aggiungiAereo("Modello42", 200, 2900);
    int id33 = a.aggiungiAereo("Modello43", 200, 2900);
    int id34 = a.aggiungiAereo("Modello44", 200, 2900);
    int id35 = a.aggiungiAereo("Modello45", 175, 2900);
    int id36 = a.aggiungiAereo("Modello46", 200, 2900);
    int id37 = a.aggiungiAereo("Modello47", 200, 2900);
    int id38 = a.aggiungiAereo("Modello48", 200, 2900);
    int id39 = a.aggiungiAereo("Modello49", 200, 2900);
    int id40 = a.aggiungiAereo("Modello50", 200, 2900);
    int id41 = a.aggiungiAereo("Modello51", 200, 2900);
    int id42 = a.aggiungiAereo("Modello52", 200, 2900);
    int id43 = a.aggiungiAereo("Modello53", 200, 2900);
    int id44 = a.aggiungiAereo("Modello54", 200, 2900);
    int id45 = a.aggiungiAereo("Modello55", 200, 2900);
    int id46 = a.aggiungiAereo("Modello56", 200, 2900);
    int id47 = a.aggiungiAereo("Modello57", 200, 2900);
    int id48 = a.aggiungiAereo("Modello58", 200, 2900);
    int id49 = a.aggiungiAereo("Modello59", 200, 2900);
    int id50 = a.aggiungiAereo("Modello60", 200, 2900);
    int id51 = a.aggiungiAereo("Modello61", 200, 2900);
    int id53 = a.aggiungiAereo("Modello63", 175, 3000);
    int id54 = a.aggiungiAereo("Modello64", 200, 2900);
    int id55 = a.aggiungiAereo("Modello65", 200, 2900);
    int id56 = a.aggiungiAereo("Modello66", 200, 2900);
    int id57 = a.aggiungiAereo("Modello67", 200, 2900);
    int id58 = a.aggiungiAereo("Modello68", 200, 2900);
    int id59 = a.aggiungiAereo("Modello69", 200, 2900);
    
    System.out.println("Creati gli aerei con id " + id1 + ", " + id2 + " e " + id3 +"\n\n");
    System.out.println("Informazioni su un aereo\n\n");
    
    String aereoTrovato = a.aereo(id2);
    System.out.println("Informazioni: " + aereoTrovato +"\n\n");
    
    System.out.println("Stampa aerei\n\n");
    if(a.aerei() != null)
      for (String s : a.aerei())
        if (s != null)
          System.out.println(s);
    
    
    System.out.println("\n\nCreazione di un viaggio\n\n");
    String viaggio1 = a.aggiungiViaggio("Torino-Bari", 170, 2900);
    String viaggio4 = a.aggiungiViaggio("Torino-Bari", 174, 2800);
    String viaggio5 = a.aggiungiViaggio("Torino-Bari", 80, 2800);
    String viaggio6 = a.aggiungiViaggio("Torino-Bari", 90, 2800);
    String viaggio7 = a.aggiungiViaggio("Torino-Bari", 1000, 2800);
    String viaggio8 = a.aggiungiViaggio("Torino-Bari", 110, 2800);
    String viaggio9 = a.aggiungiViaggio("Torino-Bari", 174, 2800);
    String viaggio10 = a.aggiungiViaggio("Torino-Bari", 80, 2800);
    String viaggio11 = a.aggiungiViaggio("Torino-Bari", 90, 2800);
    String viaggio12 = a.aggiungiViaggio("Torino-Bari", 1000, 2800);
    String viaggio13 = a.aggiungiViaggio("Torino-Bari", 110, 2800);
    String viaggio14 = a.aggiungiViaggio("Torino-Bari", 174, 2800);
    String viaggio15 = a.aggiungiViaggio("Torino-Bari", 174, 2800);
    String viaggio16 = a.aggiungiViaggio("Torino-Bari", 174, 2800);
    String viaggio17 = a.aggiungiViaggio("Torino-Bari", 174, 2800);
    String viaggio18 = a.aggiungiViaggio("Torino-Bari", 80, 2800);
    String viaggio19 = a.aggiungiViaggio("Torino-Bari", 90, 2800);
    String viaggio20 = a.aggiungiViaggio("Torino-Bari", 1000, 2800);
    String viaggio21 = a.aggiungiViaggio("Torino-Bari", 110, 2800);
    String viaggio22 = a.aggiungiViaggio("Torino-Bari", 80, 2800);
    String viaggio23 = a.aggiungiViaggio("Torino-Bari", 90, 2800);
    String viaggio24 = a.aggiungiViaggio("Torino-Bari", 1000, 2800);
    String viaggio25 = a.aggiungiViaggio("Torino-Bari", 110, 2800);
    String viaggio26 = a.aggiungiViaggio("Torino-Bari", 80, 2800);
    String viaggio27 = a.aggiungiViaggio("Torino-Bari", 90, 2800);
    String viaggio28 = a.aggiungiViaggio("Torino-Bari", 1000, 2800);
    String viaggio29 = a.aggiungiViaggio("Torino-Bari", 110, 2800);
    String viaggio30 = a.aggiungiViaggio("Torino-Bari", 80, 2800);
    String viaggio31 = a.aggiungiViaggio("Torino-Bari", 90, 2800);
    String viaggio32 = a.aggiungiViaggio("Torino-Bari", 1000, 2800);
    String viaggio33 = a.aggiungiViaggio("Torino-Bari", 110, 2800);
    String viaggio34 = a.aggiungiViaggio("Torino-Bari", 90, 2800);
    String viaggio35 = a.aggiungiViaggio("Torino-Bari", 1000, 2800);
    String viaggio36 = a.aggiungiViaggio("Torino-Bari", 110, 2800);
    String viaggio37 = a.aggiungiViaggio("Torino-Bari", 174, 2800);
    String viaggio38 = a.aggiungiViaggio("Torino-Bari", 174, 2800);
    String viaggio39 = a.aggiungiViaggio("Torino-Bari", 174, 2800);
    String viaggio40 = a.aggiungiViaggio("Torino-Bari", 174, 2800);
    String viaggio41 = a.aggiungiViaggio("Torino-Bari", 80, 2800);
    String viaggio42 = a.aggiungiViaggio("Torino-Bari", 90, 2800);
    String viaggio43 = a.aggiungiViaggio("Torino-Bari", 1000, 2800);
    String viaggio44 = a.aggiungiViaggio("Torino-Bari", 110, 2800);
    String viaggio45 = a.aggiungiViaggio("Torino-Bari", 80, 2800);
    String viaggio46 = a.aggiungiViaggio("Torino-Bari", 90, 2800);
    String viaggio47 = a.aggiungiViaggio("Torino-Bari", 1000, 2800);
    String viaggio48 = a.aggiungiViaggio("Torino-Bari", 110, 2800);
    String viaggio49 = a.aggiungiViaggio("Torino-Bari", 80, 2800);
    String viaggio50 = a.aggiungiViaggio("Torino-Bari", 90, 2800);
    String viaggio51 = a.aggiungiViaggio("Torino-Bari", 1000, 2800);
    String viaggio52 = a.aggiungiViaggio("Torino-Bari", 110, 2800);
    String viaggio53 = a.aggiungiViaggio("Torino-Bari", 80, 2800);
    String viaggio54 = a.aggiungiViaggio("Torino-Bari", 90, 2800);
    String viaggio55 = a.aggiungiViaggio("Torino-Bari", 1000, 2800);
    String viaggio56 = a.aggiungiViaggio("Torino-Bari", 110, 2800);
    
    System.out.println("Creazione di un viaggio\n\n");
    String viaggio2 = a.aggiungiViaggio("Torino-Bari", 150, 3000);
    String viaggio3 = a.aggiungiViaggio("Torino-Baaaaari", 190, 3000);
    
    System.out.println("Viaggi creati\n\n");
    System.out.println("Viaggio 0: " + viaggio1);
    System.out.println("Viaggio 1: " + viaggio2);
    
    
    System.out.println("Ricerca di un viaggio\n\n");
    String viaggioTrovato = a.viaggio(id2, "Torino-Bari");
    if (viaggioTrovato!=null) 
      System.out.println("Trovato viaggio " + viaggioTrovato + "\n\n");
    else
      System.out.println("Nessun viaggio trovato");
    
    System.out.println("Elenco dei viaggi:\n\n");
    String viaggi = a.viaggi();
    System.out.println(viaggi);
    
    System.out.println("\n\nElenco dei viaggi per la tratta Torino-Bari:\n\n");
    String viaggiPerTratta = a.viaggiPerTratta("Torino-Bari");
    System.out.println(viaggiPerTratta);
  } 
}
