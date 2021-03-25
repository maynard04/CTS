package ro.ase.cts.simpleFactory;

public class Program {
	public static void main(String[] args) {
		try {
			FactoryPersonal factory = new FactoryPersonal();
			PersonalSpital personal1;
			PersonalSpital personal2;
			personal1 = factory.createPersonal(TipPersonal.Medic, "Ion", 1500);
			personal2 = factory.createPersonal(TipPersonal.Asistent, "Maria", 1000);
			System.out.println(personal1);
			System.out.println(personal2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
