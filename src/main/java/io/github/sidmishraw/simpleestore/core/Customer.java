/**
 * Project: simpleestore
 * Package: io.github.sidmishraw.simpleestore.core
 * File: Customer.java
 * 
 * @author sidmishraw
 *         Last modified: Jul 8, 2017 7:22:11 PM
 */
package io.github.sidmishraw.simpleestore.core;

/**
 * @author sidmishraw
 *
 *         Qualified Name: io.github.sidmishraw.simpleestore.core.Customer
 *
 *         A customer
 */
public class Customer {
	
	private String name;
	
	/**
	 * @param name
	 */
	public Customer(String name) {
		this.name = name;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
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
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		return result;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Customer other = (Customer) obj;
		if (this.name == null) {
			if (other.name != null) return false;
		} else if (!this.name.equals(other.name)) return false;
		return true;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [name=" + this.name + "]";
	}
}
