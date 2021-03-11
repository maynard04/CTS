package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.classes.Aplicant;
import ro.ase.cts.classes.Elev;

public abstract class ElevReader extends AplicantReader {
	public ElevReader(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	public List<Aplicant> readPupil() throws FileNotFoundException {
		Scanner input2 = new Scanner(super.numeFisier);
		input2.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (input2.hasNext()) {
			Elev elev = new Elev();
			super.readAplicant(input2, elev);
			int clasa = input2.nextInt();
			String tutore = input2.next();
			elev.setClasa(clasa);
			elev.setTutore(tutore);
			elevi.add(elev);
			
		}

		input2.close();
		return elevi;
	}
}
