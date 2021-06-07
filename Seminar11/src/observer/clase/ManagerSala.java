package observer.clase;

public class ManagerSala extends ManagerSalaAbstract {
	private String tipMeci;

	
	public ManagerSala() {
		super();
	}


	public ManagerSala(String tipMeci) {
		super();
		this.tipMeci = tipMeci;
	}
	
	
	public void anuntaMeci(String tipMeci) {
		super.trimiteNotificare("Incepe meciul de "+tipMeci);
	}

}
