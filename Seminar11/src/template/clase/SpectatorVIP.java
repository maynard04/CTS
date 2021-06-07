package template.clase;

public class SpectatorVIP extends SpectatorAbstract {

	public String nume;
	
	public SpectatorVIP(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareCoada() {
		// TODO Auto-generated method stub
		System.out.println("Spectatorul VIP "+nume+" se prezinta la poarta");
	}

	@Override
	public void prezintaBilet() {
		// TODO Auto-generated method stub
		System.out.println("Spectatorul VIP "+nume+" prezinta biletul");
	}

	@Override
	public void realizareControlCorporal() {
		// TODO Auto-generated method stub
		System.out.println("Spectatorul VIP "+nume+" realizeaza control corporal");
	}

	@Override
	public void intraPeStadion() {
		// TODO Auto-generated method stub
		System.out.println("Spectatorul VIP "+nume+" intra in tribuna VIP");
	}

	@Override
	public void ocupaLoc() {
		// TODO Auto-generated method stub
		System.out.println("Spectatorul VIP "+nume+" ocupa locul in tribuna VIP");
	}

}
