package States;

import main.*;
//this class is used for creating decentralized type of state pattern.

//this class is similar to abstract class. these class does not have any actual implementation of meta actions.
//Other state classes inherits this class for the actual implementations.
//different state class has different meta actions implementations.

public class State {

	MDA m;
	OP op;
	
	public State(MDA m){//constructor sets MDA object to m variable.
		this.m = m;				
	}
	
	
	public void Activate(){
		
	}
	public void Start(){
		
	}
	public void PayType(int a){
		
	}
	public void Reject(){
		
	}
	public void Cancel(){
		
	}
	public void Approved(){
		
	}
	public void StartPump(){
		
	}
	public void Pump(){
		
	}
	public void StopPump(){
		
	}
	public void SelectGas(int g){
		
	}
	public void Receipt(){
		
	}
	public void NoReceipt(){
		
	}
	public void CorrectPin(){
		
	}
	public void IncorrectPin(){
		
	}
	public void Continue(){
		
	}
	
}
