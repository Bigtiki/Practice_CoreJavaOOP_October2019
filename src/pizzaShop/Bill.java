package pizzaShop;

public abstract class Bill extends Order {
	private String Name;
	private int total;
	

	public String getName() {
		
		System.out.print(Name);
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
