package Strategy;

import Data.*;

public class StorePin_GP1 extends StorePinAbstract {

	public StorePin_GP1(DataStore ds) {
		super(ds);
	}

	@Override
	public void StorePin() {
		
		DS_1 d =(DS_1) ds;
	 
		String temp_p = d.get_temp_p();
		d.set_pin(temp_p);
		System.out.println("---------------------------Pin has been stored------------------------");
	}

}
