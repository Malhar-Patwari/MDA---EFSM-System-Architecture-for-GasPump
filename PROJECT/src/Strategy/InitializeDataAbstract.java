package Strategy;

import Data.*;

public abstract class InitializeDataAbstract {
	
	DataStore ds;
	public InitializeDataAbstract(DataStore ds){
		this.ds = ds;
	}
	public abstract void InitializeData();
}
