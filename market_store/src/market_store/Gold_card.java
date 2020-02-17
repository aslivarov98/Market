package market_store;

public class Gold_card extends Card {
	
	public Gold_card()
	{
		this.owner=null;
		this.turnover = 0;
	}
	
	public Gold_card(int turnover, String owner)
	{
		this.owner=owner;
		this.turnover = turnover; 
		if (turnover/100>=10)
		{
			this.discount_rate=10.0;
		}
		else if(turnover/100>=1)
		{
			this.discount_rate=2.0+turnover/100;
		}
	}

}
