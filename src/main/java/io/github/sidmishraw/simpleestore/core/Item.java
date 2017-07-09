/**
 * Project: simpleestore
 * Package: io.github.sidmishraw.simpleestore.core
 * File: Item.java
 * 
 * @author sidmishraw
 *         Last modified: Jul 8, 2017 7:23:44 PM
 */
package io.github.sidmishraw.simpleestore.core;

/**
 * @author sidmishraw
 *
 *         Qualified Name: io.github.sidmishraw.simpleestore.core.Item
 *
 *         An item
 */
public class Item {
	
	private String	itemId;
	private String	itemName;
	
	/**
	 * @param itemId
	 * @param itemName
	 */
	public Item(String itemId, String itemName) {
		this.itemId = itemId;
		this.itemName = itemName;
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
		result = prime * result + ((this.itemId == null) ? 0 : this.itemId.hashCode());
		result = prime * result
				+ ((this.itemName == null) ? 0 : this.itemName.hashCode());
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
		Item other = (Item) obj;
		if (this.itemId == null) {
			if (other.itemId != null) return false;
		} else if (!this.itemId.equals(other.itemId)) return false;
		if (this.itemName == null) {
			if (other.itemName != null) return false;
		} else if (!this.itemName.equals(other.itemName)) return false;
		return true;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Item [itemId=" + this.itemId + ", itemName=" + this.itemName + "]";
	}
	
	/**
	 * @return the itemId
	 */
	public String getItemId() {
		return this.itemId;
	}
	
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return this.itemName;
	}
}
