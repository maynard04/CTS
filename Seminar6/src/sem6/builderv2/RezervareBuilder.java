package sem6.builderv2;


public class RezervareBuilder implements AbstractBuilder {
	private int codRezervare;
	private boolean areMancareInclusa;
	private boolean areScaunErgonomic;
	private boolean areBauturaRacoritoare;
	private boolean areMuzicaAmbientalaPersonalizate;
	private String genMuzica;
	
	public RezervareBuilder setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}
	public RezervareBuilder setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
		return this;
	}
	public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
		return this;
	}
	public RezervareBuilder setAreBauturaRacoritoare(boolean areBauturaRacoritoare) {
		this.areBauturaRacoritoare = areBauturaRacoritoare;
		return this;
	}
	public RezervareBuilder setAreMuzicaAmbientalaPersonalizate(boolean areMuzicaAmbientalaPersonalizate) {
		this.areMuzicaAmbientalaPersonalizate = areMuzicaAmbientalaPersonalizate;
		return this;
	}
	public RezervareBuilder setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}
	@Override
	public Rezervare build() {
	    Rezervare rezervare = new Rezervare(codRezervare, areMancareInclusa, areScaunErgonomic, areBauturaRacoritoare, areMuzicaAmbientalaPersonalizate, genMuzica);
		return rezervare;
	}

}
