package Data;

public class DS_1 extends DataStore{	

	//This Class stores data related to GP1.
	//below are the variables
	private float temp_a;
	private float temp_b;
	private String temp_p;
	private int temp_M;
	private int M;
	private String pin;
	private float price;
	private float cash;
	private int G;
	private float total;
	private float RPrice;
	private float DPrice;

	
	//below are the getters and setters to access the private variables.
	
	public float get_temp_a(){
		System.out.println("IN DS-1");
		return this.temp_a;
	}
	public float get_temp_b(){
		return temp_b;
	}
	public String get_temp_p(){
		return temp_p;
	}
	public int get_temp_M(){
		return temp_M;
	}
	public int get_M(){
		return M;
	}
	public String get_pin(){
		return pin;
	}
	
	public float get_RPrice(){
		return RPrice;
	}
	public float get_DPrice(){
		return DPrice;
	}
	public float get_cash(){
		return cash;
	}
	public float get_total(){
		return total;
	}
	public int get_G(){
		return G;
	}
	public float get_price(){
		return price;
	}
	
	public void set_temp_a(float a){		
		temp_a = a;		
	}
	public void set_temp_b(float b){
		temp_b = b;
	}
	public void set_temp_p(String p){
		temp_p = p;
	}
	public void set_temp_M(int m){
		temp_M = m;
	}
	public void set_M(int m){
		M = m;
	}
	public void set_pin(String p){
		pin = p;
	}
	public void set_price(float p){
		price = p;
	}
	public void set_RPrice(float r){
		RPrice = r;
	}
	public void set_DPrice(float d){
		DPrice = d;
	}
	public void set_cash(float c){
		cash = c;
	}
	public void set_total(float t){
		total = t;
	}
	public void set_G(int g){
		G = g;
	}

}
