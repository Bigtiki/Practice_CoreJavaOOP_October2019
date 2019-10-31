package pizzaShop;

import java.util.Scanner;



public class PizzaShop extends Bill{
enum Passes{
		Valid,ENDED;
	}
public PizzaShop() {
	System.out.print("**********************************************"
			+ "\n|▂▃▄▅▆▇█▓▒░HELLO!░▒▓█▇▆▅▄▃▂"+"\nPlease Enter ANYTHING you want!!"
				+"\n☠ IF YOU WANT TO QUIT☠> ENTER~!\n\n"
				+ "\t\t*̘̍̾*͓͓̟̦ͪ͗ͯ̔*͇̱̫̜͈ͨ*̲̪̀̿ͪ̽ͦ*̮ͣ̀*͎̜̐̓̏*̘̍̾*͓͓̟̦ͪ͗ͯ̔*͇̱̫̜͈ͨ*̲̪̀̿ͪ̽ͦ*̮ͣ̀*͎̜̐̓̏*̾̍͋ͭ̿ \n\t̘̍̾*͓͓̟̦ͪ͗ͯ̔*͇̱̫̜͈ͨ*̲̪̀̿ͪ̽ͦ*̮ͣ̀*͎̜̐̓̏*̘̍̾*͓͓̟̦ͪ͗ͯ̔*͇̱̫̜͈ͨ*̲̪̀̿ͪ̽ͦ*̮ͣ̀*͎̜̐̓̏*\n*̎́̈́̒ͫ*̗͖̖̲̃͌̋ͤ*͚͎̺̥͓̬̈*̲͎͚̎*̘̼͑̎ͩ̓*̘͇̣̘̞͕ͬ**̎́̈́̒ͫ*̗͖̖̲̃͌̋ͤ*͚͎̺̥͓̬̈*̲͎͚̎*̘̼͑̎ͩ̓*̘͇̣̘̞͕ͬ*̰́͛\n★ ¯\\_(ツ)_/¯\n ¯\\_(ツ)_/¯ ★\n"
				+ "✧ 𝕃𝔼𝕋𝕊 𝕊𝕋𝔸ℝ𝕋 ✧\t\t\t\t\t\t[̲̅[̲̅*̲̅][̲̅*̲̅][̲̅&̲̅][̲̅&̲̅]\n"+"**********************************************"
					+"\n\n`̭̲̺̟̿̌̏~̜̻ͯ͂ͬ~̟͎̤͂͐̑̑́`͉̟̜̹̅̐̀ͣ`͖͚̜ͬ`̲̬ͤ`͈̻͗`̭̲̺̟̿̌̏~̜̻ͯ͂ͬ~̟͎̤͂͐̑̑́`͉͈̻̅̐̀͗★★PIZZA DELIVERY & vs ̥ͥ&̱̥̩͈̽̈́ͯ͆.`̭̲̺̟̿̌̏~̜̻ͯ͂ͬ~̭̲̺̟͂̿̌̏~̜̻ͯ͂ͬ~̟͎̤͂͐̑̑́`͉̟̜̹̅̐̀ͣ`͖͚̜ͬ`̲̬ͤ``̭̲̺̟̿̌̏\t\t̻ͬ~̟͎͂͐̑[̅[̲̅*̲̅][̲̅*̲̅][̲̅&̲̅][̲̅&̲̅]\n[̲̲̅̅g̲̲̅̅u̲̲̅̅e̲̲̅̅s̲̲̅̅s̲̲̅̅ ̲̲̅̅a̲̲̅̅ ̲̲̅̅t̲̲̅̅o̲̲̅̅t̲̲̅̅a̲̲̅̅l̲̲̅̅]\n\n");
}
public PizzaShop(String GAME) {
	System.out.print("**********************************************"
			+ "\n|▂▃▄▅▆▇█▓▒░"+GAME+"░▒▓█▇▆▅▄▃▂"+"\nI PROVIDED THE ANSWER!!"
				+"\n☠ IF YOU WANT TO QUIT☠> ENTER~!\n\n"
				+ "\t\t*̘̍̾*͓͓̟̦ͪ͗ͯ̔*͇̱̫̜͈ͨ*̲̪̀̿ͪ̽ͦ*̮ͣ̀*͎̜̐̓̏*̘̍̾*͓͓̟̦ͪ͗ͯ̔*͇̱̫̜͈ͨ*̲̪̀̿ͪ̽ͦ*̮ͣ̀*͎̜̐̓̏*̾̍͋ͭ̿ \n\t̘̍̾*͓͓̟̦ͪ͗ͯ̔*͇̱̫̜͈ͨ*̲̪̀̿ͪ̽ͦ*̮ͣ̀*͎̜̐̓̏*̘̍̾*͓͓̟̦ͪ͗ͯ̔*͇̱̫̜͈ͨ*̲̪̀̿ͪ̽ͦ*̮ͣ̀*͎̜̐̓̏*\n*̎́̈́̒ͫ*̗͖̖̲̃͌̋ͤ*͚͎̺̥͓̬̈*̲͎͚̎*̘̼͑̎ͩ̓*̘͇̣̘̞͕ͬ**̎́̈́̒ͫ*̗͖̖̲̃͌̋ͤ*͚͎̺̥͓̬̈*̲͎͚̎*̘̼͑̎ͩ̓*̘͇̣̘̞͕ͬ*̰́͛\n✧ YOU FINALLY FINI$HED ✧\n★ ¯\\_(ツ)_/¯\n ¯\\_(ツ)_/¯ ★\n"
				+ "✧ YOU FINALLY FINI$HED ✧\t\t\t\t[̲̅[̲̅*̲̅][̲̅*̲̅][̲̅&̲̅][̲̅&̲̅]\n"+"**********************************************"
					+"\n\n`̭̲̺̟̿̌̏~̜̻ͯ͂ͬ~̟͎̤͂͐̑̑́`͉̟̜̹̅̐̀ͣ`͖͚̜ͬ`̲̬ͤ`͈̻͗`̭̲̺̟̿̌̏~̜̻ͯ͂ͬ~̟͎̤͂͐̑̑́`͉͈̻̅̐̀͗★★Program Terminatition & ̥ͥ&̱̥̩͈̽̈́ͯ͆.`̭̲̺̟̿̌̏~̜̻ͯ͂ͬ~̭̲̺̟͂̿̌̏~̜̻ͯ͂ͬ~̟͎̤͂͐̑̑́`͉̟̜̹̅̐̀ͣ`͖͚̜ͬ`̲̬ͤ``̭̲̺̟̿̌̏\t̻ͬ~̟͎͂͐̑[̅[̲̅*̲̅][̲̅*̲̅][̲̅&̲̅][̲̅&̲̅]\n[̲̲̅̅g̲̲̅̅u̲̲̅̅e̲̲̅̅s̲̲̅̅s̲̲̅̅ ̲̲̅̅a̲̲̅̅ ̲̲̅̅t̲̲̅̅o̲̲̅̅t̲̲̅̅a̲̲̅̅l̲̲̅̅]\n\n");
}
public static void main1() {
{
		main();
		Passes Enumfail=Passes.ENDED;
		System.out.println("SYSTEM OPERATION: "+Enumfail+"\nOnly way to exit... ENTER(**&&)");
	}
}
	public static void main(){
		
		Passes Enumfail=Passes.Valid;
		
		
		switch(Enumfail) {
		case Valid:
			PizzaShop Gucci = new PizzaShop();
		Scanner input= new Scanner(System.in);
		System.out.println("|▂▃▄▅▆▇█▓▒░The Name Of YOUR The Store is░▒▓█▇▆▅▄▃▂|\n");
		String NameOfStore=input.nextLine();
		if(NameOfStore.equals("**&&")){System.out.println("|NO LOOP [)'.8].....|\n");break;}
		System.out.println("|▂▃▄▅▆▇█▓▒The Name Of The Road is░▒▓█▇▆▅▄▃▂|\n");
		String Road=input.nextLine();
		if(Road.equals("**&&")){System.out.println("|NO LOOP [)'.8].....|\n");break;}
		System.out.println("|▂▃▄▅▆▇█▓▒The Name Of The TOWN is░▒▓█▇▆▅▄▃▂|\n");
		String Town=input.nextLine();
		if(Town.equals("**&&")){System.out.println("|NO LOOP [)'.8].....|\n");break;}
		System.out.println("|▂▃▄▅▆▇█▓▒The Name Of The State is░▒▓█▇▆▅▄▃▂|\n");
		String State=input.nextLine();
		if(State.equals("**&&")){System.out.println("|NO LOOP [)'.8].....|\n");break;}
		int y=3;
		do{try {
		System.out.println("|The #### Of The Order is|\n");
		
		String Order=input.nextLine();
		if(Order.equals("**&&")){System.out.println("|NO LOOP .....[)'.8]|\n");main();}
		System.out.println("|The $$$$ Of The Total is|\t̻ͬ~̲*̲̅][̲̅*̲̅][̲̅&̲̅][̲̅&̲̅]]\n");
		String Total=input.nextLine();
		if(Total.equals("**&&")){
			System.out.println("|The WINNING Store is|\n"+Gucci.nameOfStore("BIG TIKI EMPIRE") +"\nAdress:"+Gucci.Address_Store(Gucci.nameOfStore("DUBAI AIRLINE"),"THE MALL, QUEENS, 34th AVE", "BOS$", "MA") + 
					"\nGUCCI SAID:\n"+Gucci.orderNumber("125", "2987677656788766544439877761234455047483147"+"\n\t\t THANKS!!!\n\t      LOOP ENDED WELL!!\n"));
	System.out.print("🅑🅣🅔\n  &&『*』『*』*』『*』『*』『*』『*』『*』『*』『*』\n\n");break;}
		
		System.out.println("|̲T̲̲h̲̲e̲̲ ̲̲N̲̲a̲̲m̲̲e̲̲ ̲̲o̲̲f̲̲ ̶̶̲̲Y̶̶O̶̶U̶̶R̶̶ ̶̶S̶̶T̶̶O̶̶R̶̶E̶̶̲|\n"+Gucci.nameOfStore(NameOfStore)+
				"\nAdress:"+Gucci.Address_Store(Gucci.nameOfStore(NameOfStore),Road, Town, State)+
				"\nYOR RESULTS:\n"+Gucci.orderNumber(Order, Total)+"\n\n|̲̲T̲̲h̲̲e̲̲ ̲̲N̲̲a̲̲m̲̲e̲̲ ̲̲o̲̲f̲̲ ̲̲M̲̲Y̲̲ ̲̲S̲̲T̲̲O̲̲R̲̲E̲̲|\n"+Gucci.nameOfStore("BIG TIKI EMPIRE") +"\nAdress:"+Gucci.Address_Store(Gucci.nameOfStore("BIG TIKI EMPIRE"),"GAS-MALL", "BOS$", "MA") + 
						"\nYOUR RESULTS:\n"+Gucci.orderNumber("125", "2987677656788766544439877761234455047483147"+"\n\t\t THANKS!!!\n\t      ITS LOOP TIME!!\n"));
		System.out.print("𝖇𝖙𝖊&&**********************************************\n\n"
				+ "*****************************************\n");y=5;}catch(Exception e) {System.out.print("WHY?");main();}}while(y>4);
		
		break;
		case ENDED:
			System.out.print("▂▃▄▅▆▇█▓▒░░T░H░A░N░K░ ░Y░O░U░!░░▒▓█▇▆▅▄▃▂\n█ TRY AGAIN~!█ \n");
			break;
		default:
			System.out.print("NO!!");
		
	}}

