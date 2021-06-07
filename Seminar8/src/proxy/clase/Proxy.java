package proxy.clase;

public class Proxy implements IOperatorRezervari{

	private OperatorRezervari operator;
	private int nrMinimPersoane;
	
	public Proxy(OperatorRezervari operator, int nrMinimPersoane) {
		super();
		this.operator = operator;
		this.nrMinimPersoane=nrMinimPersoane;
	}

	@Override
	public void realizeazaRezervare(int nrPersoane) {
		// TODO Auto-generated method stub
		if(nrPersoane>=nrMinimPersoane) {
			operator.realizeazaRezervare(nrPersoane);
		}
		else {
			System.out.println("Va rugam veniti la restaurant, fara rezervare");
		}
	}

}
