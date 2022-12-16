package equals;

public class Likes {
	int facebook_likes_count;
	int insta_likes_count;
	public Likes(int facebook_likes_count,int insta_likes_count)
	{
		this.facebook_likes_count=facebook_likes_count;
		this.insta_likes_count=insta_likes_count;
	}
	public boolean equal(Object obj)
	{
		Likes L2=(Likes)obj;
		return this.facebook_likes_count==L2.facebook_likes_count;	
	}

	public static void main(String[] args) 
	{
		Likes L1=new Likes(56890,56890);
	 Likes L2=new Likes(56890,56890);
		if(L1.equals(L2))
		{
			System.out.println("both facebook like are equal");
		}
		else
		{
			System.out.println("not equal");
		}

	}
}
