package Strategy;

import Data.*;

public abstract class StoreCashAbstract {

	DataStore ds;
	public StoreCashAbstract(DataStore ds){
		this.ds = ds;
	}
	public abstract void StoreCash();
}
