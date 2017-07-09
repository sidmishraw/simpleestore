/**
 * Project: simpleestore
 * Package: io.github.sidmishraw.simpleestore.core
 * File: ShoppingCart.java
 * 
 * @author sidmishraw
 *         Last modified: Jul 8, 2017 7:26:24 PM
 */
package io.github.sidmishraw.simpleestore.core;

/**
 * @author sidmishraw
 *
 *         Qualified Name: io.github.sidmishraw.simpleestore.core.ShoppingCart
 *
 *         Shopping Cart [value object]
 */
public class ShoppingCart {
	
	private String		cartId;
	private Customer	customer;
	
	/**
	 * @param cartId
	 * @param customer
	 */
	public ShoppingCart(String cartId, Customer customer) {
		this.cartId = cartId;
		this.customer = customer;
	}
	
	/**
	 * @return the cartId
	 */
	public String getCartId() {
		return this.cartId;
	}
	
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return this.customer;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.cartId == null) ? 0 : this.cartId.hashCode());
		return result;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ShoppingCart)) {
			return false;
		}
		ShoppingCart other = (ShoppingCart) obj;
		if (this.cartId == null) {
			if (other.cartId != null) {
				return false;
			}
		} else if (!this.cartId.equals(other.cartId)) {
			return false;
		}
		return true;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ShoppingCart [cartId=" + this.cartId + ", customer=" + this.customer
				+ "]";
	}
}
