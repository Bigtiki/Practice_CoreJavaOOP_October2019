package pizzaShop;

import java.util.Scanner;

public class PizzaShop extends testClass {
	static String store;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("\t\tHello!!! <USER>\n" + "\t(And Follow the instruction~!)\n" + "\nEnter Your Shop name:\n");
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
		System.out.println("\t\t"+store+" Pizza");
		System.out.println("\t\t Astoria\n\tNext Aveneu, 23 New York 11100");
		System.out.println("********************************************");

		testClass Everything = new testClass();
		System.out.print("Store:");
		Everything.setName(store);
		Everything.getName();
		System.out.println("\nMOST Popular JAVA Pizza:");
		String Flavor = Everything.typeOfPizza();
		System.out.print(Flavor + " ");
		Everything.topic();
		System.out.print("Order Type:");
		Everything.TakeOut();
		System.out.println("Strated:");
		Everything.setName("1945");
		Everything.getName();
		System.out.println("\nPIE:");
		System.out.println(Flavor + "\n HI---HELLO---HOLY$ ");
		System.out.print("Busy Day: FRIDAY");
		System.out.print("\t\t\t\n\n\n\nTotal Price:$");
		Everything.TakeOut(19, 10000);

	}

	public static void display(String store) {
		System.out.println("********************************************");
		System.out.println("\t\t"+store+" Pizza");
		System.out.println("\t\t Astoria\n\tNext Aveneu, 23 New York 11100");
		System.out.println("********************************************");

	}
}
