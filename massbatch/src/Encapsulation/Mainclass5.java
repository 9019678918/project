package Encapsulation;
class Atm
{
	private int pwd=1234;
	public int getpwd(){
		return pwd;
	}
	public void setpwd(int pwd){
		this.pwd=pwd;
	}
	}
public class Mainclass5 {
	public static void main(String[] args)
	{
		Atm a=new Atm();
		System.out.println(a.getpwd());
		a.setpwd(143);
		System.out.println(a.getpwd());
	}

}
