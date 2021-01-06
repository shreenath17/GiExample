package newExmaple;

import java.util.*;

public class getData {
	static HashMap<String, String> map;
public HashMap<String, String> sendData() {
	map = new HashMap<>(); 	
	map.put("URL0", "http://google.com/");
    map.put("URL1", "http://facebook.com/"); 
	map.put("username","Shreenath");
	map.put("passCode","Welcome@123");
	return map;
	 
}
}
