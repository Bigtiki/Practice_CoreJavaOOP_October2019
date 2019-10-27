package pizzaShop;

public class testClass extends Bill implements Pizza, ShopInformation{

	@Override
	public String nameOfCustomer() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public String nameOfEmployee() {
		// TODO Auto-generated method stub
		String Employee;
		Employee ="JANE";
		return Employee;
	}

	@Override
	public int orderNumber(int Order, int total) {
		int Balance;
		Balance = Order+total;
		System.out.println(Balance);
		return Balance;
	}

	@Override
	public String typeOfPizza() {
		String Flavor;
		Flavor="JAVA";
		return Flavor;
	}

	@Override
	public void topic() {
		System.out.println("HELLO");
		
	}

	@Override
	public void totalPrize() {
		
		System.out.print("TotalPrize\n$");
	}

	@Override
	void TakeOut() {
		System.out.println("TakeOut");
		
	}

	@Override
	void TakeOut(int OrderNumber, int Total) {
		orderNumber(OrderNumber,Total);
		
	}

}
