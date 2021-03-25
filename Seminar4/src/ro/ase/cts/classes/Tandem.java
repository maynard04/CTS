package ro.ase.cts.classes;

public class Tandem {
	private int nrSasiu;
	private String model;
	private double pret;
	
	private static Tandem tandem = null;

	private Tandem(int nrSasiu, String model, double pret) {
		super();
		this.nrSasiu = nrSasiu;
		this.model = model;
		this.pret = pret;
	}
	
	public static synchronized Tandem getInstance(int nrSasiu, String model, double pret) {
		if(tandem == null) {
			tandem = new Tandem(nrSasiu, model, pret);
		}
		return tandem;
	}

	@Override
	public String toString() {
		return "Tandem [nrSasiu=" + nrSasiu + ", model=" + model + ", pret=" + pret + "]";
	}

	//
	public void setNrSerie(int nrSasiu) {
		this.nrSasiu = nrSasiu;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}

	
	
	
			
}
