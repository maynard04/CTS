package sem13.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import sem13.categorii.TesteGetPromovabilitate;
import sem13.clase.Grupa;
import sem13.clase.IStudent;
import sem13.dubluri.StudentFake;

public class TestGrupaWithFake {

	@Test
	@Category(TesteGetPromovabilitate.class)
	public void testPromovabilitateRight() {
		Grupa grupa=new Grupa(1076);
		for(int i=0;i<8;i++) {
			StudentFake sf=new StudentFake();
			sf.setValoareAreRestante(false);
			grupa.adaugaStudent(sf);
			

		}
		for(int i=0;i<2;i++) {
			StudentFake sf=new StudentFake();
			sf.setValoareAreRestante(true);
			grupa.adaugaStudent(sf);
		}
	assertEquals(0.8,grupa.getPromovabilitate(),0.01);
	
	}

}
