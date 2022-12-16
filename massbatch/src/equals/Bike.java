package equals;

public class Bike {
	String bike_brand;
	double bike_price;
	String bike_colour;
	public Bike(String bike_brand,double bike_price,String bike_colour)
	{
		this.bike_brand=bike_brand;
		this.bike_price=bike_price;
		this.bike_colour=bike_colour;
	}
	public boolean equal(Object obj)
	{
		Bike B2=(Bike)obj;
		return this.bike_price==B2.bike_price;
	}

	public static void main(String[] args) 
	{
		Bike B1=new Bike("Roayal enfied",75569.098,"black");
		Bike B2=new Bike("slender",80569.097,"gray");
		if(B1.equals(B2))
		{
			System.out.println("both Bikes price is equal");
		}
		else
		{
			System.out.println("not equal");
		}

	}

}
