package main;

import Factories.*;
import Strategy.*;

//This Class contains handles Meta Actions. This Class is the client of various action strategies.
//Each Actions having more than one Strategy and has an Abstract class  associated with the OP.


public class OP {

	private AbstractFactory af;
	private StorePricesAbstract storeprices;
	private PayMsgAbstract paymsg;
	private StoreCashAbstract storecash;
	private DisplayMenuAbstract displaymenu;
	private RejectMsgAbstract rejectmsg;
	private SetInitialValuesAbstract setinitialvalues;
	private ReadyMsgAbstract readymsg;
	private PumpGasUnitAbstract pumpgasunit;
	private GasPumpedMsgAbstract gaspumpedmsg;
	private StopMsgAbstract stopmsg;
	private PrintReceiptAbstract printreceipt;
	private CancelMsgAbstract cancelmsg;
	private ReturnCashAbstract returncash;
	private WrongPinMsgAbstract wrongpinmsg;
	private StorePinAbstract storepin;
	private EnterPinMsgAbstract enterpinmsg;
	private InitializeDataAbstract initializedata;
	private SetPriceAbstract setprice;
	private SetMAbstract setm;
	
	
	public OP(AbstractFactory af) {
		// TODO Auto-generated constructor stub
		this.af = af;		
	}
	
	//below given methods call the appropriate methods to get the object of the strategy class.
	//then it calls the stretegy method of that class.
	
	public void StorePrices(){		
		this.storeprices = this.af.getStorePrices();
		this.storeprices.StorePrice();
	
	}
	
	public void PayMsg(){
		this.paymsg = this.af.getPayMsg();
		this.paymsg.PayMsg();		
	}
	
	public void StoreCash(){
		this.storecash = this.af.getStoreCash();
		this.storecash.StoreCash();			
	}
	
	public void DisplayMenu(){
		this.displaymenu = this.af.getDisplayMenu();
		this.displaymenu.DisplayMenu();
				
	}
	
	public void RejectMsg(){
		this.rejectmsg = this.af.getRejectMsg();
		this.rejectmsg.RejectMsg();
		
	}
	
	public void SetInitialValues(){
		this.setinitialvalues = this.af.getSetInitialValues();
		this.setinitialvalues.SetInitialValues();
		
	}
	
	public void ReadyMsg(){
		this.readymsg = this.af.getReadyMsg();
		this.readymsg.ReadyMsg();
		
	}

	public void PumpGasUnit(){
		this.pumpgasunit = this.af.getPumpGasUnit();
		this.pumpgasunit.PumpGasUnit();
		
	}
	
	public void GasPumpedMsg(){
		this.gaspumpedmsg = this.af.getGasPumpedMsg();
		this.gaspumpedmsg.GasPumpedMsg();
		}
	
	public void StopMsg(){
		this.stopmsg = this.af.getStopMsg();
		this.stopmsg.StopMsg();
		
	}
	public void PrintReceipt(){
		this.printreceipt = this.af.getPrintReceipt();
		this.printreceipt.PrintReceipt();		
	}
	
	public void CancelMsg(){
		this.cancelmsg = this.af.getCancelMsg();
		this.cancelmsg.CancelMsg();
		
	}
	
	public void ReturnCash(){
		this.returncash = this.af.getReturnCash();
		this.returncash.ReturnCash();
	}
	
	public void WrongPinMsg(){
		this.wrongpinmsg = this.af.getWrongPinMsg();
		this.wrongpinmsg.WrongPinMsg();		
	}
	
	public void StorePin(){
		this.storepin = this.af.getStorePin();
		this.storepin.StorePin();
	}

	public void EnterPinMsg(){
		this.enterpinmsg = this.af.getEnterPinMsg();
		this.enterpinmsg.EnterPinMsg();
				
	}
	
	public void InitializeData(){
		this.initializedata = this.af.getInitializeData();
		this.initializedata.InitializeData();
	}		
	
	public void SetPrice(int g) {
		this.setprice = this.af.getSetPrice();
		this.setprice.SetPrice(g);		
	}
	
	public void SetM() {
		this.setm = this.af.getSetM();
		this.setm.SetM();
	}
	
}