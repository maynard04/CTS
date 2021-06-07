package sem6.prototype;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContClient client=new ContClient("Ion",40);
		ContClient client2=(ContClient) client.copiaza();
		System.out.println(client);
		System.out.println(client2);
		
		Bilet bilet=new Bilet(1,"Barcelona","Arsenal","12.04.2021","1");
		Bilet bilet2=new Bilet(2,"Steaua","Dinamo","13.04.2021","2");
		
		Bilet bilet3=(Bilet) bilet.copiaza();
		bilet3.setCodBilet(3);
		bilet3.setLoc("3");
		
		Bilet bilet4=(Bilet) bilet.copiaza();
		bilet4.setCodBilet(4);
		bilet4.setLoc("4");

		System.out.println(bilet3);
		System.out.println(bilet4);
		

	}

}
