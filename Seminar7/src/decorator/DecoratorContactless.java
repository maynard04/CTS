package decorator;

public class DecoratorContactless extends DecoratorAbstract {

	public DecoratorContactless(CardAbstract cardAbstract) {
		super(cardAbstract);
		// TODO Auto-generated constructor stub
	}

	public void realizeazaPlataContactless() {
		System.out.println(super.getDetinator()+" realizeaza plata contacless");
	}

}
