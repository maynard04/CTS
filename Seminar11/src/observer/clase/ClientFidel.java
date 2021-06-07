package observer.clase;

public class ClientFidel implements Observer {
	
	private String nume;
	

	public ClientFidel(String nume) {
		super();
		this.nume = nume;
	}


	@Override
	public void primesteMesaj(String mesaj) {
		System.out.println(nume+" a primit mesajul: "+ mesaj);
		
	}



}
