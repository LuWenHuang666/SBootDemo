/**
 * 
 */
package com.spring.model;
import java.util.Date;
/**Description: 实体类
 * 
 * @author luwenhuang
 * @date 2017年8月15日 下午5:31:04
 */
public class User {

	private int id;
	private String name;
	private Date date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
