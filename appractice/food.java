public class food {

	private String name;
	private int calories;
	private double price;
	
	public food(){

	}
	public food(String _name, int _calories, double _price){
		name = _name;
		calories = _calories;
		price = _price;

	}
	public void setname(String _name){
		name = _name;
	}

	public void setcalories(int _calories){
		calories = _calories;
	}
	public void setprice(double _price){
		price = _price;
	}
	public String getname(){
		return name;
	}
	public int getcalories(){
		return calories;
	}
	public double getprice(){
		return price;
	}
	}
