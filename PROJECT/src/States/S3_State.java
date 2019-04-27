package States;

import main.*;

public class S3_State extends State{
	
	public S3_State(MDA m) {
		// TODO Auto-generated constructor stub
		super(m);
	}

	@Override
	public void Continue(){
		m.ChangeState(5);
	}
	
	@Override
	public void SelectGas(int g)
	{
		if(g == 1){
			m.getOP().SetPrice(g);
			m.ChangeState(4);
		}
		else if(g == 2){
			m.getOP().SetPrice(g);
			m.ChangeState(4);
		}
		else if(g == 3){
			m.getOP().SetPrice(g);
			m.ChangeState(4);
		}
		else if(g == 4){
			m.getOP().SetPrice(g);
			m.ChangeState(4);
		}
		else{
			System.out.println("Invalid Choice Of Gas Type");
		}
	}
	
	@Override
	public void Cancel()
	{
		m.getOP().CancelMsg();
		m.getOP().ReturnCash();
		m.ChangeState(1);
	}

}
