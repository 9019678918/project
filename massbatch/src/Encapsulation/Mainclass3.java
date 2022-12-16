package Encapsulation;

class phone
{
	private String pwd="m1234";
	public String getpwd(){
		return pwd;
	}
	public void setpwd(String pwd){
		this.pwd=pwd;
	}
	}
public class Mainclass3 {
	public static void main(String[] args)
	{
		phone p=new phone();
		System.out.println(p.getpwd());
		p.setpwd("m456");
		System.out.println(p.getpwd());
	}

}
