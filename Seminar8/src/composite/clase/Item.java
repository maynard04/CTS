package composite.clase;

public class Item implements ComponentaAbstracta{

	private String nume;
	

	public Item(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void afiseazaDescriere() {
		// TODO Auto-generated method stub
		System.out.println("Item: " + nume);
		
	}

	@Override
	public void adaugaComponenta(ComponentaAbstracta componentaAbstracta) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception();
		
	}

	@Override
	public void stergeComponenta(ComponentaAbstracta componentaAbstracta) {
		// TODO Auto-generated method stub
		throw new IllegalArgumentException();
	}

	@Override
	public ComponentaAbstracta getComponenta(int pozitie) {
		// TODO Auto-generated method stub
		throw new IllegalArgumentException();
	}
	
}
