package serviziospedizioni;

import java.util.Comparator;

public class sortEta implements Comparator<Corriere>{
//class SortEta  implements Comparator<Corriere>{
	public int compare(Corriere a, Corriere b) { 
		return b.getEta() - a.getEta();
	}
//}

}
