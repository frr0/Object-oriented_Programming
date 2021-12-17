package serviziospedizioni;

import java.util.Comparator;

public class SortCorrNSpe implements Comparator<Corriere>{
	public int compare(Corriere a, Corriere b) { 
		return b.spedizioni.length - a.spedizioni.length;

	}

}