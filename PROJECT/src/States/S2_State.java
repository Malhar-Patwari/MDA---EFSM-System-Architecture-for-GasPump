package States;


import main.*;

public class S2_State extends State {

	public S2_State(MDA m) {
		// TODO Auto-generated constructor stub
		super(m);
	}
	@Override
	public void Approved(){	
		m.getOP().DisplayMenu();
		m.ChangeState(4);
	}
	@Override
	public void Reject(){
		m.getOP().RejectMsg();
		m.ChangeState(1);
	}
}
