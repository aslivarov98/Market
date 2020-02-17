package market_store;

public class Bronze_card extends Card {
	
	public Bronze_card()
	{
		this.owner=null;
		this.turnover = 0;
	}
	
	public Bronze_card(int turnover, String owner)
	{
		this.owner=owner;
		this.turnover = turnover;
		if(turnover>100 && turnover<300)
		{
			this.discount_rate=1.0;
		}
		else if (turnover>300)
		{
			this.discount_rate=2.5;
		}
		else
		{
			this.discount_rate=0.0;
		}
	}

}


