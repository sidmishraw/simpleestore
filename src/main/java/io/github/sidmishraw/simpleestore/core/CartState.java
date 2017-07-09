/**
 * Project: simpleestore
 * Package: io.github.sidmishraw.simpleestore.core
 * File: CartState.java
 * 
 * @author sidmishraw
 *         Last modified: Jul 8, 2017 7:31:42 PM
 */
package io.github.sidmishraw.simpleestore.core;

import java.util.List;

/**
 * @author sidmishraw
 *
 *         Qualified Name: io.github.sidmishraw.simpleestore.core.CartState
 * 
 *         The state of the shopping cart [value object]
 */
public class CartState {
	
	private List<Item>	items;
	private CartStatus	status;
	
	/**
	 * @param items
	 * @param status
	 */
	public CartState(List<Item> items, CartStatus status) {
		this.items = items;
		this.status = status;
	}
	
	/**
	 * @return the items
	 */
	public List<Item> getItems() {
		return this.items;
	}
	
	/**
	 * @return the status
	 */
	public CartStatus getStatus() {
		return this.status;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ObjectId: " + this.hashCode() + " CartState [items=" + this.items
				+ ", status="
				+ this.status + "]";
	}
}
