package banca;

public class Banca {

  Conto conti[] = new Conto[1000];
  Fido[] fidi = new Fido[1000];
  Mutuo[] mutui = new Mutuo[1000];
  Prestito[] prestiti = new Prestito[3];
  Prestito[] prestiti2 = new Prestito[4];
  Prestito[] pp= new Prestito[1];
  Cliente clienti[] = new Cliente[300];
  int i = -1;
  String I;
  int a = 0, o = 0;
  int b = 0;
  int w = 0;
  int ww = 0;
  int www = 0;
  int n_conti = 0;
  int n_clienti = 0;

  public Banca() {
  }

  public Conto nuovoConto(double tassoInteresse, double capitale, String dataApertura, String nomeOperatore, String nomeFiliale) {
    i++; o++;
    if (i < 10) { I = "00" + Integer.toString(i); }
    else if (i > 10 && i < 100) { I = "0" + Integer.toString(i); }
    else if (i > 100 && i < 1000) { I = Integer.toString(i); }
    Conto c = new Conto(I, tassoInteresse, capitale, dataApertura, nomeOperatore, nomeFiliale);
    conti[i] = c;
    return c;
  }

  public Conto cercaConto(String codiceConto) {
    for (int i = 0; i<o; i++) {
      /* System.out.println(conti.length); */

      if (codiceConto.compareTo(conti[i].getCodice()) == 0) {
        return conti[i];
      }
    }
    return null;
  }

  public Conto[] cercaConti(String daCercare) {
  Conto trovati[] = new Conto[2];
    for (int i = 0; i<o; i++) {
      /* System.out.println(conti.length); */

      Boolean found1, found2;
      String aaaaa = conti[i].getNomeOperatore().toLowerCase();
      found1 = aaaaa.contains(daCercare);
      if (found1 == true) {
        trovati[b] = conti[i];
        b++;
        /* found1 = false; */
        /* return trovati; */
      }
      String aaaab = conti[i].getNomeFiliale().toLowerCase();
      found2 = aaaab.contains(daCercare);
      if (found2 == true && found1 == false) {
        trovati[b] = conti[i];
        b++;
        found2 = false;
        /* return trovati; */
      }
        found1 = false;

    }
    return trovati;
  }
  // ================================================================================================================================
  // ================================================================================================================================
  // ================================================================================================================================
  // ================================================================================================================================
  // ================================================================================================================================
  // ================================================================================================================================

  public Cliente nuovoCliente(String codiceFiscale, String cognome, String nome, String professione) {
	if (this.n_clienti == 0) {
    i = 0;
		Cliente cc = new Cliente(codiceFiscale, cognome, nome, professione);
		clienti[i] = cc; n_clienti++; 
	} else {
      for (int ii = 0; ii<n_clienti; ii++) {
          /* System.out.println("gdfjksghjksdlghsdfjkghsdfklh"); */
        if (codiceFiscale.compareTo(clienti[ii].getCodiceFiscale()) == 0) {
          /* System.out.println("gdfjksghjksdlghsdfjkghsdfklh"); */
          clienti[ii].setNome(nome);
          clienti[ii].setCognome(cognome);
          clienti[ii].setProfessione(professione);
  return clienti[ii];
          /* System.out.println("gdfjksghjksdlghsdfjkghsdfklh"); */
        }
      }
      Cliente cc = new Cliente(codiceFiscale, cognome, nome, professione);
      clienti[++i] = cc; n_clienti++;
    }

  /* System.out.println("gdfjksghjksdlghsdfjkghsdfklh"); */
  return clienti[i];
  }

  public Cliente cercaCliente(String codiceFiscale) {
          /* System.out.println("gdfjksghjksdlghsdfjkghsdfklh"); */
          /* System.out.println("here"); */
    for (int q= 0; q<n_clienti; q++) {
//          System.out.println(clienti[q].getCodiceFiscale());
      if (codiceFiscale.compareTo(clienti[q].getCodiceFiscale()) == 0) {
        return clienti[q];
      }
    }
    /* System.out.println("hh"); */
    return null;
  }
  
