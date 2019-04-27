package Strategy;

import Data.*;

public class SetM_GP2 extends SetMAbstract {

	
	public SetM_GP2(DataStore ds) {
		super(ds);
	}
	
	@Override
	public void SetM() {		
		DS_2 d = (DS_2) ds;
		int temp_m = d.get_temp_M();
		d.set_M(temp_m);		
	}

}
