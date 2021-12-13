package HashMap;

import java.util.HashMap;
import java.util.Set;

public class GetallKeys {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for(String key: keys){
            System.out.println(key);
        }

	}

}
