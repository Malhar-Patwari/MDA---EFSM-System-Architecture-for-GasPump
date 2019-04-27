package Strategy;

import Data.*;

public class StoreCash_GP2 extends StoreCashAbstract {

	public StoreCash_GP2(DataStore ds) {
		super(ds);
	}

	@Override
	public void StoreCash() {
		DS_2 d = (DS_2) ds;
		float temp = d.get_temp_cash();
		d.set_cash(temp);

		System.out.println("---------------------Cash Has Been Stored------------------------------");
	}

}
