package Strategy;

import Data.*;

public abstract class PumpGasUnitAbstract {

	DataStore ds;
	public PumpGasUnitAbstract(DataStore ds){
		this.ds = ds;
	}
	public abstract void PumpGasUnit();
}
