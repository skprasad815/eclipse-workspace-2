package exceptions;

public class Exceptionprg {

	public static void main(String[] args) throws Exception,ArithmeticException {
		// TODO Auto-generated method stub

		
		final int a1=10;
		//a1++;
		System.out.println("hi");
		try {
			int a=10/10;	
			System.out.println(a);
		}
//		catch (ArithmeticException e) {
//			System.out.println(e);
//		}
//		catch (Exception e2) {
//			// TODO: handle exception
//			System.out.println(e2);
//			
//		}
		finally
		{
			System.out.println("this is handling exception");
		}
//		
//		System.out.println("end");
	}

}
