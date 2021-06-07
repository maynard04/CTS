package composite.program;

import composite.clase.Item;
import composite.clase.Sectiune;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sectiune sectiuneBauturi=new Sectiune("Bauturi");
		Sectiune sectiuneDesert=new Sectiune("Desert");
		Item itemFrappe=new Item("Frappe");
		Item itemCafea=new Item("Cafea");
		Item itemEcler=new Item("Ecler");
		
		sectiuneBauturi.adaugaComponenta(itemCafea);
		sectiuneBauturi.adaugaComponenta(itemFrappe);
		sectiuneDesert.adaugaComponenta(itemEcler);
		
		Sectiune meniu=new Sectiune("Meniu");
		meniu.adaugaComponenta(sectiuneDesert);
		meniu.adaugaComponenta(sectiuneBauturi);
		
		meniu.afiseazaDescriere();
		
		sectiuneBauturi.stergeComponenta(itemFrappe);
		sectiuneDesert.adaugaComponenta(itemFrappe);
		
		meniu.afiseazaDescriere();

	}

}
