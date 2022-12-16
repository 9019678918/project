package Encapsulation;
class Irctc
{
	private String pwd="m1234";
	public String getpwd(){
		return pwd;
	}
	public void setpwd(String pwd){
		this.pwd=pwd;
	}
	}
public class Mainclass4 {
	public static void main(String[] args)
	{
		Irctc i=new Irctc();
		System.out.println(i.getpwd());
		i.setpwd("m456");
		System.out.println(i.getpwd());
	}


}
