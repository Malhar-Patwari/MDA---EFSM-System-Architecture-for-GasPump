package Strategy;

import Data.*;

public abstract class SetPriceAbstract {

	DataStore ds;
	public SetPriceAbstract(DataStore ds){
		this.ds = ds;
	}
	public abstract void SetPrice(int g);
}
