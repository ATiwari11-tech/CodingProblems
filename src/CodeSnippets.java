
public class CodeSnippets {

	public static void main(String[] args) {
			System.out.println(testMethod());

	}
	public static int testMethod()
	{
		try
		{
				int i=10/2;
				return 10;
		}
		catch(Exception e)
		{
			System.out.println("line2");
			return 20;
		}
		finally
		{
			System.out.println("line3");
			return 30;
		}
	}

}
