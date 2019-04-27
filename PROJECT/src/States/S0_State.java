package States;

import main.*;

public class S0_State extends State{

	public S0_State(MDA m) {
		// TODO Auto-generated constructor stub
		super(m);
	}

	@Override
	public void Start(){
		System.out.println("IN S0- STATE");
		m.getOP().PayMsg();
		m.getOP().InitializeData();		
		m.ChangeState(2);
				
	}
}
