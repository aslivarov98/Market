package market_store;
import java.util.Scanner;

public class PayDesk {
	
	static Bronze_card useBCard()
	{
		Scanner sca = new Scanner(System.in);
		int turnover;
		String owner;
		System.out.println("You have selected to use a Bronze card. Please enter its turnover value and its owner's name:");
		System.out.print("turnover:");
		turnover=sca.nextInt();
		System.out.print("owner:");
		owner=sca.next();
		Bronze_card bc = new Bronze_card(turnover, owner);
		return bc;
	}
	
	static Silver_card useSCard()
	{
		Scanner sca = new Scanner(System.in);
		int turnover;
		String owner;
		System.out.println("You have selected to use a Silver card. Please enter its turnover value and its owner's name:");
		System.out.print("turnover:");
		turnover=sca.nextInt();
		System.out.print("owner:");
		owner=sca.next();
		Silver_card sc = new Silver_card(turnover, owner);
		return sc;
	}
				
	static Gold_card useGCard()
	{
		Scanner sca = new Scanner(System.in);
		int turnover;
		String owner;
		System.out.println("You have selected to use a Gold card. Please enter its turnover value and its owner's name:");
		System.out.print("turnover:");
		turnover=sca.nextInt();
		System.out.print("owner:");
		owner=sca.next();
		Gold_card gc = new Gold_card(turnover, owner);
		return gc;
	}
	
	static void printBronze_data (Bronze_card bc, int purchase_value)
	{
		System.out.println("1. Bronze:");
		System.out.println(" a. Mock data: turnover $" + bc.turnover + " , purchase value " + purchase_value + "$");
		System.out.println(" b. Output:\n");
		System.out.println("  - Purchase value: $" + purchase_value);
		System.out.println("  - Discount rate: " + bc.discount_rate + "%");
		System.out.println("  - Discount: $" + bc.calculateDisc(purchase_value));
		System.out.println("  - Total: $" + bc.total(purchase_value));
		
	}
	
	static void printSilver_data (Silver_card sc, int purchase_value)
	{
		System.out.println("2. Silver:");
		System.out.println(" a. Mock data: turnover $" + sc.turnover + " , purchase value " + purchase_value + "$");
		System.out.println(" b. Output:\n");
		System.out.println("  - Purchase value: $" + purchase_value);
		System.out.println("  - Discount rate: " + sc.discount_rate + "%");
		System.out.println("  - Discount: $" + sc.calculateDisc(purchase_value));
		System.out.println("  - Total: $" + sc.total(purchase_value));
		
	}
	
	static void printGold_data (Gold_card gc, int purchase_value)
	{
		System.out.println("3. Gold:");
		System.out.println(" a. Mock data: turnover $" + gc.turnover + " , purchase value " + purchase_value + "$");
		System.out.println(" b. Output:\n");
		System.out.println("  - Purchase value: $" + purchase_value);
		System.out.println("  - Discount rate: " + gc.discount_rate + "%");
		System.out.println("  - Discount: $" + gc.calculateDisc(purchase_value));
		System.out.println("  - Total: $" + gc.total(purchase_value));
		
	}
	
	static void run()
	{
		Boolean end=false;
		Scanner sca = new Scanner(System.in);
		int p;
		while(!end)
		{
			System.out.println("Choose an option from the menu: ");
			System.out.println(" 1. Use Bronze card. ");
			System.out.println(" 2. Use Silver card. ");
			System.out.println(" 3. Use Gold card. ");
			System.out.println(" 4. Quit. ");
			int i = sca.nextInt();
			switch (i)
			{
			case 1:
				Bronze_card bc=useBCard();
				System.out.print("Enter purchase value: ");
				p=sca.nextInt();
				System.out.println();
				printBronze_data(bc, p);
				System.out.println();
				break;
			case 2:
				Silver_card sc=useSCard();
				System.out.print("Enter purchase value: ");
				p=sca.nextInt();
				System.out.println();
				printSilver_data(sc, p);
				System.out.println();
				break;
			case 3:
				Gold_card gc=useGCard();
				System.out.print("Enter purchase value: ");
				p=sca.nextInt();
				System.out.println();
				printGold_data(gc, p);
				System.out.println();
				break;
			case 4:
				end=true;
			}
		}
	}
}
	