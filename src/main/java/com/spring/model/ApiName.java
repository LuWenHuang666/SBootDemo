/**
 * 
 */
package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**Description: 
 * 
 * @author luwenhuang
 * @date 2017年8月18日 下午2:30:47
 */
@Entity //加入这个注解，Demo就会进行持久化了
@Table(name="t_api_request_info")
public class ApiName {
	
	@Id
	@GeneratedValue //主键，自动递 增
	private Integer id;
	@Column(name="apiName")
	private String apiName; //接口名称
	@Column(name="apiHost")
	private String apiHost; //接口地址
	@Column(name="requestUrl")
	private String requestUrl; //接口请求地址
	@Column(name="requestMethod")
	private String requestMethod; //接口请求方法

	public ApiName() {
		
	}



	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}



	/**
	 * @return the apiName
	 */
	public String getApiName() {
		return apiName;
	}



	/**
	 * @param apiName the apiName to set
	 */
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}



	/**
	 * @return the apiHost
	 */
	public String getApiHost() {
		return apiHost;
	}



	/**
	 * @param apiHost the apiHost to set
	 */
	public void setApiHost(String apiHost) {
		this.apiHost = apiHost;
	}



	/**
	 * @return the requestUrl
	 */
	public String getRequestUrl() {
		return requestUrl;
	}



	/**
	 * @param requestUrl the requestUrl to set
	 */
	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}



	/**
	 * @return the requestMethod
	 */
	public String getRequestMethod() {
		return requestMethod;
	}



	/**
	 * @param requestMethod the requestMethod to set
	 */
	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}
	

}
