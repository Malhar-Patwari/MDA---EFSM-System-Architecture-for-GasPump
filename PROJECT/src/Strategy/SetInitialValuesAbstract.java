package Strategy;

import Data.*;

public abstract class SetInitialValuesAbstract {

	DataStore ds;
	public SetInitialValuesAbstract(DataStore ds){
		this.ds = ds;
	}
	public abstract void SetInitialValues();
}
