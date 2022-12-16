package equals;

public class Bottle {
	String bottle_brand;
	int bottle_price;

	 Bottle(String bottle_brand,int bottle_price) 
	{
	this.bottle_brand=bottle_brand;
	this.bottle_price=bottle_price;
	}
	public boolean equals(Object obj)
	{
		Bottle b2=(Bottle)obj;
		return this.bottle_price==b2.bottle_price;
	}
	public static void main(String[] args) 
	{
		Bottle b1=new Bottle("SJC",5000);
		Bottle b2=new Bottle("ku",4000);
		if(b1.equals(b2))
		{
			System.out.println("both bottle have same brand names");
		}
		else
		{
			System.out.println("both bottle have different brand name");
		}
	}
}
