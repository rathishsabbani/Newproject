package ArrayList;

import java.util.ArrayList;

public class ArrayListClone {

	public static void main(String[] args) {

		{

			// Creating an empty ArrayList
			ArrayList<String> list = new ArrayList<String>();

			// Use add() method
			// to add elements in the list
			list.add("Hello");
			list.add("for");
			list.add("Geeks");
			list.add("10");
			list.add("20");

			// Displaying the list
			System.out.println("First ArrayList: "
					+ list);

			// Creating another linked list and copying
			ArrayList sec_list = new ArrayList();
			sec_list = (ArrayList)list.clone();

			// Displaying the other linked list
			System.out.println("Second ArrayList is: "
					+ sec_list);
		}
	}
}


