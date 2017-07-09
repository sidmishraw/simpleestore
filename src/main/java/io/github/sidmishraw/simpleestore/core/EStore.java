/**
 * Project: simpleestore
 * Package: io.github.sidmishraw.simpleestore.core
 * File: EStore.java
 * 
 * @author sidmishraw
 *         Last modified: Jul 8, 2017 7:35:09 PM
 */
package io.github.sidmishraw.simpleestore.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sidmishraw
 *
 *         Qualified Name: io.github.sidmishraw.simpleestore.core.EStore
 * 
 *         the main driver service
 */
public class EStore {
	
	private static final Map<ShoppingCart, CartState> shoppingCarts = new HashMap<>();
	
	/**
	 * Gets the shoppingcart
	 * 
	 * @param cartId
	 *            the cartId
	 * @param customerName
	 *            the customer name
	 * @return a shopping cart
	 */
	public static final ShoppingCart makeCart(String cartId, String customerName) {
		
		Customer customer = new Customer(customerName);
		
		ShoppingCart shoppingCart = new ShoppingCart(cartId, customer);
		
		shoppingCarts.put(shoppingCart, null);
		
		return shoppingCart;
	}
	
	/**
	 * Makes a new cart state from the list of items and status
	 * 
	 * @param items
	 *            the new list of items in the cart
	 * @param status
	 *            the new status of the cart
	 * 
	 * @return a new cart state
	 */
	private static final CartState makeNewCartState(List<Item> items, CartStatus status) {
		
		CartState state = new CartState(items, status);
		
		return state;
	}
	
	/**
	 * Adds the item to the particular cart
	 * 
	 * @param cart
	 *            the cart to add the item into
	 * @param item
	 *            the item to be added
	 */
	public static final void addItem(ShoppingCart cart, Item item) {
		
		CartState currentCartState = shoppingCarts.get(cart);
		
		List<Item> items;
		CartStatus status;
		
		if (null != currentCartState) {
			
			items = new ArrayList<>(currentCartState.getItems());
			status = currentCartState.getStatus();
		} else {
			
			items = new ArrayList<>();
			status = CartStatus.BOOKED;
		}
		
		items.add(item);
		
		CartState newCartState = makeNewCartState(items, status);
		
		shoppingCarts.put(cart, newCartState);
		
		System.out.println(
				cart.getCartId() + ": State changed from: " + currentCartState + " to "
						+ newCartState);
	}
	
	/**
	 * Adds the item to the particular cart
	 * 
	 * @param cart
	 *            the cart to add the item into
	 * @param item
	 *            the item to be added
	 */
	public static final void removeItem(ShoppingCart cart, Item item) {
		
		CartState currentCartState = shoppingCarts.get(cart);
		
		List<Item> items;
		CartStatus status;
		
		if (null != currentCartState) {
			
			items = new ArrayList<>(currentCartState.getItems());
			items.remove(item);
			
			status = currentCartState.getStatus();
		} else {
			
			items = new ArrayList<>();
			status = CartStatus.BOOKED;
		}
		
		CartState newCartState = makeNewCartState(items, status);
		
		shoppingCarts.put(cart, newCartState);
		
		System.out.println(
				cart.getCartId() + ": State changed from: " + currentCartState + " to "
						+ newCartState);
	}
	
	/**
	 * Changes the status of the cart to the new status
	 * 
	 * @param cart
	 *            the cart whose status is changing
	 * @param newStatus
	 *            the new status of the cart
	 */
	public static final void changeStatus(ShoppingCart cart, CartStatus newStatus) {
		
		CartState currentCartState = shoppingCarts.get(cart);
		
		List<Item> items;
		
		if (null != currentCartState) {
			
			items = new ArrayList<>(currentCartState.getItems());
		} else {
			
			items = new ArrayList<>();
		}
		
		CartStatus status = newStatus;
		
		CartState newCartState = makeNewCartState(items, status);
		
		shoppingCarts.put(cart, newCartState);
		
		System.out.println(
				cart.getCartId() + ": State changed from: " + currentCartState + " to "
						+ newCartState);
	}
}
