package Tostring;

public class Car {
	int car_cost;
	String mod_name;
	String car_type;
	Car(int car_cost,String mod_name,String car_type)
	{
		this.car_cost=car_cost;
		this.mod_name=mod_name;
		this.car_type=car_type;
	}
	public String toString()
	{
		return "car cost is "+this.car_cost+"car model name"+this.mod_name+" car type is"+this.car_type;
	}
	public static void main(String[] args)
	{
		Car m1=new Car(250000,"seltos","petrol");
		System.out.println(m1.toString());
	}

}
