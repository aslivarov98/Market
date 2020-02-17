package market_store;

public class Silver_card extends Card {
	
	public Silver_card()
	{
		this.owner=null;
		this.turnover = 0;
	}
	
	public Silver_card(int turnover, String owner)
	{
		this.owner=owner;
		this.turnover = turnover;
		if (turnover>300)
		{
			this.discount_rate=3.5;
		}
		else
		{
			this.discount_rate=2.0;
		}
	}

}
