package pizzaShop;

public abstract class Bill extends Order {
	private String Name;
	private double total;
	

	public String getName() {
		
		System.out.print(Name);
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
