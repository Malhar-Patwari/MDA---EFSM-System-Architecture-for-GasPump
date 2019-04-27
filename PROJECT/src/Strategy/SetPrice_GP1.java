package Strategy;

import Data.*;

public class SetPrice_GP1 extends SetPriceAbstract {

	public SetPrice_GP1(DataStore ds) {
		super(ds);
	}
	
	@Override
	public void SetPrice(int g) {
		DS_1 d = (DS_1) ds;
		
		if(g == 1){
			float rprice = d.get_RPrice();
			d.set_price(rprice);
			
		}
		else if(g == 2){
			//GasPump1 has no Super Support.
		}
		else if(g == 3){
			//GasPump1 has no Premium Support.
		}
		else if(g == 4){
			float dprice = d.get_DPrice();
			d.set_price(dprice);							
		}
		else
		{
			System.out.println("Invalid Gas Type Choosen");
		}

	}

}
