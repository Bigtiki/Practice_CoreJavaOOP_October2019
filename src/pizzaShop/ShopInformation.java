package pizzaShop;

public interface ShopInformation {
	String nameOfOwner(String Owner);
	String nameOfStore(String store);
	String Store_Hours(String Hours);
	String Address_Store(String Name,String road, String Town,String State);
	
	String orderNumber(String Order, String total );
}
