package Strategy;

import Data.*;

public class GasPumpedMsg_GP1 extends GasPumpedMsgAbstract {

	public GasPumpedMsg_GP1(DataStore ds) {
		super(ds);
	}
	@Override
	public void GasPumpedMsg() {
		DS_1 d = (DS_1) ds;
		System.out.println("Ammount of Gas Disposed:" + d.get_G() + "  Total Price:" + d.get_total());
	}
}
