package Abstraction;

interface Zomato
{
	void order();
	}
class Hotel1 implements Zomato
{
	public void order()
	{
		System.out.println("hotel1 order");
	}
	}
class Hotel2 implements Zomato
{
	public void order()
	{
		System.out.println("hotel2 order");
	}
	}
class Hotel3 implements Zomato
{
	public void order()
	{
		System.out.println("hotel3 order");
	}
	}
class Order
{
	static void ordered(Zomato z)
	{
		z.order();
	}
	}
public class Mainclass2 {
public static void main(String[] args)
{
	Hotel1 h1=new Hotel1();
	Hotel2 h2=new Hotel2();
	Hotel3 h3=new Hotel3();
	Order.ordered(h1);
	Order.ordered(h2);
	Order.ordered(h3);
	}
}
