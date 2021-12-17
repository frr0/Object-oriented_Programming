package serviziospedizioni;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ServizioSpedizioni {
	Corriere[] corrieri = new Corriere[100];
	Collo[] colli = new Collo[100];
	Spedizione[] spedizioni = new Spedizione[100];
	Giorno[] giorni = new Giorno[100];
	Giorno giorno = new Giorno(null);
	ArrayList<Giorno> gg = new ArrayList<>();
	ArrayList<Corriere> cc = new ArrayList<>();
	ArrayList<Spedizione> ss = new ArrayList<>();
	ArrayList<Spedizione> sss = new ArrayList<>();
	int nCorrieri = 0;
	int nColli = 0;
	int nSpedizioni = 0;
	
	public Corriere registraCorriere(String nome, String cognome, int eta, String citta) {
		int n;
		String a = "";
		a = nome.substring(0, 2) + cognome.substring(0, 2) + eta + citta.substring(0, 2);
		a = a.toUpperCase();
		Corriere c = new Corriere(a, nome, cognome, eta, citta);
		Corriere cc = new Corriere(a, nome, cognome, eta, citta);
		cc = cercaCorriere(a);
		if (cc == null) {corrieri[nCorrieri++] = c;}
		else { n = 1;corrieri[nCorrieri++] = c;
			for (int i = 0; i<nCorrieri; i++) {
				if (a.compareTo(corrieri[i].getCodiceCorriere()) == 0) {
					corrieri[i].setCodiceCorriere(corrieri[i].getCodiceCorriere() + "_" + n++);
			}
		}
	}
		return c;
	}
	
	public Corriere cercaCorriere(String codiceCorriere) {
		for (int i = 0; i < nCorrieri; i++) {
			if (corrieri[i] != null && codiceCorriere.compareTo(corrieri[i].getCodiceCorriere()) == 0) {
				return corrieri[i];
			}
		}
		return null;
	}
	
	public Corriere[] cercaCorrieri(){
	Corriere[] co = new Corriere[nCorrieri];
		for (int i = 0; i < nCorrieri; i++) {
			if (corrieri[i] != null) {
				co[i] = corrieri[i];
			}
		}
		return co;
	}

	public Standard creaCollo(String citta, String dataDeposito, String indirizzoMittente, String indirizzoDestinatario) {
	    String a = "";
	    a = citta.substring(0, 2) + "_" + ++nColli;
	    a = a.toUpperCase();
		Standard s = new Standard(a, citta, dataDeposito, indirizzoDestinatario, indirizzoMittente);
		colli[nColli] = s;
		colli[nColli].tipo = "S";
//		nColli++;
		return s;
	}
	
	public Prioritario creaCollo(String citta, String dataDeposito, String indirizzoMittente, String indirizzoDestinatario, String mailMittente) {
	    String a = "";
	    a = citta.substring(0, 2) + "_" + ++nColli;
	    a = a.toUpperCase();
		Prioritario p = new Prioritario(a, citta, dataDeposito, indirizzoDestinatario, indirizzoMittente, mailMittente);
		colli[nColli] = p;
		colli[nColli].tipo = "P";
//		nColli++;
		return p;
	}
	
	public Collo cercaCollo(String codiceCollo) {
		for (int i = 0; i < colli.length; i++) {
			if (colli[i] != null && codiceCollo.compareTo(colli[i].getCodiceCollo()) == 0) {
				return colli[i];
			}
		}
		return null;
	}
	
	public Collo[] cercaColli() {
	Collo[] col = new Collo[nColli];
//		for (int i = 0; i < nColli; i++) {
		for (int i = 0; i < colli.length; i++) {
			if (colli[i] != null) {
				col[i] = colli[i];
			}
		}
		return col;
	}
	
	public Spedizione creaSpedizione(String codiceCollo, String citta, String dataConsegna) {
		Spedizione sp = new Spedizione(null, null, codiceCollo, citta, dataConsegna, false);
		Giorno g = new Giorno(dataConsegna);
		int ggg = 0;
		Collo c1 = cercaCollo(codiceCollo);
		int aa = 0;
		int aaa = 0;
	    String a = "";
		if (c1.tipo.compareTo("S") == 0) {
			a = "S" + "_" + citta.substring(0, 2) + "_" + ++nSpedizioni;
			a = a.toUpperCase();
		} else if (c1.tipo.compareTo("P") == 0) {
			a = "P" + "_" + citta.substring(0, 2) + "_" + ++nSpedizioni;
			a = a.toUpperCase();
		}
		for (int i = 0; i<nCorrieri; i++) {
			if (corrieri[i].getCitta().compareTo(citta) == 0) {
				for (int j = 0; j<100; j++) {
//					if (corrieri[i].giorni[j].nn_sp < aaa) {aaa = corrieri[i].giorni[j].nn_sp;}
					if (corrieri[i].giorni[j] == null ||corrieri[i].giorni[j].dataaa == null|| corrieri[i].giorni[j].dataaa.compareTo(dataConsegna) == 0)  {
						corrieri[i].giorni[j] = g;
						this.gg.add(g); gg.add(g); ggg++;
					
						for (int f = 0; f<nCorrieri; f++) {
							if (corrieri[f].giorni[j].dataaa.compareTo(dataConsegna) == 0) {
//								if (corrieri[i].giorni[j].nn_sp < corrieri[f].giorni[j].nn_sp) {
									corrieri[i].giorni[j].nn_sp++;
									for (int k = 0; k<3; k++) {
										if (corrieri[i].giorni[j].spedizioni[k] == null) {
			//								System.out.println(12);
											spedizioni[--nSpedizioni] = sp;
											corrieri[i].spedizioni[j] = sp;
											corrieri[i].spedizioni[j].occupato = true;
											corrieri[i].giorni[j].spedizioni[k] = sp;
											sp = new Spedizione(a, corrieri[i].getCodiceCorriere(), codiceCollo, citta, dataConsegna, true);
											spedizioni[nSpedizioni] = sp;
											spedizioni[nSpedizioni].occupato = true;
											corrieri[i].spedizioni[j] = sp;
											corrieri[i].giorni[j].spedizioni[k] = sp;
											return spedizioni[nSpedizioni++];
										}
									}
							}
						}
					}
				}
			}
		}
//								 else if (corrieri[f].giorni[j].nn_sp < corrieri[i].giorni[j].nn_sp) {
//									corrieri[f].giorni[j].nn_sp++;
//									for (int k = 0; k<3; k++) {
//										if (corrieri[i].giorni[j].spedizioni[k] == null) {
//			//								System.out.println(12);
//											spedizioni[--nSpedizioni] = sp;
//											corrieri[f].spedizioni[j] = sp;
//											corrieri[f].spedizioni[j].occupato = true;
//											corrieri[f].giorni[j].spedizioni[k] = sp;
//											sp = new Spedizione(a, corrieri[i].getCodiceCorriere(), codiceCollo, citta, dataConsegna, true);
//											spedizioni[nSpedizioni] = sp;
//											spedizioni[nSpedizioni].occupato = true;
//											corrieri[f].spedizioni[j] = sp;
//											corrieri[f].giorni[j].spedizioni[k] = sp;
//											return spedizioni[nSpedizioni++];
////										}
//									}
//								}
//							}
//						}
//					}
//					if (corrieri[i].spedizioni[j] == null || corrieri[i].spedizioni[j].occupato == false) {
//						for (int y = 0; y < nCorrieri; y++) {
//							if (corrieri[y].giorni[j].nn_sp < aa) {
//								aa = corrieri[y].giorni[j].nn_sp;
//							}
//						}
//					}
//				}
//			}
//		}
		return null;
	}
	
	public Spedizione cercaSpedizione(String codiceSpedizione) {
		for (int i = 0; i < colli.length; i++) {
			if (spedizioni[i] != null && codiceSpedizione.compareTo(spedizioni[i].codiceSpedizione) == 0) {
				return spedizioni[i];
			}
		}
		return null;
	}
	
	public Spedizione[] cercaSpedizioni() {
	Spedizione[] sped = new Spedizione[nSpedizioni];
//		for (int i = 0; i < nColli; i++) {
		for (int i = 0; i < spedizioni.length; i++) {
			if (spedizioni[i] != null) {
				sped[i] = spedizioni[i];
			}
		}
		return sped;
	}
	
	public Collection<Corriere> elencoCorrieriPerEta() {
		for (int i = 0; i<corrieri.length; i++) {
			if (corrieri[i] != null) {
				this.cc.add(corrieri[i]);
			}
		}
		Collections.sort(cc, new sortEta());
		return cc;
	}

	public Collection<Spedizione> elencoSpedizioniCorrierePerData(String codiceCorriere) {
	Corriere cor = cercaCorriere(codiceCorriere);
		for (int i = 0; cor.giorni != null && i<cor.giorni.length; i++) {
			for (int j = 0; j<100; j++) {
				if (cor.giorni[i].spedizioni[j] != null) {
					this.ss.add(cor.giorni[i].spedizioni[j]);
				}
			}
		}
//		Collections.sort(ss, new SortEta());
		return ss;
	}

	public Collection<Spedizione> elencoSpedizioniCittaPerPriorita(String citta) {
//		for (int i = 0; i<spedizioni.length; i++) {
		for (int i = 0; spedizioni != null && i<spedizioni.length; i++) {
			this.sss.add(spedizioni[i]);
		}
//		Collections.sort(sss, new SortCorrNSpe());
		return sss;
	}
}

	