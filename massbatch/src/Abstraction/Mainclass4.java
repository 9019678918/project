package Abstraction;

interface Animal
{
	void sound();
	}
class Tiger implements Animal
{
	public void sound()
	{
		System.out.println("tiger sound");
	}
	}
class Lion implements Animal
{
	public void sound()
	{
		System.out.println("lion sound");
	}
	}
class Cheetah implements Animal
{public void sound()
	{
	System.out.println("cheetah sound");
	}
	}
class Sound
{
	static void sounded(Animal a1)
	{
		a1.sound();
	}
	}
public class Mainclass4 {
	public static void main(String[] args)
	{
		Tiger t=new Tiger();
		Lion l=new Lion();
		Cheetah c=new Cheetah();
		Sound.sounded(t);
		Sound.sounded(l);
		Sound.sounded(c);
		
	}
}
