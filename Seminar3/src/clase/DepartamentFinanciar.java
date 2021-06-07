package clase;

public class DepartamentFinanciar {

	private int nrAngajati;
	private String director;
	private double salariuBaza;
	
	private static DepartamentFinanciar departament=null;
	
	private DepartamentFinanciar(int nrAngajati, String director, double salariuBaza) 
	{
		super();
		this.nrAngajati = nrAngajati;
		this.director = director;
		this.salariuBaza = salariuBaza;
	}
	
	public static synchronized DepartamentFinanciar getInstance(int nrAngajati, String director, double salariuBaza) 
	{
		if(departament==null) {
			departament=new DepartamentFinanciar(nrAngajati, director, salariuBaza);
		}
		return departament;
		
	}

	@Override
	public String toString() {
		return "DepartamentFinanciar [nrAngajati=" + nrAngajati + ", director=" + director + ", salariuBaza="
				+ salariuBaza + "]";
	}

	public void setNrAngajati(int nrAngajati) {
		this.nrAngajati = nrAngajati;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setSalariuBaza(double salariuBaza) {
		this.salariuBaza = salariuBaza;
	}
	

}
