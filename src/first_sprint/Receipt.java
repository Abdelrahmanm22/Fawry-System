package first_sprint;

import java.util.ArrayList;
import java.util.Scanner;

public class Receipt extends Field_decorator{
	public Receipt(Service_provider sp) {
		super(sp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<String> get_answer() {
		ArrayList<String>pn=sp.get_answer();
		if(pn==null) {
			
			pn=new ArrayList<String>();
		}
		System.out.println("Choose Your Receipt (Monthly receipt) or (Quarter receipt): ");
		Scanner input=new Scanner(System.in);
		pn.add(input.nextLine());
		return pn;
	}
}
