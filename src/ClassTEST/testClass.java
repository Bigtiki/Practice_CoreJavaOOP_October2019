package ClassTEST;

import pizzaShop.PizzaShop;

public class testClass {
	


	public static void main(String[] args) {
		PizzaShop.main1();

		PizzaShop Dominos = new PizzaShop("THE END");
		Dominos.setOneTopping("۰3۪۫C۪۫۰۰۪۫H۪۫۰۰۪۫E۪۫۰۰۪۫E۪۫۰۰۪۫S۪۫۰۰۪۫E۪۫۰");
		Dominos.setThreeTopping("۰۪۫STAKE*** 4 C۪۫۰۰۪۫H۪۫۰۰۪۫E۪۫۰۰۪۫E۪۫۰۰۪۫S۪۫۰۰۪۫E۪۫۰");
		Dominos.setTwoTopping("۰۪۫Chicken|||VEGI***C۪۫۰۰۪۫H۪۫۰۰۪۫E۪۫۰۰۪۫E۪۫۰۰۪۫S۪۫۰۰۪۫E۪۫۰");
		
		
		for(int i=0;i<14;i++) {
		System.out.print("\t\t"+Dominos.getThreeTopping()+Dominos.getOneTopping()+"\n"+Dominos.getTwoTopping());}

	

	

	
}
}