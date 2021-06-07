package template.program;

import template.clase.Spectator;
import template.clase.SpectatorAbstract;
import template.clase.SpectatorVIP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Spectator s1=new Spectator("Maricel");
		SpectatorAbstract s2=new Spectator("Gigel");
		s1.intrareSpectatorStadion();
		s2.intrareSpectatorStadion();
		
		SpectatorAbstract s3=new SpectatorVIP("Ionel");
		s3.intrareSpectatorStadion();
	}

}
