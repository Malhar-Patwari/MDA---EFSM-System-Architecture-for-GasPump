package Strategy;

import Data.*;
	
public class StorePrices_GP2 extends StorePricesAbstract {

	
	public StorePrices_GP2(DataStore ds) {
		super(ds);
	}

	@Override
	public void StorePrice() {
		
		DS_2 d = (DS_2) ds;
		float temp_a = d.get_temp_a();
		float temp_b = d.get_temp_b();
		float temp_c = d.get_temp_c();
		d.set_RPrice(temp_a);
		d.set_SPrice(temp_b);
		d.set_PPrice(temp_c);
				
	}

}
