package adapterObiecte;

public class Main {
	//functie statica care sa simuleze aplicatia noastra
	public static void afiseazaCredit(Creditable credit) {
		credit.oferaCredit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leasing leasing=new Leasing("Popescu");
		LeasingAdapter adapter=new LeasingAdapter(leasing);
		afiseazaCredit(adapter);

	}

}
