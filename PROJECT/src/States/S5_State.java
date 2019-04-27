package States;

import main.*;

public class S5_State extends State {

	public S5_State(MDA m) {
		// TODO Auto-generated constructor stub
		super(m);
	}
	@Override
	public void Pump(){
		m.getOP().PumpGasUnit();
		m.getOP().GasPumpedMsg();
		m.ChangeState(6);
	}
	@Override
	public void StopPump(){
		m.getOP().StopMsg();
		m.ChangeState(7);
	}
}
