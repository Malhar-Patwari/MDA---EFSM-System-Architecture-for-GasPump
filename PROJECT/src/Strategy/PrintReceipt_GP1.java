package Strategy;

import Data.*;

public class PrintReceipt_GP1 extends PrintReceiptAbstract {

	public PrintReceipt_GP1(DataStore ds) {
		super(ds);
	}
	
	@Override
	public void PrintReceipt() {
		DS_1 d = (DS_1) ds;	
		
		System.out.println("***************************RECEIPT************************");
		System.out.println("Unit Desposed:"+ d.get_G()+ "  Total Price:"+ d.get_total());
		System.out.println("**********************************************************");
	}

}
