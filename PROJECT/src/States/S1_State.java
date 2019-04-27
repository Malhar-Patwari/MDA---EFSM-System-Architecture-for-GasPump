package States;

import main.*;

public class S1_State extends State {
	
	public S1_State(MDA m) {
		// TODO Auto-generated constructor stub
		super(m);
		op = m.getOP();
	}

	public void PayType(int a){
		if(a == 1){
			m.getOP().SetM();
			m.ChangeState(3);
		}
		else if(a == 2){
			m.getOP().StoreCash();
			m.getOP().DisplayMenu();
			m.getOP().SetM();	
			m.ChangeState(4);
		}
		else if(a == 3){			
			m.getOP().EnterPinMsg();
			m.getOP().StorePin();
			m.getOP().SetM();
			m.ChangeState(8);
		}
		else{
			
		}
	}
}
