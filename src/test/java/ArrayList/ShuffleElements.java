package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleElements {
	public static void main(String args[]) {
		
	 ArrayList<String> list = new ArrayList<String>();
     list.add("Java");
     list.add("Cric");
     list.add("Play");
     list.add("Watch");
     list.add("Glass");
     list.add("Movie");
     list.add("Girl");
      
     Collections.shuffle(list);
     System.out.println("Results after shuffle operation:");
     for(String str: list)
     {
         System.out.println(str);
     }
      
     System.out.println(list);
     Collections.shuffle(list);
     System.out.println("Results after shuffle operation:");
     for(String str: list)
     {
         System.out.println(str);
     }
 }
}
