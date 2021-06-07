package chainofresponsability.program;

import chainofresponsability.clase.ContCredit;
import chainofresponsability.clase.ContCurent;
import chainofresponsability.clase.ContEconomii;
import chainofresponsability.clase.Handler;
import chainofresponsability.clase.RefuzaTranzactia;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Handler contCredit=new ContCredit(5000);
		Handler contCurent=new ContCurent(2000);
		Handler contEconomii=new ContEconomii(2100);
		Handler refuzaTranzactia=new RefuzaTranzactia();
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(refuzaTranzactia);
		
		contCurent.realizeazaPlata(7000);
	}

}
