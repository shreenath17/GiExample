package newExmaple;
import java.util.ArrayList;
import java.util.HashMap;

public class hashMapExample { 
    static getData g = new getData();
    
    public static void main(String[] args) 
    { 
    	HashMap<String, String> map; 
    	System.out.println(g.sendData());
    	map=g.sendData();
    	System.out.println(map.get("URL0"));
    } 
   
    
}