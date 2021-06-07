package sem6.builderv2;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RezervareBuilder builder = new RezervareBuilder().setCodRezervare(1).setAreBauturaRacoritoare(true);
		Rezervare rezervare = builder.build();
		builder.setCodRezervare(2).setAreMancareInclusa(true);
		Rezervare rezervare2= builder.build();
		System.out.println(rezervare.toString());
		System.out.println(rezervare2.toString());
		RezervareBuilder builder2 = new RezervareBuilder().setAreScaunErgonomic(true).setCodRezervare(3);
		Rezervare rezervare3 = builder2.build();
		System.out.println(rezervare3.toString());
	}

}
