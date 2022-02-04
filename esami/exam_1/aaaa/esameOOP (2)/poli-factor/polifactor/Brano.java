package polifactor;

public class Brano {

	private int numeroPuntata;
	private String codiceConcorrente;
	private int voti;
	private String titolo;
	int n = numeroPuntata;

	public String getTitolo() {
		return titolo;
	}
	
	public Brano(int numeroPuntata, String codiceConcorrente, int voti,	String titolo) {
				this.numeroPuntata = numeroPuntata;
		// TODO Auto-generated constructor stub
				this.codiceConcorrente = codiceConcorrente;
				this.voti = voti;
				this.titolo = titolo;
	}

	public int getNumeroPuntata() {
		return numeroPuntata;
	}

	public void setNumeroPuntata(int numeroPuntata) {
		this.numeroPuntata = numeroPuntata;
	}

	public String getCodiceConcorrente() {
		return codiceConcorrente;
	}

	public void setCodiceConcorrente(String codiceConcorrente) {
		this.codiceConcorrente = codiceConcorrente;
	}

	public int getVoti() {
		return voti;
	}

	public void setVoti(int voti) {
		this.voti = voti;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
}
