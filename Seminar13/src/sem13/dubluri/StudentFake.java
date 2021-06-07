package sem13.dubluri;

import java.util.List;

import sem13.clase.IStudent;

public class StudentFake implements IStudent {

	private String valoareGetNume;
	private float valoareGetMedie;
	private int valoareGetNota;
	private boolean valoareAreRestante;
	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return this.valoareGetNume;
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		// TODO Auto-generated method stub
		return this.valoareGetMedie;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return this.valoareGetNota;
	}

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return this.valoareAreRestante;
	}

	public void setValoareGetNume(String valoareGetNume) {
		this.valoareGetNume = valoareGetNume;
	}

	public void setValoareGetMedie(float valoareGetMedie) {
		this.valoareGetMedie = valoareGetMedie;
	}

	public void setValoareGetNota(int valoareGetNota) {
		this.valoareGetNota = valoareGetNota;
	}

	public void setValoareAreRestante(boolean valoareAreRestante) {
		this.valoareAreRestante = valoareAreRestante;
	}
	

}
