package Assignment_6_Q2;

import java.util.*;
import java.util.Map.Entry;


public class TreeMapReverse {
	public static void main(String args[]) {
		 
		// Use reverseOrder() method in the constructor
		Map<String, String> treeMap = new TreeMap<String, String>(Collections.reverseOrder());
	    
	    // Put elements to treeMap
		treeMap.put("Key1", "Jack");
		treeMap.put("Key2", "Rick");
		treeMap.put("Key3", "Kate");
		treeMap.put("Key4", "Tom");
		treeMap.put("Key5", "Steve");
	    
	    //System.out.println("TreeMap in reverse order: "  + treeMap);

	    Set<Entry<String, String>> set = treeMap.entrySet();
	    Iterator<Entry<String, String>> i = set.iterator();
	    
	    // Display elements	    
	    while(i.hasNext()) {
	      @SuppressWarnings("rawtypes")
		Map.Entry name = (Map.Entry)i.next();
	      System.out.print(name.getKey() + ": ");
	      System.out.println(name.getValue());
	    }
	  }

}
