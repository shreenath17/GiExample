package newExmaple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class testNGInvokeClass {
	static getData g = new getData();
	static getTestCase tc = new getTestCase();
	static HashMap<String, String> map; 
	static ArrayList<Class> a;
	public static Class testCase;
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {	
		map = g.sendData();
		a= tc.getTestClass();
		try {
			System.out.println("Example TESTNG CLASS");
			TestListenerAdapter t = new TestListenerAdapter();
			XmlSuite suite = new XmlSuite();
			suite.setName("Example");										//name of suite
			XmlTest test;
			for(int i = 0;i<a.size();i++) {	
				String param = map.get("URL"+i);
				test = new XmlTest(suite);									//assigning the test to the declared suite
				System.out.println( a.get(i) +"  Running...");
				test.setName("Example"+i);					//name of individual tests
				test.addParameter("URL", param);
				List<XmlClass> classes = new ArrayList<XmlClass>();	
				classes.add(new XmlClass( a.get(i)));				//class to be executed			
				test.setXmlClasses(classes) ;								//adding class to the test
			}	
			List<XmlSuite> suites = new ArrayList<XmlSuite>();
			suites.add(suite);												//adding the suite
			TestNG tng = new TestNG();	
			tng.setXmlSuites(suites);										//adding suite to testng 
			tng.addListener(t);											//adding listener to testng
			tng.run();														//executing tstng
		}catch(Exception e){
			e.printStackTrace();
		}
	}  
}


