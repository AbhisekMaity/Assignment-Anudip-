package Assignment1;

import java.util.Collections;
import java.util.LinkedList;

public class ShuffleTheElement {
  public static void main(String[] args) {
	  LinkedList<Integer> list = new LinkedList<>();
		list.add(34);
		list.add(67);
		list.add(57);
		list.add(23);
		for(int val:list) {
			System.out.println(val);
		}
		System.out.println("After suffle the list is ");
		
		Collections.shuffle(list);
		for(int val:list) {
			System.out.println(val);
		}
    }
}
