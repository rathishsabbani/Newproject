package Linkedlist;

import java.util.LinkedList;

public class ReadlastelementfromLL {

	public static void main(String[] args) {
		  LinkedList<String> arrl = new LinkedList<String>();
	        arrl.add("First");
	        arrl.add("Second");
	        arrl.add("Third");
	        arrl.add("Random");
	        System.out.println("Last Element: "+arrl.getLast());
	        System.out.println("Last Element: "+arrl.peekLast());
	    }

	}

