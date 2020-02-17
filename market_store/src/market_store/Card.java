package market_store;

public class Card {
	
	public String owner;
	public Integer turnover;
	public Double discount_rate;
	
	public double calculateDisc(double purchase_value)
	{
		double disc=0;
		disc=purchase_value/100*this.discount_rate;
		return disc;
	}
	
	public double total(double purchase_value)
	{
		double t=purchase_value;
		t-=this.calculateDisc(purchase_value);
		return t;
	}
	
}
