package equals;

public class Car {
	String car_brand;
	double car_price;
	String car_colour;

	public Car(String car_brand,double car_price,String car_colour)
	{
		this.car_brand=car_brand;
		this.car_price=car_price;
		this.car_colour=car_colour;
	}
	public boolean equals(Object obj)
	{
		Car C2=(Car)obj;
		return this.car_price==C2.car_price;
	}

	public static void main(String[] args) 
	{
		Car C1=new Car("BMW",7556903.098,"black");
		Car C2=new Car("JAGUAR",8056934.097,"gray");
		if(C1.equals(C2))
		{
			System.out.println("both cars price is equal");
		}
		else
		{
			System.out.println("not equal");
		}

	}

}
