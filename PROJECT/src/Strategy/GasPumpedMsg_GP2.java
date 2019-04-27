package Strategy;

import Data.*;

public class GasPumpedMsg_GP2 extends GasPumpedMsgAbstract {

	
	public GasPumpedMsg_GP2(DataStore ds) {
		super(ds);
	}
	
	@Override
	public void GasPumpedMsg() {
		DS_2 d = (DS_2) ds;
		System.out.println("Ammount of Gas Disposed:" + d.get_L()+ "  Total Price:" + d.get_total());
	}

}
