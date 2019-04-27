package Strategy;

import Data.*;

public class InitializeData_GP1 extends InitializeDataAbstract {

	public InitializeData_GP1(DataStore ds) {
		super(ds);
	}
	@Override
	public void InitializeData() {
	
		DS_1 d = (DS_1) ds;		
		d.set_price(0);
		d.set_cash(0);
		System.out.println("Data has been Initialized for Gaspump 1");
	}

}
