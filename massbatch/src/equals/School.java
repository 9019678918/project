package equals;

public class School {
	String school_name;
	int school_strength;

	 School(String school_name,int school_strength) 
	{
	this.school_name=school_name;
	this.school_strength=school_strength;
	}
	public boolean equals(Object obj)
	{
		School S2=(School)obj;
		return this.school_strength==S2.school_strength;
	}
	public static void main(String[] args) 
	{
		School S1=new School("SJC",5000);
		School S2=new School("ku",4000);
		if(S1.equals(S2))
		{
			System.out.println("same strength");
		}
		else
		{
			System.out.println("different strength");
		}
	}
}
