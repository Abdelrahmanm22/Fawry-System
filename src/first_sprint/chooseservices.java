package first_sprint;

public class chooseservices {

	ClientCreator cc;
	public chooseservices(Client client) {
	
		cc = new ClientCreator(client);
		Services services = cc.fawryPayment("Internet");
	}

}
