package Strategy;

import Data.*;

public class ReturnCash_GP2 extends ReturnCashAbstract {

	public ReturnCash_GP2(DataStore ds) {
		super(ds);
	}
	
	@Override
	public void ReturnCash() {
		DS_2 d = (DS_2) ds;
		int m = d.get_M();
		
		if(m == 0)
		{
			float cash = d.get_cash();
			float total = d.get_total();
			System.out.println("***********************************************************");
			System.out.println("Return Cash:"+ (cash-total));
			System.out.println("***********************************************************");
		}
		else
		{//Because transaction is not by cash.
			System.out.println("NO Cash would be return by Gas Pump2");
		}
	}

}
