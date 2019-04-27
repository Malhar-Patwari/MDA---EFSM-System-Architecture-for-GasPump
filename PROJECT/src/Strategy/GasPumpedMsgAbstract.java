package Strategy;

import Data.*;

public abstract class GasPumpedMsgAbstract {

	DataStore ds;
	public GasPumpedMsgAbstract(DataStore ds){
		this.ds = ds;
	}
	public abstract void GasPumpedMsg();
}
