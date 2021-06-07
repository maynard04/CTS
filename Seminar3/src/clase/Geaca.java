package clase;

public class Geaca {

	private String culoare;
	private int marime;
	private double pret;
	
	private static Geaca geaca=null;
	
	
	private Geaca(String culoare, int marime, double pret) {
		this.culoare = culoare;
		this.marime = marime;
		this.pret = pret;
	}
	
	public static synchronized Geaca getInstance(String culoare, int marime, double pret) 
	{
		if(geaca==null) {
			geaca=new Geaca(culoare, marime, pret);
		}
		return geaca;
		
	}

	@Override
	public String toString() {
		return "Geaca [culoare=" + culoare + ", marime=" + marime + ", pret=" + pret + "]";
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}

	public void setMarime(int marime) {
		this.marime = marime;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}
	
	
	
}
