package app;

import model.doublylinkedlist.LinkedPositionalList;

public class App {

	public static void main(String [] args) {
		
		LinkedPositionalList<Integer>list = new LinkedPositionalList<>();
		
		list.addFirst(2);
		System.out.println("list size  --> "+ list.size());
		list.addFirst(3);
		list.addFirst(4);
		list.addLast(5);
		System.out.println("list size  --> "+ list.size());
		
		
		
	}
}