	@Override
	public String nameOfOwner(String Owner) {
		String NfOwner=Owner;
		return NfOwner;
	}

	@Override
	public String nameOfStore(String store) {
		String NAME_Store=store;
		return NAME_Store;
	}

	@Override
	public String Store_Hours(String Hours) {
		// TODO Auto-generated method stub
		String Time_Store=Hours;
		return Time_Store;
	}

	@Override
	public String Address_Store(String Name, String road, String Town, String State) {
		// TODO Auto-generated method stub
		String place=(Name+"\n"+"ROAD: "+road+"\nTOWN:"+Town+"\nState:"+State);
		String Adrs_Store=place;
		return Adrs_Store;
	}

	@Override
	public String orderNumber(String Order, String total) {
		String OrderNumber = Order;
		String  Payment = "Order:***"+OrderNumber +"\ntotal:$"+total;
		return Payment;
	}

	@Override
	public String typeOfPizza(String Qty) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void topic(String OneTopping) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void topic(String OneTopping, String twoTopping) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void topic(String OneTopping, String twoTopping, String threeTopping) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void topic(String OneTopping, String twoTopping, String threeTopping, String FourOrMoreTopping) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void totalPrize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void TakeOut() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void TakeOut(int OrderNumber, int Total) {
		// TODO Auto-generated method stub
		
	}
}
	