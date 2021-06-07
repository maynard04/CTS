package adapterObiecte;

public class LeasingAdapter implements Creditable {

	private Leasing leasing;
	
	public LeasingAdapter(Leasing leasing) {
		super();
		this.leasing = leasing;
	}

	@Override
	public void oferaCredit() {
		// TODO Auto-generated method stub
		this.leasing.oferaLeasing();
	}

}
