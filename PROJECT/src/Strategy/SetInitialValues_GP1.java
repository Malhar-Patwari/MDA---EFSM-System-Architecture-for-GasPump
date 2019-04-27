package Strategy;

import Data.*;

// Set Initial Values
public class SetInitialValues_GP1 extends SetInitialValuesAbstract {

	public SetInitialValues_GP1(DataStore ds) {
		super(ds);
	}
	@Override
	public void SetInitialValues() {
		DS_1 d = (DS_1) ds;	
		d.set_G(0);
		d.set_total(0);		
	}

}