  public boolean[] associaClienteConto(String codiceFiscale, String[] codiciConto) {
    boolean[] b = new boolean[codiciConto.length];
    for (int i = 0; i < n_clienti; i++) {
      if (codiceFiscale.compareTo(clienti[i].getCodiceFiscale()) == 0) {
		for (int j = 0; j<codiciConto.length; j++) {
			for (int k = 0; k<codiciConto.length+1; k++) {
			  if (codiciConto[j].compareTo(conti[k].getCodice()) == 0) {
          clienti[i].c[k!=2?k:1] = conti[k];
          clienti[i].n_of_conti++;
				  b[j] = true;
          if (j == 1) return b;
          if (codiciConto.length == 1) return b;
			  }
			}
		}
      }
    }
	b[i] = false;
	return b;
  }

  public Cliente intestatario(String codiceConto) {
    for (int q= 0; q<n_clienti; q++) {
      for (int u= 0; u<1000; u++) {
        if (codiceConto.compareTo(clienti[q].c[u].getCodice()) == 0) {
          return clienti[u];
        }
      }
    }
    return null;
  }

  public String contiCliente(String codiceFiscale) {
    String aa = "";
    for (int q= 0; q<n_clienti; q++) {
      if (codiceFiscale.compareTo(clienti[q].getCodiceFiscale()) == 0) {
      for (int u = 0; u<clienti[q].n_of_conti; u++) {
          /* if (clienti[q].c[u].getCodice() != null) { */
          aa += clienti[q].c[u].getCodice() + "\n";}
        /* } */
      }
    }
    aa = aa.substring(0, aa.length()-1);
    return aa;
  }

  public String clientiConto(String codiceConto) {
    String aaa = "";
    for (int q= 0; q<n_clienti; q++) {
      for (int u = 0; u<clienti[q].n_of_conti; u++) {
        if (codiceConto.compareTo(clienti[q].c[u].getCodice()) == 0) {
          //not done
            aaa += clienti[q].getCodiceFiscale() + "\n";
          }
      }
    }
    if (aaa != null) { aaa = aaa.substring(0, aaa.length()-1); }
    return aaa;
  }

  // ================================================================================================================================
  // ================================================================================================================================
  // ================================================================================================================================
  // ================================================================================================================================
  // ================================================================================================================================
  // ================================================================================================================================
  // 
/* Per i fidi, il metodo riceve come parametri il codice del conto, il codice di un cliente che dovr?? fare da garante, l???importo prestato, */
/*  la rata mensile da pagare e un tasso di rischio, e restituisce un oggetto di classe Fido. Il metodo verifica che il codice conto  */
/*  e il codice cliente esistano, che il cliente sia associato al suddetto conto e che il tasso di rischio non superi lo 0.75.  */
/*  Se tutte le suddette verifiche sono soddisfatte, il metodo attiva il fido e aggiorna il capitale associato al conto sul quale  */
/*  ?? stato versato l???importo del prestito */
{o = 0;}
  public Fido nuovoPrestito(String codiceConto, String codiceCliente, double importo, double rataMensile, double tassoRischio) {
  Prestito[] prestiti1 = new Prestito[4];o++;
  Fido f = new Fido(codiceConto, importo, "F", codiceCliente, tassoRischio);
    for (int q= 0; q<n_clienti; q++) {
      if (codiceCliente.compareTo(clienti[q].getCodiceFiscale()) == 0 && tassoRischio <= 0.75) {
      for (int u = 0; u<(o!=4?clienti[q].n_of_conti+1:4); u++) {
        if (codiceConto.compareTo(clienti[q].c[u].getCodice()) == 0) {
          clienti[q].c[u].setCapitale(clienti[q].c[u].getCapitale() + importo);
          fidi[w] = f;
          if(o<5){prestiti[ww] = f;}
          prestiti1[ww] = f;
          prestiti2[ww] = f;
          clienti[q].fc[u] = f;
          clienti[q].pc[u] = f;
          clienti[q].pc1[u] = f;
          w++;
          ww++;
          return f;
        }
      }
    }
  }

    return null;
  }
  // ================================================================================================================================
  // ================================================================================================================================
  // ================================================================================================================================
  // 

  
   /* Per i mutui, il metodo riceve invece come parametri il codice del conto, il codice di un cliente che dovr?? fare da garante, */
   /*  l???importo prestato, la rata mensile da pagare e il numero di mesi in cui il mutuo verr?? estinto, e restituisce un oggetto  */
   /*  di classe Mutuo. Il metodo verifica che il codice conto e il codice cliente esistano, che il cliente sia associato al  */
   /*  suddetto conto e, in questo caso, che il cliente non sia garante di altri prestiti. Se tutte le suddette verifiche */
   /*   sono soddisfatte, il metodo attiva il mutuo e aggiorna il capitale associato al conto sul quale ?? stato versato l???importo  */
   /*   del prestito. Cercando di attivare un prestito per un conto o un cliente non definiti oppure non associati, il metodo non  */
   /*   sortisce alcun effetto. */

