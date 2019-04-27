package Data;

public class DS_2 extends DataStore {

	//This Class stores data related to GP2.
	static float temp_a;
	static float temp_b;
	static float temp_c;
	static int temp_M;	
	static int M;
	static float temp_cash;
	static float SPrice;
	static float RPrice;
	static float PPrice;
	static float cash;
	static float total;
	static int L;
	static float price;
	
	
	//below are the getters and setters to access the private variables.
	public float get_temp_a(){
		return temp_a;
	}
	public float get_temp_b(){
		return temp_b;
	}
	public float get_temp_c(){
		return temp_c;
	}
	public int get_temp_M(){
		return temp_M;
	}
	public int get_M(){
		return M;
	}
	public float get_temp_cash(){
		return temp_cash;
	}
	public float get_SPrice(){
		return SPrice;
	}
	public float get_RPrice(){
		return RPrice;
	}
	public float get_PPrice(){
		return PPrice;
	}
	public float get_cash(){
		return cash;
	}
	public float get_total(){
		return total;
	}
	public int get_L(){
		return L;
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
	public void set_temp_c(float c){
		temp_c = c;
	}
	public void set_temp_M(int m){
		temp_M = m;
	}
	public void set_M(int m){
		M = m;
	}
	public void set_temp_cash(float c){
		temp_cash = c;
	}
	public void set_SPrice(float s){
		SPrice = s;
	}
	public void set_RPrice(float r){
		RPrice = r;
	}
	public void set_PPrice(float p){
		PPrice = p;
	}
	public void set_cash(float c){
		cash = c;
	}
	public void set_total(float t){
		total = t;
	}
	public void set_L(int l){
		L = l;
	}
	public void set_price(float p){
		price = p;
	}



}
