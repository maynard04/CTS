package facade.program;

import facade.clase.Facade;
import facade.clase.Masa;

public class Main {

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		
//		GestionarMese gestionar=new GestionarMese();
//		Piccolo piccolo=new Piccolo();
//		Masa masa=new Masa(12,4);
//		
//		if(gestionar.esteMasaLibera(masa.getCodMasa())) {
//			if(piccolo.esteMasaDebarasata(masa.getCodMasa())) {
//				if(piccolo.areMasaServetele(masa.getCodMasa())) {
//					System.out.println("Poftiti la masa cu codul "+masa.getCodMasa());
//				}
//				else System.out.println("Mai asteptati");
//			}
//			else System.out.println("Mai asteptati");
//		}
//		else System.out.println("Mai asteptati");
		
		Masa masa=new Masa(5,10);
		if(Facade.potAsezaLaMasa(masa)) {
			System.out.println("Poftiti la masa");
		}
		else {
			System.out.println("Mai asteptati");
		}
	}

}
