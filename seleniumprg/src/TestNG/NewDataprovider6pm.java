package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewDataprovider6pm {
  @Test(dataProvider = "login")
  public void loginmethod(String usernam, String password) {
	  System.out.println(usernam);
	  System.out.println(password);
  }

  @DataProvider
  public Object[][] login() {
    return new Object[][] {
      new Object[] { "saritha", "xxx" },
      new Object[] { "chary", "yyy" },
      new Object[] { "chary", "yyy" },
    };
  }
}
