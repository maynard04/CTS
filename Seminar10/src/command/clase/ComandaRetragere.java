package command.clase;

public class ComandaRetragere extends Comanda{

	public ComandaRetragere(ContBancar contBancar, float suma) {
		super(contBancar, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		super.contBancar.retragere(super.suma);
		
	}

}
