package exceptions;

public class Fianally_And_Final {

	
	public static void main(String[] args) {
		final int s=100; // cannot change value
		//s=101;

		try{
			// establish connection
			// fire a query
			// get the results
			// close connection
			//int i=9/0;
			return;
			
		}catch(Exception e){
			// error
			System.out.println(e);
		}finally{
			// close the connection if establed
			System.out.println("in finally");
		}
		
		
		
		
		
		
		
		
	}

}
