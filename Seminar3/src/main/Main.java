package main;

import clase.DepartamentFinanciar;
import clase.DepartamentFinanciarEager;
import clase.Geaca;

public class Main {
	public static void main(String[] args) {
		DepartamentFinanciarEager departament1=DepartamentFinanciarEager.getInstance();
		DepartamentFinanciarEager departament2=DepartamentFinanciarEager.getInstance();
	    
	    departament1.setDirector("Gigel");
	    departament2.setNrAngajati(20);
	    
	    System.out.println(departament1.toString());
        System.out.println(departament2.toString());
        
        DepartamentFinanciar dpt1=DepartamentFinanciar.getInstance(15, "Maria", 2500);
        DepartamentFinanciar dpt2=DepartamentFinanciar.getInstance(20, "Ionescu", 4000);
	    
        System.out.println(dpt1.toString());
        System.out.println(dpt2.toString());
        
        Geaca geaca1=Geaca.getInstance("albastra", 32, 45);
        Geaca geaca2=Geaca.getInstance("rosie", 36, 20);
        
        System.out.println(geaca1.toString());
        System.out.println(geaca2.toString());
        
        
	}

}
