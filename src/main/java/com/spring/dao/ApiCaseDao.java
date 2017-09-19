/**
 * 
 */
package com.spring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.ApiCase;

/**Description: 
 * 
 * @author luwenhuang
 * @date 2017年9月18日 上午11:30:04
 */
public interface ApiCaseDao extends JpaRepository<ApiCase, Integer>{

	/**
	 * 
	 */
	
	public List<ApiCase> findByApiId(Integer apiId);


}
