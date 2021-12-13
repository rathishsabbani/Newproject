package Linkedlist;

import java.util.LinkedList;

public class Readfirstelementfromll {

	public static void main(String[] args) {
		 LinkedList<String> arrl = new LinkedList<String>();
	        arrl.add("First");
	        arrl.add("Second");
	        arrl.add("Third");
	        arrl.add("Random");
	        System.out.println("First Element: "+arrl.element());
	        System.out.println("First Element: "+arrl.getFirst());
	        System.out.println("First Element: "+arrl.peek());
	        System.out.println("First Element: "+arrl.peekFirst());


	}

}
