package Strategy;

import Data.*;
public class ReturnCash_GP1 extends ReturnCashAbstract {

	public ReturnCash_GP1(DataStore ds) {
		super(ds);
	}

	@Override
	public void ReturnCash() {
		// Cash transaction is not provided by GasPump1. So Returning Cash would be 0.

	}

}
