package Strategy;

import Data.*;

public class PumpGasUnit_GP1 extends PumpGasUnitAbstract {

	public PumpGasUnit_GP1(DataStore ds) {
		super(ds);
	}
	
	@Override
	public void PumpGasUnit() {
	
		DS_1 d = (DS_1) ds;	
		System.out.println("Unit of gas has been disposed");
		int g = d.get_G();
		float p = d.get_price();
		g +=1;						
		float total = p*g;
		d.set_G(g);
		d.set_total(total);
	}

}
