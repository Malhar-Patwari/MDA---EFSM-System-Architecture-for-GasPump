package Factories;

import Data.*;
import Strategy.*;

//This is the Abstract Factory Class.It is used to group the various concrete Factories CF_1 and CF_2.

//below are the abstract methods for concrete factories.

public abstract class AbstractFactory {
	
	abstract public  DataStore getData();
	abstract public  StorePricesAbstract getStorePrices();
	abstract public  PayMsgAbstract getPayMsg();
	abstract public  DisplayMenuAbstract getDisplayMenu();
	abstract public  RejectMsgAbstract getRejectMsg();
	abstract public  SetInitialValuesAbstract getSetInitialValues();
	abstract public  ReadyMsgAbstract getReadyMsg();
	abstract public  SetPriceAbstract getSetPrice();
	abstract public  PumpGasUnitAbstract getPumpGasUnit();
	abstract public  GasPumpedMsgAbstract getGasPumpedMsg();
	abstract public  StopMsgAbstract getStopMsg();
	abstract public  PrintReceiptAbstract getPrintReceipt();
	abstract public  CancelMsgAbstract getCancelMsg();
	abstract public  StoreCashAbstract getStoreCash();
	abstract public  ReturnCashAbstract getReturnCash();
	abstract public  WrongPinMsgAbstract getWrongPinMsg();	
	abstract public  StorePinAbstract getStorePin();	
	abstract public  EnterPinMsgAbstract getEnterPinMsg();
	abstract public  InitializeDataAbstract getInitializeData();
	abstract public  SetMAbstract getSetM();
	
}
