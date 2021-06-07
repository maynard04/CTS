package template.clase;

public class Spectator extends SpectatorAbstract {

	private String nume;
	
	public Spectator(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareCoada() {
		// TODO Auto-generated method stub
		System.out.println("Spectatorul "+nume+" s-a asezat la coada!");
	}

	@Override
	public void prezintaBilet() {
		// TODO Auto-generated method stub
		System.out.println("Spectatorul "+nume+" a prezentat biletul!");
	}

	@Override
	public void realizareControlCorporal() {
		// TODO Auto-generated method stub
		System.out.println("Spectatorul "+nume+" realizeaza control corporal!");
	}

	@Override
	public void intraPeStadion() {
		// TODO Auto-generated method stub
		System.out.println("Spectatorul "+nume+" intra pe stadion!");
	}

	@Override
	public void ocupaLoc() {
		// TODO Auto-generated method stub
		System.out.println("Spectatorul "+nume+" isi ocupa locul!");
	}

}
