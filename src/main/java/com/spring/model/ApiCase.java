/**
 * 
 */
package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**Description: 
 * 
 * @author luwenhuang
 * @date 2017年9月14日 下午3:53:10
 */
@Entity //加入这个注解，Demo就会进行持久化了
@Table(name="t_api_test_data")
public class ApiCase {
	
	@Id
	@GeneratedValue //主键，自动递 增
	private Integer id;
	@Column(name="apiId")
	private Integer apiId; //关联接口请求id
	@Column(name="requestDataType")
	private String requestDataType; //请求数据类型 Form表单、Data文本、File上传文件
	@Column(name="requestData")
	private String requestData; //请求数据内容 JSON串  支持参数化
	@Column(name="encryption")
	private String encryption; //数据是否编码加密 NO、MD5、DES
	@Column(name="checkPoint")
	private String checkPoint; //断言  检查点 
	@Column(name="correlation")
	private String correlation; //关联 与RequestData中的参数化做关联 ，关联接口  和  参数化测试数据
	@Column(name="active")
	private boolean active; //是否执行测试
	
	

	/**
	 * 
	 */
	public ApiCase() {
	
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
	 * @return the apiId
	 */
	public Integer getApiId() {
		return apiId;
	}



	/**
	 * @param apiId the apiId to set
	 */
	public void setApiId(Integer apiId) {
		this.apiId = apiId;
	}



	/**
	 * @return the requestDataType
	 */
	public String getRequestDataType() {
		return requestDataType;
	}



	/**
	 * @param requestDataType the requestDataType to set
	 */
	public void setRequestDataType(String requestDataType) {
		this.requestDataType = requestDataType;
	}



	/**
	 * @return the requestData
	 */
	public String getRequestData() {
		return requestData;
	}



	/**
	 * @param requestData the requestData to set
	 */
	public void setRequestData(String requestData) {
		this.requestData = requestData;
	}



	/**
	 * @return the encryption
	 */
	public String isEncryption() {
		return encryption;
	}



	/**
	 * @param encryption the encryption to set
	 */
	public void setEncryption(String encryption) {
		this.encryption = encryption;
	}



	/**
	 * @return the checkPoint
	 */
	public String getCheckPoint() {
		return checkPoint;
	}



	/**
	 * @param checkPoint the checkPoint to set
	 */
	public void setCheckPoint(String checkPoint) {
		this.checkPoint = checkPoint;
	}



	/**
	 * @return the correlation
	 */
	public String getCorrelation() {
		return correlation;
	}



	/**
	 * @param correlation the correlation to set
	 */
	public void setCorrelation(String correlation) {
		this.correlation = correlation;
	}



	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}



	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}




}
