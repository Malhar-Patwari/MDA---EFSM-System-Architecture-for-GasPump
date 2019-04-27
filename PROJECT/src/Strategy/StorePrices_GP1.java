package Strategy;

import Data.*;

public class StorePrices_GP1 extends StorePricesAbstract {
	
	public StorePrices_GP1(DataStore ds) {
		super(ds);
	}

	@Override
	public void StorePrice() {
		DS_1 d = (DS_1) ds;
		float temp_a = d.get_temp_a();
		float temp_b = d.get_temp_b();
		d.set_RPrice(temp_a);
		d.set_DPrice(temp_b);
	}
}
