package ro.ase.cts.main;

import ro.ase.cts.classes.DepartamentFinanciar;
import ro.ase.cts.classes.DepartamentFinanciarEager;

public class Main {
	public static void main(String[] args) {
		DepartamentFinanciarEager primulDepartamentFinanciarEager = DepartamentFinanciarEager.getInstance();
		DepartamentFinanciarEager alDoileaDepartamentFinanciarEager = DepartamentFinanciarEager.getInstance();
		
		
		System.out.println(primulDepartamentFinanciarEager.toString());
		System.out.println(alDoileaDepartamentFinanciarEager.toString());
		
		primulDepartamentFinanciarEager.setNumeDirector("Gigel");
		alDoileaDepartamentFinanciarEager.setNrAngajati(20);
		
		System.out.println(primulDepartamentFinanciarEager.toString());
		System.out.println(alDoileaDepartamentFinanciarEager.toString());
		
		DepartamentFinanciar primulDepartamentFinanciar = DepartamentFinanciar.getInstance(20, "Popescu", 2500);
		DepartamentFinanciar alDoileaDepartamentFinanciar = DepartamentFinanciar.getInstance(30, "Ionescu", 2700);
		
		System.out.println(primulDepartamentFinanciar.toString());
		System.out.println(alDoileaDepartamentFinanciar.toString());
	}
}
