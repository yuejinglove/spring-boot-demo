/**
 * @Title: OrderPostForm.java
 * @Package com.example.demo.entity
 * @Description: TODO
 * @author ZhengYH
 * @date 2018-08-22 09:46
 * @version V1.0
 */
package com.example.demo.entity;

import com.example.demo.pojo.Order;

/**
 * @ClassName: OrderPostForm
 * @Description: TODO
 * @author ZhengYH
 * @date 2018-08-22 09:46
 */
public class OrderPostForm {
	private Order order;

	/**
	 * create a new object OrderPostForm.
	 *
	 * @param order
	 */
	public OrderPostForm(Order order) {
		super();
		this.order = order;
	}

	/**
	 * create a new object OrderPostForm.
	 *
	 */
	public OrderPostForm() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "OrderPostForm [order=" + order + "]";
	}

	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}
	
}
