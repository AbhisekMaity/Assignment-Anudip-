package Assignment1;

import java.util.Collections;
import java.util.LinkedList;

public class SwapTwoElement {
 public static void main(String[] args) {
	 LinkedList<Integer> list = new LinkedList<>();
		list.add(34);
		list.add(67);
		list.add(57);
		list.add(23);
		for(int val:list) {
			System.out.println(val);
		}
		Collections.swap(list, 0, 1);
		
		System.out.println("After swaping the values are:");
		
		for(int val:list) {
			System.out.println(val);
		}
		
}
}
