package ro.ase.cts.classes;

public class DepartamentFinanciarEager {
	private int nrAngajati;
	private String numeDirector;
	private double salariuDeBaza;
	
	private static DepartamentFinanciarEager departamentFinanciarEager =
			new DepartamentFinanciarEager(10, "Popescu", 3000);
	
	private DepartamentFinanciarEager(int nrAngajati, String numeDirector, double salariuDeBaza) {
		super();
		this.nrAngajati = nrAngajati;
		this.numeDirector = numeDirector;
		this.salariuDeBaza = salariuDeBaza;
	}
	
	public static DepartamentFinanciarEager getInstance() {
		return departamentFinanciarEager;
	}

	@Override
	public String toString() {
		return "DepartamentFinanciarEager [nrAngajati=" + nrAngajati + ", numeDirector=" + numeDirector
				+ ", salariuDeBaza=" + salariuDeBaza + "]";
	}

	public void setNrAngajati(int nrAngajati) {
		this.nrAngajati = nrAngajati;
	}

	public void setNumeDirector(String numeDirector) {
		this.numeDirector = numeDirector;
	}

	public void setSalariuDeBaza(double salariuDeBaza) {
		this.salariuDeBaza = salariuDeBaza;
	}
	
	
}
