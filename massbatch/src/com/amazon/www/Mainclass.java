package com.amazon.www;


interface Animal {
void noise();
}
class Cat implements Animal
{
	public void noise()
	{
		System.out.println("meow");
	}
	}
class Dog implements Animal
{
	public void noise()
	{
		System.out.println("bow");
	}
	}
class Snake implements Animal
{
	public void noise()
	{
		System.out.println("buss");
	}
	}
class Stimulator{
	static void ansim(Animal a1)
	{
		a1.noise();
	}
}
public class Mainclass {
	public static void main(String[] arg)
	{
		Cat c1=new Cat();
		Dog d1=new Dog();
		Snake s1=new Snake();
		Stimulator.ansim(c1);
		Stimulator.ansim(d1);
		Stimulator.ansim(s1);
	}

}
