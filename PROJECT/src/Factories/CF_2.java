package Factories;

import Data.*;
import Strategy.*;

//This class is a concrete factory class and responsible for creating objects of strategy classes for GP2.

public class CF_2 extends AbstractFactory {

	public DataStore ds;
	
	
	public CF_2(){	//constructor initializes the data store 2 object.
		this.ds = new DS_2(); 
	}
	
	public DataStore getData() {		// this method returns datastore 2 object.		
		return this.ds;
	}
	
	
	@Override
	public StorePricesAbstract getStorePrices() {
		StorePricesAbstract g = new StorePrices_GP2(this.ds);
		return g;		
	}

	@Override
	public PayMsgAbstract getPayMsg() {
		PayMsgAbstract g = new PayMsg_GP2();
		return g;
	}

	@Override
	public StoreCashAbstract getStoreCash() {
		StoreCashAbstract g = new StoreCash_GP2(this.ds);
		return g;
	}

	@Override
	public DisplayMenuAbstract getDisplayMenu() {
		DisplayMenuAbstract g = new DisplayMenu_GP2();
		return g;			
	}

	@Override
	public RejectMsgAbstract getRejectMsg() {
		RejectMsgAbstract g = new RejectMsg_GP2();
		return g;
	}

	@Override
	public SetInitialValuesAbstract getSetInitialValues() {
		SetInitialValuesAbstract g = new SetInitialValues_GP2(this.ds);
		return g;
	}
	@Override
	public ReadyMsgAbstract getReadyMsg() {
		ReadyMsgAbstract g = new ReadyMsg_GP2();
		return g;
	}

	@Override
	public SetPriceAbstract getSetPrice() {
		SetPriceAbstract g = new SetPrice_GP2(this.ds);
		return g;
	}

	@Override
	public GasPumpedMsgAbstract getGasPumpedMsg() {
		GasPumpedMsgAbstract g = new GasPumpedMsg_GP2(this.ds);
		return g;
	}
	
	@Override
	public PumpGasUnitAbstract getPumpGasUnit() {
		PumpGasUnitAbstract g = new PumpGasUnit_GP2(this.ds);
		return g;
	}

	@Override
	public StopMsgAbstract getStopMsg() {
		StopMsgAbstract g = new StopMsg_GP2();
		return g;
	}

	@Override
	public PrintReceiptAbstract getPrintReceipt() {
		PrintReceiptAbstract g = new PrintReceipt_GP2(this.ds);
		return g;
	}

	@Override
	public CancelMsgAbstract getCancelMsg() {
		CancelMsgAbstract g = new CancelMsg_GP2();
		return g;
	}

	@Override
	public ReturnCashAbstract getReturnCash() {
		ReturnCashAbstract g = new ReturnCash_GP2(this.ds);
		return g;
	}

	@Override
	public WrongPinMsgAbstract getWrongPinMsg() {
		WrongPinMsgAbstract g = new WrongPinMsg_GP2();
		return g;
	}

	@Override
	public StorePinAbstract getStorePin() {
		StorePinAbstract g = new StorePin_GP2(this.ds);
		return g;
	}

	@Override
	public EnterPinMsgAbstract getEnterPinMsg() {
		EnterPinMsgAbstract g = new EnterPinMsg_GP2();
		return g;
	}

	@Override
	public InitializeDataAbstract getInitializeData() {
		InitializeDataAbstract g = new InitializeData_GP2(this.ds);
		return g;
	}

	@Override
	public SetMAbstract getSetM() {
		SetMAbstract g = new SetM_GP2(this.ds);
		return g;
	}

}
