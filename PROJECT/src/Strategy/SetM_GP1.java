package Strategy;

import Data.*;
	
public class SetM_GP1 extends SetMAbstract {

	public SetM_GP1(DataStore ds) {
		super(ds);
	}
	@Override
	public void SetM() {
		DS_1 d = (DS_1) ds;
		int temp_m = d.get_temp_M();
		d.set_M(temp_m);		
	}

}
