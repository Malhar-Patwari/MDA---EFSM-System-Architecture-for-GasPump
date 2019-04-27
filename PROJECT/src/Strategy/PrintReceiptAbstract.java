package Strategy;

import Data.*;

public abstract class PrintReceiptAbstract {

	DataStore ds;
	public PrintReceiptAbstract(DataStore ds){
		this.ds = ds;
	}
	public abstract void PrintReceipt();
}
