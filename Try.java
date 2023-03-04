package Basic;

public class Try {

	public static void main(String[] args) {
		try {
			String s="abc";
			int a=Integer.parseInt(s);
			
		}
		catch(Exception e)
		{
			
			System.out.println(e);
		}
		System.out.println("hello");
		

	}

}