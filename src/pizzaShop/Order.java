package pizzaShop;

public abstract class Order implements Pizza{
	private String OneTopping;
	private String twoTopping;
	private String threeTopping;
	private String  FourOrMoreTopping;
	abstract void TakeOut();
	abstract void TakeOut(int OrderNumber, int Total);
	public String getOneTopping() {
		return OneTopping;
	}
	public void setOneTopping(String oneTopping) {
		OneTopping = oneTopping;
	}
	public String getTwoTopping() {
		return twoTopping;
	}
	public void setTwoTopping(String twoTopping) {
		this.twoTopping = twoTopping;
	}
	public String getFourOrMoreTopping() {
		return FourOrMoreTopping;
	}
	public void setFourOrMoreTopping(String fourOrMoreTopping) {
		FourOrMoreTopping = fourOrMoreTopping;
	}
	public String getThreeTopping() {
		return threeTopping;
	}
	public void setThreeTopping(String threeTopping) {
		this.threeTopping = threeTopping;
	}
	

}
