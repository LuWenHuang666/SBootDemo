/**
 * 
 */
package com.spring.service;


import java.util.List;

import com.spring.model.ApiCase;

/**Description: 
 * 
 * @author luwenhuang
 * @date 2017年9月18日 上午11:30:32
 */
public interface ApiCaseService {

	/**
	 * 
	 */
	public ApiCase Save(ApiCase apiCase);
	
	public ApiCase update(ApiCase apiCase);
	
	public void delete(Integer id);
	
	public List<ApiCase> findAll();
	
	public List<ApiCase> findByApiId(Integer apiId);


}
