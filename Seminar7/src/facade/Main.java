package facade;

public class Main {

	public static void main(String[] args) {
		Persoana persoana=new Persoana("Gigel","2990512596309");
		if(persoana.getVarsta()>=18) {
			if(!Politie.esteUrmarit(persoana)) {
				if(!BirouCredite.areCredite(persoana)) {
					System.out.println("I se ofera creditul lui "+persoana.getNume());
				}
			}
		}
		Persoana persoana2=new Persoana("Maria","2920141682548");
		if(Facade.esteAptaPentruCredit(persoana2)) {
			System.out.println("I se ofera creditul lui "+persoana2.getNume());
			
		}
		else {
			System.out.println("Nu i se ofera creditul lui "+persoana2.getNume());
		}

	}

}
