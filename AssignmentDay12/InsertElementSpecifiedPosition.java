package Assignment1;

import java.util.LinkedList;

public class InsertElementSpecifiedPosition {
   public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<>();
	list.add(34);
	list.add(67);
	list.add(57);

	list.add(23);

//	list.add(6,34); // here we will get error becauen array index outofbound exception 
	
	list.add(2,62); // now this is okay in the second index that means third position 62 will be added
	
	
	
	System.out.println(list);
	
}
}
