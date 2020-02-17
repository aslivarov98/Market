package market_store;

public class Main extends PayDesk {
	public static void main (String []args)
	{
		Bronze_card bc1 = new Bronze_card(0, "User1");
		printBronze_data(bc1, 150);
		System.out.println();
		
		Silver_card sc1 = new Silver_card(600, "User2");
		printSilver_data(sc1, 850);
		System.out.println();
		
		Gold_card gc1 = new Gold_card(1500, "User3");
		printGold_data(gc1, 1300);
		System.out.println();
		
		run();
		
	}
}
