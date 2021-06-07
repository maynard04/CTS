package adapterClase;


public class Main {
	public static void afiseazaCredit(Creditable credit) {
		credit.oferaCredit();
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		LeasingAdapterClass adapter=new LeasingAdapterClass("Marcel");
		afiseazaCredit(adapter);

	}

}
