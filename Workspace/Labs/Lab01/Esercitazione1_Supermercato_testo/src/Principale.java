 import supermercato.Supermercato;
/* import supermercato.Vendita; */

/**
 * Classe con un metodo main() di esempio
 */

public class Principale {

      /**
     * Esempio d'uso della classe Supermercato
     */

  public static void main(String[] args) {

    // PRIMA PARTE - Questa parte serve per familiarizzare con il metodo main() e con la sintassi del linguaggio

    System.out.println("*************************************************************************************");
    System.out.println("*                                   Prima parte                                     *");
    System.out.println("*        Far stampare qui sotto le informazioni sulle vendite registrate            *");
    System.out.println("*                    interagendo solo con la classe Principale                      *");
    System.out.println("*************************************************************************************\n");
    System.out.println("ciao");


    String articolo1 = "Fusilli";
    String articolo2 = "Pizza Surgelata";

    String Marca1 = "Buitoni";
    String Marca2 = "Buitoni";

    int Unità1 = 300;
    int Unità2 = 150;

    float Prezzo1 = 2.50f;
    float Prezzo2 = 4;


    percentuale(Unità1, Unità2);

    //String  = new String();


    /* System.in.read() */

    System.out.println(articolo1 +", " + Marca1  +", "+ Unità1 +", " + Prezzo1);
    System.out.println(articolo2 +", " + Marca2 +", " + Unità2 +", " + Prezzo2);
    // SECONDA PARTE - Iniziare a ragionare in termini di classi e oggetti

    System.out.println("");
    System.out.println("*************************************************************************************");
    System.out.println("*                                   Seconda parte                                   *");
    System.out.println("*   Modificando la classe Supermercato (ed eventualmente aggiungendo altre classi), *");
    System.out.println("*    di seguito verranno mostrate le altre informazioni memorizzate dal sistema     *");
    System.out.println("*************************************************************************************\n");

    // Viene creato un nuovo supermercato, e se ne impostano l'indirizzo e il costo giornaliero

    Supermercato s = new Supermercato();
    s.setIndirizzo("Via dei Supermercati 99");
    s.setCostoGiornaliero(130.5);

    // L'indirizzo e il costo giornaliero sono accessibili tramite i metodi getIndirizzo() e getcostoGiornaliero()

    String indirizzo = s.getIndirizzo();
    double costoGiornaliero = s.getCostoGiornaliero();

    System.out.println("Creato supermercato in "+indirizzo+", costo giornaliero "+costoGiornaliero);

    // una vendita viene gestita dal metodo nuovaVendita()

    s.nuovaVendita("Fusilli", "Barilla", 300, 2.5);
    s.nuovaVendita("Pizza Surgelata", "Buitoni", 150, 4);

    // Per accedere alle informazioni relative all'ultima vendita si utilizza il metodo ultimaVendita()

    System.out.println("");
    System.out.println("Ultima vendita:");
    String ultimaVendita = s.ultimaVendita();
    System.out.println(ultimaVendita);

    // Per accedere alle informazioni relative ad una qualsiasi delle vendite siutilizza il metodo vendita()

    System.out.println("");
    System.out.println("Vendita del prodotto con nome Fusilli e con marca Barilla");
    String venditaCercata = s.vendita("Fusilli", "Barilla");
    System.out.println(venditaCercata);

    // Il metodo giorniCoperti() restituisce un valore di tipo double relativo al numero di giorni
    // coperti, , calcolati come il rapporto tra il totale degli incassi ottenuti dalle vendite finora
    // registrate ed il costo di gestione giornaliero.

    System.out.println("");
    System.out.println("Giorni coperti:");
    double giorniCoperti = s.giorniCoperti();
    System.out.println(giorniCoperti);

  }

  public static void percentuale(int U1, int U2) {

    double V = 50;
    double Tot = U1+U2;
    System.out.println(U1);
    System.out.println(U2);
    System.out.println(Tot);
    System.out.println(((double)V/(double)Tot));
    double per = ((double)(V/Tot)*100);
    System.out.println(per + "%");

  }

}
