package main;

import Factories.*;
import Data.*;

//This is the main class og GasPump1. Which handles all methods of Gaspump2.


public class GP_2 {

	static DataStore ds;
	static MDA m;
	static DS_2 d;

	//Constructor creates new ConcreteFactory 2, MDA, OP instances.
	//and gets datastore object by calling get data of CF_2.
	public GP_2(){		
		AbstractFactory af = new CF_2();
		ds = af.getData();
		m = new MDA();
		m.setOP(new OP(af));
		d = (DS_2) ds;
	}

	//these below methods are supported by GasPump2.
public void Activate(float a,float b,float c){
		
	if((a>0)&(b>0)&(c>0)){
		d.set_temp_a(a);
		d.set_temp_b(b);
		d.set_temp_c(c);		
		m.Activate();		
	}
	else{			
		System.out.println("a or b or c not a valid price");
	}
	}
	
	public void Reject(){
		m.Reject();
	}
	public void PayCash(int c){
		if(c>0)
		{
			d.set_temp_cash(c);
			d.set_temp_M(0);	
			m.Start();
			m.PayType(2);
		}
	}
	public void PayCredit(){
		d.set_temp_M(1);
		m.Start();			
		m.PayType(1);
	}
	
	public void Cancel(){
		m.Cancel();
	}
	public void Approved(){
		m.Approved();
	}
	public void Premium(){
		m.SelectGas(3);
		m.Continue();
	}
	
	public void Regular(){
		m.SelectGas(1);
		m.Continue();
	}
	public void Super(){
		m.SelectGas(2);
		m.Continue();
	}
	
	public void StartPump(){
		m.StartPump();
	}
	public void PumpLiter(){
		
		int mm = d.get_M();
		float cash = d.get_cash();
		float price = d.get_price();
		int l = d.get_L();
		/*
		if((mm==0)&(cash>=(price*(l+1)))){
			m.Pump();
		}		
		else if (mm == 1){
			m.Pump();
		}
		*/
		if((mm ==0)&(cash <(price*(l+1)))){
			m.StopPump();
		}
		else{
			m.Pump();
		}
	}	
	public void Stop(){
		m.StopPump();		
	}
	public void Receipt(){
		m.Receipt();
	}
	public void NoReceipt(){
		m.NoReceipt();
	}
}
