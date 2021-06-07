package command.program;

import command.clase.ComandaConstituire;
import command.clase.ComandaDepunere;
import command.clase.ComandaRetragere;
import command.clase.ContBancar;
import command.clase.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ManagerComenzi managerComenzi=new ManagerComenzi();
	ContBancar contBancar=new ContBancar("Georgiana", 0);
	managerComenzi.invoca(new ComandaConstituire(contBancar,1000));
	managerComenzi.invoca(new ComandaDepunere(contBancar,200));
	managerComenzi.executaComanda();
	
	managerComenzi.invoca(new ComandaRetragere(contBancar, 500));
	managerComenzi.executaComanda();
	managerComenzi.executaComanda();
	}

}
