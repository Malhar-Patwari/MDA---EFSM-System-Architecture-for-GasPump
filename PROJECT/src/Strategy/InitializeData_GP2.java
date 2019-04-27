package Strategy;

import Data.*;

public class InitializeData_GP2 extends InitializeDataAbstract {

	
	public InitializeData_GP2(DataStore ds) {
		super(ds);
	}
	@Override
	public void InitializeData() {

		DS_2 d = (DS_2) ds;		
		d.set_price(0);
		d.set_cash(0);
		System.out.println("Data has been initialized for GasPump 2");
		
	}

}
