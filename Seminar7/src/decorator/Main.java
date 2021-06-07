package decorator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CardAbstract card=new Card("Georgiana");
		card.realizeazaPlataNormala();
		card.realizeazaPlataOnline();
		
		DecoratorAbstract decorator=new DecoratorContactless(card);
		decorator.realizeazaPlataContactless();
		decorator.realizeazaPlataOnline();
		decorator.realizeazaPlataNormala();

	}

}
