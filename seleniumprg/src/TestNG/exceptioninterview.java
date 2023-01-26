package TestNG;

public class exceptioninterview {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		try{

			System.out.println("Hello");
			int num = 100/0;

			System.out.println("Division done");
		}
		catch(Exception e){
			e.printStackTrace();

			}
//		catch(Exception e){
//		e.printStackTrace();
//
//		}

	}
}
