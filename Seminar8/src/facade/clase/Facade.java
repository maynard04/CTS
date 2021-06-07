package facade.clase;

public class Facade {

	public static boolean potAsezaLaMasa(Masa masa) {

		GestionarMese gestionar=new GestionarMese();
		Piccolo piccolo=new Piccolo();
		
		if(gestionar.esteMasaLibera(masa.getCodMasa())) {
			if(piccolo.esteMasaDebarasata(masa.getCodMasa())) {
				if(piccolo.areMasaServetele(masa.getCodMasa())) {
					return true;
				}
				
			}
		
		}
		return false;
	}
}
