/**
 * 
 */
package com.spring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.ApiName;


/**Description: 
 * 
 * @author luwenhuang
 * @date 2017年8月18日 下午3:14:35
 */
public interface ApiJpaDao extends JpaRepository<ApiName, Integer> {

	/**Description: 
	 * @param apiHost
	 * void
	 * @author luwenhuang
	 * @date 2017年9月15日 下午4:57:14
	 */
	// 单条件查询   会生成where ApiHost=?
	List<ApiName> findByApiHost(String ApiHost);
	//and组合查询  会生成 where ApiName=? And ApiHost=?
	List<ApiName> findByApiNameAndApiHost(String ApiName, String ApiHost);
	
	





}
