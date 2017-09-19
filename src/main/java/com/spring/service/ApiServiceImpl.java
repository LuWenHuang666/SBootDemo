
package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.ApiJpaDao;
import com.spring.model.ApiName;

/**Description: 
 * 
 * @author luwenhuang
 * @date 2017年8月18日 下午3:35:31
 */
@Service  //要加这个注解 表示 为service层，才会自动扫描关生成beans
public class ApiServiceImpl implements ApiService {
	
	@Autowired  //加这个注解会自动new
	private ApiJpaDao apiJpaDao;

	
	public ApiName save(ApiName apiName) {
		return apiJpaDao.save(apiName);
	}
	
	public ApiName update(ApiName apiName) {
		return apiJpaDao.save(apiName);
	}
	
	public void delete(Integer id){
		apiJpaDao.deleteById(id);
		
	}
	
	public List<ApiName> findAll() {
		return apiJpaDao.findAll();
	}
	
	public Optional<ApiName> findOne(Integer id) {
		return apiJpaDao.findById(id);
	}
	

	

	
	public List<ApiName> findByApiHost(String ApiHost){
		return apiJpaDao.findByApiHost(ApiHost);
	}

	/* (non-Javadoc)
	 * @see com.spring.service.ApiService#findByApiNameAndApiHost(java.lang.String, java.lang.String)
	 */
	@Override
	public List<ApiName> findByApiNameAndApiHost(String ApiName, String ApiHost) {
		// TODO Auto-generated method stub
		return apiJpaDao.findByApiNameAndApiHost(ApiName, ApiHost);
	}


	

}
