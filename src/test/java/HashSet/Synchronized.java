package HashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Synchronized {

	public static void main(String[] args) {
		Set<String> ss = new HashSet<String>();
        Set<String> sysSet = Collections.synchronizedSet(ss);
        System.out.println("Synchronized set got created...");

	}

	}

