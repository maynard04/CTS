package sem6.prototype;

public class Bilet implements AbstractPrototype{
	private int codBilet;
	private String echipaA;
	private String echipaB;
	private String data;
	private String loc;
	
	
	
	public Bilet() {
		super();
	}

	public Bilet(int codBilet, String echipaA, String echipaB, String data, String loc) 
	{
		super();
		this.codBilet = codBilet;
		this.echipaA = echipaA;
		this.echipaB = echipaB;
		this.data = data;
		this.loc = loc;
	}

	public void setCodBilet(int codBilet) {
		this.codBilet = codBilet;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Bilet [codBilet=" + codBilet + ", echipaA=" + echipaA + ", echipaB=" + echipaB + ", data=" + data
				+ ", loc=" + loc + "]";
	}

	@Override
	public AbstractPrototype copiaza() {
		// TODO Auto-generated method stub
		Bilet bilet=new Bilet();
		bilet.codBilet=this.codBilet;
		bilet.echipaA=this.echipaA;
		bilet.echipaB=this.echipaB;
		bilet.data=this.data;
		bilet.loc=this.loc;
		return bilet;
		
	}
	
	
	
	
	

}
