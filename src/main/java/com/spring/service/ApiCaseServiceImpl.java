/**
 * 
 */
package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.ApiCaseDao;
import com.spring.model.ApiCase;

/**Description: 
 * 
 * @author luwenhuang
 * @date 2017年9月18日 上午11:30:49
 */
@Service
public class ApiCaseServiceImpl implements ApiCaseService {

	@Autowired
	private ApiCaseDao apiCaseDao;

	 
	public ApiCase Save(ApiCase apiCase) {
		// TODO Auto-generated method stub
		return apiCaseDao.save(apiCase);
	}


	 
	
	public ApiCase update(ApiCase apiCase) {
		// TODO Auto-generated method stub
		return apiCaseDao.save(apiCase);
	}

	 

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		apiCaseDao.deleteById(id);
	}


	 

	public List<ApiCase> findAll() {
		// TODO Auto-generated method stub
		return apiCaseDao.findAll();
	}


	 

	public List<ApiCase> findByApiId(Integer apiId) {
		// TODO Auto-generated method stub
		return apiCaseDao.findByApiId(apiId);
	}
	


	
	
}
