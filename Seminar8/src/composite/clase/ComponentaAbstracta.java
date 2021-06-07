package composite.clase;

public interface ComponentaAbstracta {

	public void afiseazaDescriere();
	public void adaugaComponenta(ComponentaAbstracta componentaAbstracta) throws Exception;
	public void stergeComponenta(ComponentaAbstracta componentaAbstracta);
	public ComponentaAbstracta getComponenta(int pozitie);
}
