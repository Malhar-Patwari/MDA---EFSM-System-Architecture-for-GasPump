package States;

import main.*;

public class S4_State extends State {

	public S4_State(MDA m) {
		// TODO Auto-generated constructor stub
		super(m);
	}

	@Override
	public void StartPump(){
		m.getOP().SetInitialValues();
		m.getOP().ReadyMsg();
		m.ChangeState(6);
	}
}
