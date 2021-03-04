package ro.ase.cts.program;
import java.io.FileNotFoundException;
import java.util.List;
import ro.ase.cts.classes.Angajat;
import ro.ase.cts.classes.Aplicant;
import ro.ase.cts.readers.AngajatReader;
import ro.ase.cts.readers.AplicantReader;
import ro.ase.cts.readers.StudentReader;

public class Program {
	
	public static List<Aplicant> readAplicant(String fisier, AplicantReader reader) throws NumberFormatException, FileNotFoundException {
		return reader.readAplicants(fisier);
	}

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			listaAngajati = readAplicant("studenti.txt", new AplicantReader());
			for(Aplicant aplicant:listaAngajati)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}