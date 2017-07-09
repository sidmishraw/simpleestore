# **EStore**
----

**Author**: Sidharth Mishra

**Version**: 0.0.1

----
> Note: All objects made explicitly by me are `Value` objects. These include `Customer`, `ShoppingCart`, `Item`, `CartState`, `EStore` and `EStoreDriver`.

> Note: This project too follows similar restrictions as `FJava` but not that strictly. The variables are not `active`.


## Briefing:
In this example, **EStore** is an **e-store** maintaining a large collection of shopping carts.

Each shopping cart has a customer, contains items and has a status: `BOOKED`, `PURCHASED`, `SHIPPED`.

The items can be added and removed to/from the shopping cart.

The `EStore` maintains a hash-map indexed by the shopping carts. Each cart is associated with its state.

Each time the state of the cart changes (items are added/removed, status changes) the old binding is deleted and a new binding is created that associates the same cart to the new state.

## Class Summary:
The project has the following classes:
* **Customer**: This is the customer. It is a `value` object.

* **Item**: This is an item. It is a `value` object.

* **CartStatus**: This is all the possible statuses of the shopping cart. It is an enum with values `BOOKED`, `PURCHASED`, `SHIPPED`

* **ShoppingCart**: This is the shopping cart. It has a `cartId` and `customer`. It is a `value` object. Used as the key in the hash map called `shoppingCarts` in `EStore.java`. The hashmap is a mapping between the shopping cart and its state.

* **CartState**: This represents the cart's state. The state of a cart is defined as the list of items it holds and it's status. This is a `value` object.

* **EStore**: This represents the e-store. It has the hashmap holding the mapping from the `ShoppingCart` to the `CartState`. It also exposes the `makeCart`, `addItem`, `removeItem` and `changeStatus` functionalities.

* **EStoreDriver**: This is the main driver code. It is the running example of this concept.

### Tools:
* Java -- JDK v1.8.0_131
* Eclipse Neon.3 v4.6.3