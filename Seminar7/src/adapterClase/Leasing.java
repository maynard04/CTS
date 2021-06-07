package adapterClase;

public class Leasing {
	String nume;
	
	
	
	public Leasing(String nume) {
		super();
		this.nume = nume;
	}



	public void oferaLeasing() {
		System.out.println("I se ofera un leasing lui "+nume);
	}
}
