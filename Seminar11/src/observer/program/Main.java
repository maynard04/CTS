package observer.program;

import observer.clase.ClientFidel;
import observer.clase.ManagerSala;

public class Main {

	public static void main(String[] args) {
		ClientFidel c1=new ClientFidel("Gigel");
		ClientFidel c2=new ClientFidel("Cornel");
		ClientFidel c3=new ClientFidel("Marcel");
		ClientFidel c4=new ClientFidel("Viorica");
		
		ManagerSala manager=new ManagerSala();
		manager.adaugaAbonat(c1);
		manager.adaugaAbonat(c2);
		manager.adaugaAbonat(c3);
		manager.adaugaAbonat(c4);
		manager.anuntaMeci("fotbal");
		
		manager.stergeAbonat(c1);
		manager.anuntaMeci("handbal");
	}

}
