package newExmaple;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderMethos {
	@Test(dataProvider="maths")
	public void testSum(int a , int b, int result) {
		int sum = a + b;
		Assert.assertEquals(sum, result);
	}
	@Test(dataProvider="maths")
	public void testDiff(int a, int b, int result) {
		int diff = a - b;
		Assert.assertEquals(result, diff);
	}
	
	@DataProvider(name="maths")
	public Object[][] maths(Method m){
		switch(m.getName()) {
		case "testSum": 
		 return new Object[][] {{2, 3 , 5}};
		 case "testDiff": 
		 return new Object[][] {{4, 3, 1}};
			 
		}
		return null;		
	}
}
