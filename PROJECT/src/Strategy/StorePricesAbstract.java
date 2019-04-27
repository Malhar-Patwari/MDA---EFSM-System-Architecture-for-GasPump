package Strategy;

import Data.*;

public abstract class StorePricesAbstract {

	DataStore ds;
	public StorePricesAbstract(DataStore ds){
		this.ds = ds;
	}
	public abstract void StorePrice();
}
