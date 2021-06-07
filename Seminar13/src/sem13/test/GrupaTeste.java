package sem13.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import sem13.categorii.TesteGetPromovabilitate;
import sem13.categorii.TesteNormale;
import sem13.categorii.TesteUrgente;
import sem13.clase.Grupa;
import sem13.clase.Student;

public class GrupaTeste {
	
	private Grupa grupa;
	
	@Before
	public void Setup() {
		grupa=new Grupa(1077);
		for(int i=0;i<10;i++) {
			Student student1=new Student("Marcel");
			student1.adaugaNota(5);
			student1.adaugaNota(10);
			student1.adaugaNota(4);
			grupa.adaugaStudent(student1);
		}
	
	}
	
	@Test
	@Category({TesteGetPromovabilitate.class, TesteUrgente.class})
	public void testGetPromovabilitateRight() {
		Student studentMarcel=new Student("Marcel");
		studentMarcel.adaugaNota(10);
		studentMarcel.adaugaNota(10);
		Student studentMaria=new Student("Maria");
		studentMaria.adaugaNota(10);
		studentMaria.adaugaNota(10);
		grupa.adaugaStudent(studentMarcel);
		grupa.adaugaStudent(studentMaria);
		assertEquals(0.16, grupa.getPromovabilitate(),0.1);
		
	}
	
	@Test
	@Category({TesteGetPromovabilitate.class,TesteNormale.class})
	
	public void testGetPromovabilitateLowerBoundary() {
		assertEquals(0, grupa.getPromovabilitate(),0.1);
	}
	
	@Test
	@Category(TesteGetPromovabilitate.class)
	public void testGetPromovabilitateUpperBoundary() {
		Grupa grupaNoua=new Grupa(1076);
		Student student1=new Student("Ion");
		student1.adaugaNota(10);
		student1.adaugaNota(10);
		
		Student student2=new Student("Ana");
		student2.adaugaNota(10);
		student2.adaugaNota(10);
		grupaNoua.adaugaStudent(student1);
		grupaNoua.adaugaStudent(student2);
	}
	
	@Test(expected = IllegalArgumentException.class)
	@Category(TesteGetPromovabilitate.class)
	public void testGetPromovabilitateError() {
		Grupa grupaNoua=new Grupa(1080);
		grupaNoua.getPromovabilitate();
		
	}

	@Test
	@Category(TesteUrgente.class)
	public void testConstructorRight(){
		Grupa grupa=new Grupa(1077);
		assertEquals(1077, grupa.getNrGrupa());
	}
	
	@Test
	public void testLimitaInferioara() {
		Grupa grupa=new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}

	@Test
	public void testLimitaSuperioara() {
		Grupa grupa=new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorError() {
		int nrGrupa=100;
		Grupa grupa=new Grupa(nrGrupa);
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void testConstructorErrorMaiMare() {
		int nrGrupa=11001;
		Grupa grupa=new Grupa(nrGrupa);
	}
	
	@Test(timeout=500)
	public void testConstructorPerformance() {
		Grupa grupa=new Grupa(1077);
	}
	
	@Test
	@Category(TesteNormale.class)
	public void testConstructorExistence() {
		Grupa grupa=new Grupa(1077);
		assertNotNull(grupa.getStudenti());
	}
	
	@Test(timeout=500)
	@Category(TesteGetPromovabilitate.class)
	public void testGetPromovabilitatePerformance() {
		grupa.getPromovabilitate();
	}
	
	
	
	
	
}
