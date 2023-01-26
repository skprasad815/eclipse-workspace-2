
public class TestUtils extends TestBase {

	
	public static void doLogin(String username,String password) throws InterruptedException
	
	
	{
		
		
		if(isLoggedin)
		{
			return;
			
		}
	getObject("loginusername").sendKeys(username);
	getObject("loginpasssword").sendKeys(password);
	getObject("signin").click();
	Thread.sleep(3000L);
if(webdriver.findElements(By.xpath(objectsPropeties.getProperty("logoutpath"))).size()!=0){
	
	
isLoggedin=true;
	}else 
	{
		isLoggedin=false;
	}
}
	

	
	
	
	
	
	
	public static boolean isSkip(String testcase)
	{
		
		System.out.println(datatable.getRowCount("Suites"));
		
		for(int rowNum=2;rowNum<=datatable.getRowCount("Suites");rowNum++)
		{
		
			
		
			if( testcase.equals(datatable.getCellData("Suites", 0, rowNum)))
					{
				
				System.out.println();
				if(datatable.getCellData("Suites", 2, rowNum).equals("Y"))
				{
		return false;
				}else 
					return true;
					}
		}
		
		return false ;
		

	}
	
	public static Object[][]  getDdata(String testName)
	{
	
		
		if( datatable==null)
		{
			 datatable  =new Xls_Reader("D:\\apache-ant-1.9.2\\etc\\Frameworks\\src\\configurations\\Testsuite.xlsx");
				
		}
		int rownum=datatable.getRowCount(testName)-1;
		int colnum=datatable.getColumnCount(testName);
		
		
		if(rownum<=0)
		{
			Object testdata[][] =new Object[1][0];

		return testdata;
		}
		
		rownum=datatable.getRowCount(testName);
	     System.out.println("number of rows is" +rownum);
		System.out.println("number of columns is "+colnum);
		System.out.println("testname is "+testName);
		
		Object testdata[][] =new Object[rownum][colnum];
		
		
		for(int rows=2;rows<=rownum;rows++)
		{
			for(int cols=0;cols<colnum;cols++)
			{
				 testdata[rows-2][cols]=datatable.getCellData(testName, cols, rows);
				
			}
		
		}
		 return testdata;
	}
		
		
	public static void takeScreenShot(String filename) throws IOException
	{
		File a =((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(a, new File("D:\\apache-ant-1.9.2\\etc\\Frameworks\\src\\output\\"+filename+".jpg"));
	}
	}
	



}
