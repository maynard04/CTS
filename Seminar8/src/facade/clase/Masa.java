package facade.clase;

public class Masa {

	private int codMasa;
	private int nrMaximPersoane;
	
	public Masa(int codMasa, int nrMaximPersoane) {
		super();
		this.codMasa = codMasa;
		this.nrMaximPersoane = nrMaximPersoane;
	}
	public int getCodMasa() {
		return codMasa;
	}
	public int getNrMaximPersoane() {
		return nrMaximPersoane;
	}
	@Override
	public String toString() {
		return "Masa [codMasa=" + codMasa + ", nrMaximPersoane=" + nrMaximPersoane + "]";
	}
	
	
}
