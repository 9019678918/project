package Encapsulation;

class login
{
	private int pwd=456;
	public int getpwd(){
		return pwd;
	}
	public void setpwd(int pwd){
		this.pwd=pwd;
	}
	}
public class Mainclass2 {
	public static void main(String[] args)
	{
		login l=new login();
		System.out.println(l.getpwd());
		l.setpwd(789);
		System.out.println(l.getpwd());
	}

}
