package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class MaxElementfromGivenList {

	public static void main(String[] args) {
		  List<String> list = new ArrayList<String>();          
	      //Add values in the list  
	      list.add("A");  
	      list.add("B");  
	      list.add("E");  
	      list.add("C");  
	      list.add("S");                    
	      //Comparing using order of the specified comparable  
	      System.out.println("Max val: " + Collections.max(list,null));   
	      }  

	}


