package Strategy;

import Data.*;

public class PumpGasUnit_GP2 extends PumpGasUnitAbstract {

	public PumpGasUnit_GP2(DataStore ds) {
		super(ds);
	}

	//Calculate the total price from amount of gas disposed and actual gas price.
	@Override
	public void PumpGasUnit() {


		DS_2 d = (DS_2) ds;
		System.out.println("One Unit of gas has been disposed");
		int l = d.get_L();		
		float price = d.get_price();		
		l +=1;
		float total = price*l;
		d.set_L(l);
		d.set_total(total);

	}
	
}
