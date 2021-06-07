package sem6.prototype;

public class ContClient implements AbstractPrototype{

	private String nume;
	private int varsta;
	
	private ContClient() {
		super();
	}
	
	public ContClient(String nume, int varsta) {
		//aici realizam validari costisitoare
		super();
		this.nume = nume;
		this.varsta = varsta;
	}

	@Override
	public String toString() {
		return "ContClient [nume=" + nume + ", varsta=" + varsta + "]";
	}

	@Override
	public AbstractPrototype copiaza() {
		// TODO Auto-generated method stub
		ContClient client=new ContClient();
		client.nume=this.nume;
		client.varsta=this.varsta;
		return client;
		
	}


	
	
	

	
	
}
