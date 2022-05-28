package polifactor;

public class Cover extends Brano {

	private int anno;

	public int getAnno() {
		return anno;
	}

	public Cover(int numeroPuntata, String codiceConcorrente, int voti,	String titolo, int anno) {
		super(numeroPuntata, codiceConcorrente, voti, titolo);
		// TODO Auto-generated constructor stub
		this.anno = anno;
	}
	
}
