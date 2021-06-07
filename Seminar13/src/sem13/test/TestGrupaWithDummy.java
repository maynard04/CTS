package sem13.test;

import static org.junit.Assert.*;

import org.junit.Test;

import sem13.clase.Grupa;
import sem13.clase.IStudent;
import sem13.dubluri.StudentDummy;

public class TestGrupaWithDummy {

	@Test
	public void test() {
		IStudent student=new StudentDummy();
		Grupa grupa=new Grupa(1076);
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getStudenti().size());
		
	}

}
