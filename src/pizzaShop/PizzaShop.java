package pizzaShop;

import java.util.Scanner;

public class PizzaShop extends testClass {
	static String store;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("\t\tHello!!!" + "(And Follow the instruction~!)\n" + "\nEnter Your Shop name:\n");
		Scanner scan = new Scanner(System.in);
		store = scan.nextLine();
		System.out.println("\nChoose 1.");
		runPizzaShop();
		display();
		display(store);


	}

	public static void runPizzaShop() {
		testClass Store = new testClass();
		Scanner input = new Scanner(System.in);
		System.out.print("Choose a option:\n" + "|1||2||3||4|\n");
		String answer = input.nextLine();
		System.out.println("********************************************");

		switch (answer) {
		case "1":
			Store.setName(store);
			System.out.print("Store name:");
			Store.getName();
			System.out.println();

			break;

		case "2":
			System.out.println("Choose 1");
			runPizzaShop();
			break;

		case "3":
			System.out.println("Choose 1");
			runPizzaShop();
			break;
		case "4":
		default:
			System.out.println("Try Again");
			runPizzaShop();
			
		}

	}

	public static void display() {
		System.out.println("********************************************");
		System.out.println("\t\tPizza:" + store);
		System.out.println("\t\t      Astoria\n\t\tNext Aveneu, 23 New York 11100");
		System.out.println("********************************************");

		testClass Everything = new testClass();
		System.out.print("Store:");
		Everything.setName(store);
		Everything.getName();
		System.out.print("\nMOST Pizza SOLD:");
		String Flavor = Everything.typeOfPizza();
		System.out.print(Flavor + " ");
		Everything.topic();
		Everything.TakeOut();
		System.out.print("\t\t\tTotal Price:$");
		Everything.TakeOut(19, 1000);

	}

	public static void display(String store) {
		System.out.println("********************************************");
		System.out.println("\t\tPizza:" + store);
		System.out.println("\t\t      Astoria\n\t\tNext Aveneu, 23 New York 11100");
		System.out.println("********************************************");

	}
}