package Strategy;

import Data.*;

public class PrintReceipt_GP2 extends PrintReceiptAbstract {

	public PrintReceipt_GP2(DataStore ds) {
		super(ds);
	}
	
	@Override
	public void PrintReceipt() {
		// TODO Auto-generated method stub

		DS_2 d = (DS_2) ds;
		
		System.out.println("***************************RECEIPT************************");
		System.out.println("Unit Desposed:"+ d.get_L()+ "  Total Price:"+ d.get_total());
		System.out.println("**********************************************************");
	}

}
