/**
 * 
 */
package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.ApiName;

/**Description: 
 * 
 * @author luwenhuang
 * @date 2017年8月18日 下午3:33:15
 */
public interface ApiService{
	
	//保存
	public ApiName save(ApiName apiName);
	
	
	//更新
	public ApiName update(ApiName apiName);
	
	//删除
	public void delete(Integer id);
	
	//查询返回所有列表
	public List<ApiName> findAll();
	
	//查询一条记录
	public Optional<ApiName> findOne(Integer id);
	
	//通过host查询
	public List<ApiName> findByApiHost(String ApiHost);

	
	//通过name 、host查询
	public List<ApiName> findByApiNameAndApiHost(String ApiName, String ApiHost);
}
