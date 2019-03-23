package pkg1;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test1 {

	 public void findDuplicateChars(String str){
         
		 System.out.println("added");
	        Map<Character, Integer> dupMap = new HashMap<Character, Integer>(); 
	        char[] chrs = str.toCharArray();
	        for(Character ch:chrs){
	            if(dupMap.containsKey(ch)){
	                dupMap.put(ch, dupMap.get(ch)+1);
	            } else {
	                dupMap.put(ch, 1);
	            }
	        }
	        Set<Character> keys = dupMap.keySet();
	        for(Character ch:keys){
	            if(dupMap.get(ch) > 1){
	                System.out.println(ch+"--->"+dupMap.get(ch));
	            }
	        }
	    }
	
	
	public static void main(String[] args) {

		Test1 dcs = new Test1();
        dcs.findDuplicateChars("AABB BBAA ABAB");
	   }
		

	}


