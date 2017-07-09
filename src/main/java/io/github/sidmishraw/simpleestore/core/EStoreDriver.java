/**
 * Project: simpleestore
 * Package: io.github.sidmishraw.simpleestore.core
 * File: EStoreDriver.java
 * 
 * @author sidmishraw
 *         Last modified: Jul 8, 2017 7:54:10 PM
 */
package io.github.sidmishraw.simpleestore.core;

/**
 * @author sidmishraw
 *
 *         Qualified Name: io.github.sidmishraw.simpleestore.core.EStoreDriver
 *
 *         Main driver for the program
 */
public class EStoreDriver {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ShoppingCart c1 = EStore.makeCart("c1", "John Doe");
		ShoppingCart c2 = EStore.makeCart("c2", "John Doe's wife");
		ShoppingCart c3 = EStore.makeCart("c3", "John Doe's son");
		ShoppingCart c4 = EStore.makeCart("c4", "John Doe's daughter");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		EStore.addItem(c1, new Item("x1", "Pizza"));
		EStore.addItem(c1, new Item("x1", "Pizza"));
		EStore.addItem(c1, new Item("x1", "Pizza"));
		EStore.addItem(c1, new Item("x1", "Pizza"));
		
		EStore.changeStatus(c2, CartStatus.SHIPPING);
	}
}
