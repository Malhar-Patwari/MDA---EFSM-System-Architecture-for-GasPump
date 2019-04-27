package States;

import main.*;

public class StartState extends State {
	
	public StartState(MDA m) {
		// TODO Auto-generated constructor stub
		super(m);
	}	

	@Override
	public void Activate(){	
		System.out.println("IN ACTIVATE- STARTSTATE");
		m.getOP().StorePrices();		
		m.ChangeState(1);
	}
}
