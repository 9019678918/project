package Encapsulation;

class ICICI
{
	private int pwd=1234;
	public int getpwd(){
		return pwd;
	}
	public void setpwd(int pwd){
		this.pwd=pwd;
	}
	}
public class Mainclass1 {
	public static void main(String[] args)
	{
		ICICI i=new ICICI();
		System.out.println(i.getpwd());
		i.setpwd(143);
		System.out.println(i.getpwd());
	}

}
