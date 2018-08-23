/**
 * @Title: Order.java
 * @Package com.example.demo.pojo
 * @Description: TODO
 * @author ZhengYH
 * @date 2018-08-22 09:44
 * @version V1.0
 */
package com.example.demo.pojo;

/**
 * @ClassName: Order
 * @Description: TODO
 * @author ZhengYH
 * @date 2018-08-22 09:44
 */
public class Order {
	private String id;
	private String name;
	private String des;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the des
	 */
	public String getDes() {
		return des;
	}
	/**
	 * @param des the des to set
	 */
	public void setDes(String des) {
		this.des = des;
	}
	/**
	 * create a new object Order.
	 *
	 * @param id
	 * @param name
	 * @param des
	 */
	public Order(String id, String name, String des) {
		super();
		this.id = id;
		this.name = name;
		this.des = des;
	}
	/**
	 * create a new object Order.
	 *
	 */
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", des=" + des + "]";
	}
	
}
