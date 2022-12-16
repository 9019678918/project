package Abstraction;

interface  Bike
{
	public void sound();
	}
class Rx_100 implements Bike
{
	public void sound()
	{
		System.out.println("Rx_100 sound");
	}
	}
class Pulsar implements Bike
{
	public void sound()
	{
		System.out.println("pulsar sound");
	}
	}
class Bmw implements Bike
{
	public void sound()
	{
		System.out.println("bmw sound");
	}
	}
class Stimulator
{
public static void ansim(Bike b)
	{
		b.sound();
	}
	}
public class Mainclass {

	public static void main(String[] args)
	{
		Rx_100 r=new Rx_100();
		Pulsar p=new Pulsar();
		Bmw b=new Bmw();
		Stimulator.ansim(r);
		Stimulator.ansim(p);
		Stimulator.ansim(b);
	}
}
