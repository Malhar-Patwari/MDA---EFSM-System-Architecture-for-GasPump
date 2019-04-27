package Strategy;

import Data.*;

//Set Initial Values
public class SetInitialValues_GP2 extends SetInitialValuesAbstract {

	public SetInitialValues_GP2(DataStore ds) {
		super(ds);
	}
	@Override
	public void SetInitialValues() {
		DS_2 d = (DS_2) ds;
		
		if(d.get_M()==1){
			float price = d.get_price();
			price  = (float) (1.1*price);
			d.set_price(price);			
		}
		
		d.set_L(0);
		d.set_total(0);			
	}

}
