package Strategy;

import Data.*;

public abstract class StorePinAbstract {

	DataStore ds;
	public StorePinAbstract(DataStore ds){
		this.ds = ds;
	}
	public abstract void StorePin();
}
