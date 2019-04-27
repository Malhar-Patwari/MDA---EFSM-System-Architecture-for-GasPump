package States;

import main.*;

public class S6_State extends State {
	
	public S6_State(MDA m) {
		// TODO Auto-generated constructor stub
		super(m);
	}
	@Override
	public void Receipt(){
		m.getOP().PrintReceipt();
		m.getOP().ReturnCash();
		m.ChangeState(1);
	}
	
	@Override
	public void NoReceipt(){
		m.getOP().ReturnCash();	
		m.ChangeState(1);
	}

}
