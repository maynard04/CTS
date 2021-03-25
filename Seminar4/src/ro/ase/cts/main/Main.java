package ro.ase.cts.main;

import ro.ase.cts.classes.DepartamentFinanciar;
import ro.ase.cts.classes.DepartamentFinanciarEager;
import ro.ase.cts.classes.Tandem;

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
		
		Tandem tandem1 = Tandem.getInstance(5001, "Velo Basic", 1500);
		Tandem tandem2 = Tandem.getInstance(6002, "Velo Extra", 2000);
		
		System.out.println("-----------------");
		System.out.println(tandem1.toString());
		System.out.println(tandem2.toString());
	}
}
