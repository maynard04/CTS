package proxy.program;

import proxy.clase.OperatorRezervari;
import proxy.clase.Proxy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatorRezervari operator=new OperatorRezervari();
		operator.realizeazaRezervare(2);
		Proxy proxy=new Proxy(operator,4);
		proxy.realizeazaRezervare(2);
	
		
	}

}
