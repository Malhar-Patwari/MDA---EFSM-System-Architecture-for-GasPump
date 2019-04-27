package Strategy;

import Data.*;

public abstract class ReturnCashAbstract {

	DataStore ds;
	public ReturnCashAbstract(DataStore ds){
		this.ds = ds;
	}
	
	public abstract void ReturnCash();
}
