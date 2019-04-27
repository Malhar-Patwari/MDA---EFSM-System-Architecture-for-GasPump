package main;

import States.*;

import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Malhar
 *
 */
//This Class contains Meta events. Which are platform Independent and compatible to handle different client functionalities.

public class MDA {
	
	private static State S;
	private static ArrayList<State> SL;
	private OP op;
	
//constructor creates arraylist of all state objects.
	public MDA(){		
		SL = new ArrayList<State>(8);
		SL.add(new StartState(this));
		SL.add(new S0_State(this));
		SL.add(new S1_State(this));
		SL.add(new S2_State(this));
		SL.add(new S3_State(this));
		SL.add(new S4_State(this));
		SL.add(new S5_State(this));
		SL.add(new S6_State(this));
		SL.add(new S7_State(this));	
		S = SL.get(0);
	}
	
	
	public OP  getOP(){
		return op;
	}
	
	public void setOP(OP op) {
		this.op = op;		
	}	
	
	public void ChangeState(int a){		
		S = SL.get(a);
	}
	
	public void Activate(){		
		
		S.Activate();
	}
	public void Start(){	
		S.Start();	
	}
	public void PayType(int a){
		S.PayType(a);
	}
	public void Reject(){
		S.Reject();
	}
	public void Cancel(){
		S.Cancel();
	}
	public void Approved(){
		S.Approved();
	}
	public void StartPump(){
		S.StartPump();
	}
	public void Pump(){
		S.Pump();
	}
	public void StopPump(){
		S.StopPump();
	}
	public void SelectGas(int i){
		S.SelectGas(i);
	}
	public void Receipt(){
		S.Receipt();
	}
	public void NoReceipt(){
		S.NoReceipt();
	}
	public void CorrectPin(){
		S.CorrectPin();		
	}
	public void IncorrectPin(){
		S.IncorrectPin();
	}
	public void Continue(){
		S.Continue();
	}
	
}
