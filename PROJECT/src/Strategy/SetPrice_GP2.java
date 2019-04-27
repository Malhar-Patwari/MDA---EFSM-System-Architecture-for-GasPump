package Strategy;

import Data.*;

public class SetPrice_GP2 extends SetPriceAbstract {

	public SetPrice_GP2(DataStore ds) {
		super(ds);
	}
	@Override
	public void SetPrice(int g) {
		DS_2 d = (DS_2) ds;
		
		if(g == 1){			
			float rprice = d.get_RPrice();
			d.set_price(rprice);			
		}
		else if(g == 2){
			float sprice = d.get_SPrice();
			d.set_price(sprice);			
		}
		else if(g == 3){
			float pprice = d.get_PPrice();
			d.set_price(pprice);			
		}
		else if(g == 4){
			//Gaspump2 has no Diesel support.			
		}
		else
		{
			System.out.println("Invalid Gas Type Choosen");
		}
				

	}

}
