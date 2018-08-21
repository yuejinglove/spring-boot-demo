/**
 * @Title: User.java
 * @Package com.example.demo.pojo
 * @Description: TODO
 * @author ZhengYH
 * @date 2018-08-21 15:09
 * @version V1.0
 */
package com.example.demo.pojo;

/**
 * @ClassName: User
 * @Description: TODO
 * @author ZhengYH
 * @date 2018-08-21 15:09
 */
public class User {
	private Long id;
	private String name;
	private Integer age;
	
	/**
	 * create a new object User.
	 *
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * create a new object User.
	 *
	 * @param id
	 * @param name
	 * @param age
	 */
	public User(Long id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/*
	 * <p>Title: toString</p>
	 * <p>Description: </p>
	 * @return
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
