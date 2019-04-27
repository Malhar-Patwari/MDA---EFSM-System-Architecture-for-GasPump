package States;

import main.*;

public class S7_State extends State {

	public S7_State(MDA m) {
		// TODO Auto-generated constructor stub
		super(m);
	}
	
	@Override
	public void CorrectPin(){
		m.getOP().DisplayMenu();
		m.ChangeState(4);
	}
	@Override
	public void IncorrectPin(){
		m.getOP().WrongPinMsg();
		m.ChangeState(1);
	}
}
