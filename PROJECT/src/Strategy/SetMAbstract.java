package Strategy;

import Data.*;

public abstract class SetMAbstract {

	DataStore ds;
	public SetMAbstract(DataStore ds){
		this.ds = ds;
	}
	public abstract void SetM();
}
