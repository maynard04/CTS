package command.clase;

public class ComandaConstituire extends Comanda {

	public ComandaConstituire(ContBancar contBancar, float suma) {
		super(contBancar, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
	     super.contBancar.constituire(super.suma);
		
	}

}
