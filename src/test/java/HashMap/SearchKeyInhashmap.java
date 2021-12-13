package HashMap;

import java.util.HashMap;

public class SearchKeyInhashmap {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        if(hm.containsKey("fifth")){
            System.out.println("The hashmap contains key fifth");
        } else {
            System.out.println("The hashmap does not contains key fifth");
        }
        if(hm.containsKey("third")){
            System.out.println("The hashmap contains key third");
        } else {
            System.out.println("The hashmap does not contains key third");
        }

	}

}
