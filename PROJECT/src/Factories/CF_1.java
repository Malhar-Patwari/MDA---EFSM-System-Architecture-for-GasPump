package Factories;

import Data.*;
import Strategy.*;

//This class is a concrete factory class and responsible for creating objects of strategy classes for GP1.


public class CF_1 extends AbstractFactory {

	public DataStore ds;
	
	public CF_1(){ //constructor initializes the data store 1 object.
		this.ds = new DS_1(); 
	}
	
	public DataStore getData() { // this method returns datastore 1 object.		
		return this.ds;
	}
	
	@Override
	public StorePricesAbstract getStorePrices() {
		StorePricesAbstract g = new StorePrices_GP1(this.ds);	
		return g;
	}

	@Override
	public PayMsgAbstract getPayMsg() {
		PayMsgAbstract g = new PayMsg_GP1();
		return g;
	}

	@Override
	public StoreCashAbstract getStoreCash() {
		StoreCashAbstract g = new StoreCash_GP1(this.ds);
		return g;
	}

	@Override
	public DisplayMenuAbstract getDisplayMenu() {
		DisplayMenuAbstract g = new DisplayMenu_GP1();
		return g;		
	}

	@Override
	public RejectMsgAbstract getRejectMsg() {
		
		RejectMsgAbstract g = new RejectMsg_GP1();
		return g;		
	}

	@Override
	public SetInitialValuesAbstract getSetInitialValues() {
		SetInitialValuesAbstract g = new SetInitialValues_GP1(this.ds);
		return g;
	}

	@Override
	public ReadyMsgAbstract getReadyMsg() {
		ReadyMsgAbstract g = new ReadyMsg_GP1();
		return g;	
	}
	
	@Override
	public SetPriceAbstract getSetPrice() {
		SetPriceAbstract g = new SetPrice_GP1(this.ds);
		return g;	
	}

	@Override
	public PumpGasUnitAbstract getPumpGasUnit() {
		PumpGasUnitAbstract g = new PumpGasUnit_GP1(this.ds);
		return g;
	}
	
	@Override
	public GasPumpedMsgAbstract getGasPumpedMsg() {
		GasPumpedMsgAbstract g = new GasPumpedMsg_GP1(this.ds);
		return g;
	}

	@Override
	public StopMsgAbstract getStopMsg() {
		StopMsgAbstract g = new StopMsg_GP1();
		return g;		
	}

	@Override
	public PrintReceiptAbstract getPrintReceipt() {
		 PrintReceiptAbstract g = new PrintReceipt_GP1(this.ds);
		return g;
	}

	@Override
	public CancelMsgAbstract getCancelMsg() {
		CancelMsgAbstract g = new CancelMsg_GP1();
		return g;	
	}

	@Override
	public ReturnCashAbstract getReturnCash() {
		ReturnCashAbstract g = new ReturnCash_GP1(this.ds);
		return g;
	}

	@Override
	public WrongPinMsgAbstract getWrongPinMsg() {
		WrongPinMsgAbstract g = new WrongPinMsg_GP1();
		return g;		
	}

	@Override
	public StorePinAbstract getStorePin() {
		// TODO Auto-generated method stub
		StorePinAbstract g = new StorePin_GP1(this.ds);
		return g;		
	}

	@Override
	public EnterPinMsgAbstract getEnterPinMsg() {
		// TODO Auto-generated method stub
		EnterPinMsgAbstract g = new EnterPinMsg_GP1();
		return g;
	}

	@Override
	public InitializeDataAbstract getInitializeData() {
		InitializeDataAbstract g = new InitializeData_GP1(this.ds);
		return g;
	}

	@Override
	public SetMAbstract getSetM() {
		SetMAbstract g = new SetM_GP1(this.ds);
		return g;		
	}

}
