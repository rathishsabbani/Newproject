
public class Throws {

	public static void main(String[] args) {
		try
		{
			Calculate();
		}
		catch(Exception e)
		{
			System.out.println("catch");
		}
	}
	public static void Calculate()throws Exception
	{
		int a=10,b=0,c;
		c=a/b;

	}

}