  public Mutuo nuovoPrestito(String codiceConto, String codiceCliente, double importo, double rataMensile, int numeroMesi) {
  Mutuo m = new Mutuo(codiceConto, importo, "M", codiceCliente);
    for (int q= 0; q<n_clienti; q++) {
      if (codiceCliente.compareTo(clienti[q].getCodiceFiscale()) == 0) {
      for (int u = 0; u<clienti[q].n_of_conti+1; u++) {
        if (clienti[q].c[u] == null) return null;
        if (codiceConto.compareTo(clienti[q].c[u].getCodice()) == 0 && clienti[q].mc[u] == null) {
          clienti[q].c[u].setCapitale(clienti[q].c[u].getCapitale() + importo);
          mutui[www] = m;
          clienti[q].mc[u] = m;
          clienti[q].pc[u] = m;
          prestiti[ww] = m;
          prestiti2[ww] = m;
          clienti[q].pc1[u] = m;
          www++;
          ww++;
          // (clienti[q].pc!=null)?clienti[q].pc[3].:
          return m;
        }
      }
    }
  }

    return null;
  }
  // ================================================================================================================================
  // ================================================================================================================================
  // ================================================================================================================================
  //
  /* Il metodo prestiti() della classe Ateneo restituisce un array contenente tutti i prestiti definiti, in ordine di definizione. */
  /*  Una variante del metodo riceve come parametro un codice cliente e restituisce i soli prestiti definiti per quel cliente */
  /*   (nel medesimo ordine). Un???ulteriore variante riceve oltre al codice di un cliente anche una stringa che identifica un tipo */
  /*    di prestito (F oppure M) e restituisce solo i prestiti di quel tipo associati a tale cliente. */

  public Prestito[] prestiti() {
    return prestiti;

  }
  // ================================================================================================================================
  // ================================================================================================================================
  // ================================================================================================================================

  public Prestito[] prestiti(String codiceFiscale) {
    for (int q= 0; q<n_clienti; q++) {
      if (codiceFiscale.compareTo(clienti[q].getCodiceFiscale()) == 0) {
        /* for (int u = 0; u<clienti[q].n_of_conti; u++) { */
        /*   if (codiceFiscale.compareTo(clienti[q].c[u].getCodice()) == 0) { */
            return clienti[q].pc;
          /* } */
        /* } */
    }
          /* return prestiti; */
  }
          return null;
}

  // ================================================================================================================================
  // ================================================================================================================================
  // ================================================================================================================================

  public Prestito[] prestiti(String codiceFiscale, String tipo) {
    for (int q= 0; q<n_clienti; q++) {
      if (codiceFiscale.compareTo(clienti[q].getCodiceFiscale()) == 0) {
        /* for (int u = 0; u<clienti[q].n_of_conti; u++) { */
        /*   if (codiceFiscale.compareTo(clienti[q].c[u].getCodice()) == 0) { */
        pp[0]=clienti[q].pc[0];
            return pp;
        /*   } */
        /* } */
    }
          /* return prestiti; */
  }
          return null;
  }
}


//creare arrai prestiti, e creare mutuo, fido da inserire in prestiti e fine????