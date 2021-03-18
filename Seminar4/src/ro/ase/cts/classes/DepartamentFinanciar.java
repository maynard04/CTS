package ro.ase.cts.classes;

public class DepartamentFinanciar {
	private int nrAngajati;
	private String numeDirector;
	private double salariuDeBaza;
	
	private static DepartamentFinanciar departamentFinanciar = null;
	
	private DepartamentFinanciar(int nrAngajati, String numeDirector, double salariuDeBaza) {
		super();
		this.nrAngajati = nrAngajati;
		this.numeDirector = numeDirector;
		this.salariuDeBaza = salariuDeBaza;
	}
	
	public static synchronized DepartamentFinanciar getInstance(int nrAngajati, String numeDirector, double salariuDeBaza) {
		if(departamentFinanciar == null) {
			departamentFinanciar = new DepartamentFinanciar(nrAngajati, numeDirector, salariuDeBaza);
		}
		return departamentFinanciar;
	}

	@Override
	public String toString() {
		return "DepartamentFinanciar [nrAngajati=" + nrAngajati + ", numeDirector=" + numeDirector + ", salariuDeBaza="
				+ salariuDeBaza + "]";
	}

	public int getNrAngajati() {
		return nrAngajati;
	}

	public String getNumeDirector() {
		return numeDirector;
	}

	public double getSalariuDeBaza() {
		return salariuDeBaza;
	}
	
	
}
