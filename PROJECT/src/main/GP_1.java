package main;

import Factories.*;
import Data.*;

//This is the main class og GasPump1. Which handles all methods of Gaspump1.
public class GP_1 {

	static DataStore ds;
	static MDA m;
	static DS_1 d;
	
	//Constructor creates new ConcreteFactory 1, MDA, OP instances.
	//and gets datastore object by calling get data of CF_1.
	public GP_1(){		 
		AbstractFactory af = new CF_1();
		ds = af.getData();
		m = new MDA();
		m.setOP(new OP(af));
		d = (DS_1) ds;
	}
	
//these below methods are supported by GasPump1.
	
	public void Activate(float a,float b){

		if((a>0)&(b>0)){ // if both are >0
			
			d.set_temp_a(a);
			d.set_temp_b(b);
			m.Activate();
		}
		else{			
			System.out.println("Please enter a and b greater than 0.");
		}
	}
	
	public void Start(){
			m.Start();
		}
	public void Reject(){
		m.Reject();
	}
	public void PayCredit(){
		d.set_temp_M(1);		
		m.PayType(1);
	}
	public void PayDebit(String p){
		d.set_temp_M(2);
		d.set_temp_p(p);		
		m.PayType(3);
	}
	
	public void Pin(String x){ 		
		System.out.println(d.get_pin());	
		if(x.equals(d.get_pin())){		// if pin matches with saved pin
			m.CorrectPin();
		}
		else{
			m.IncorrectPin();
		}
	}
	public void Cancel(){
		m.Cancel();		
	}
	public void Approved(){
		m.Approved();
	}
	public void Diesel(){
		m.SelectGas(4);		
	}
	public void Regular(){
		m.SelectGas(1);		
	}
	
	public void StartPump(){
		if(d.get_price() >0 ){
			m.Continue();
			m.StartPump();
		}		
	}
	public void PumpGallon(){
		m.Pump();
	}
	public void StopPump(){
		m.StopPump();
		m.Receipt();
	}
	public void FullTank(){
		m.StopPump();
		m.Receipt();
	}
}
