package sem12.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sem12.clase.Student;

public class StudentTests {
	Student student=null;
	
	@Before
	public void setup() {
		student=new Student();
	}

	@Test
	public void testApelConstructorCuParametru() {
		String nume="Ion";
		Student student=new Student(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testApelConstructorFaraParametru() {
		String nume="Student";
		Student student=new Student();
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testInitializareListaConstructorFaraParametru() {
		//Student student=new Student();
		assertNotNull(student.getNote());
	}
	
	@Test
	public void testAdaugareNotaInLista() {
		//Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testMarimeListaCorecta() {
		//Student student=new Student();
		int nota=10;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testSetareNume() {
		//Student student=new Student();
		String nume="Popescu";
		student.setNume(nume);
		assertEquals(nume, student.getNume());
		
	}
	
	@Test
	public void testCalculareMedie() {
		student.adaugaNota(7);
		student.adaugaNota(8);
		assertEquals(7.5, student.calculeazaMedie(),0.01);
	}
	
	@Test
	public void testCalculareMedieFaraNote() {
		assertEquals(0, student.calculeazaMedie(), 0.01);
	}

	@Test
	public void testCalculareMedieFaraNota() {
		int nota=9;
		student.adaugaNota(nota);
		assertEquals(nota, student.calculeazaMedie(),0.01);
		
	}
	
	@Test
	public void testVerificareRestante() {
		int nota=4;
		int nota2=10;
		student.adaugaNota(nota);
		student.adaugaNota(nota2);
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testVerificareAreRestante() {
		int nota=9;
		int nota2=10;
		student.adaugaNota(nota);
		student.adaugaNota(nota2);
		assertFalse(student.areRestante());
	}
	
	@Test
	public void testareVerificareRestanteFaraNote() {
		assertFalse(student.areRestante());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testAruncareExceptie() {
		int index=-1;
		student.getNota(index);
		
	}
	
	@Test
	public void testgetNotaShouldThrowException() {
		//1
		try {
			//2
			student.getNota(-1);
			//3
			fail("Nu trebuia sa ajunga aici");
		}catch(IndexOutOfBoundsException err) {
		//4
		}
		//5
	}
	

	
}
