import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map_test {


 public static void main(String[] args) {
	
	TreeMap<String , Object>  map = new TreeMap<String , Object>();

//	 Map<String,Object> map=new HashMap<String,Object>();
	 
	map.put("5", "tom2");
	map.put("3", false);
	
	StringBuffer stb=new StringBuffer();
	
	for(Entry<String,Object>entry:map.entrySet()) {
		
		stb.append(entry.getKey() );
		
		stb.append(",");
		
		stb.append(entry.getValue());
		
    	stb.append("\n");
		
	}
	System.out.println(stb);
 }
}
