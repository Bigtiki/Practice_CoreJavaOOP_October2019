package pizzaShop;

public interface Pizza{
	String typeOfPizza(String Qty);
	void topic(String OneTopping);
	void topic(String OneTopping, String twoTopping);
	void topic(String OneTopping, String twoTopping,String threeTopping);
	void topic(String OneTopping, String twoTopping,String threeTopping,String FourOrMoreTopping);
	void totalPrize();

}
