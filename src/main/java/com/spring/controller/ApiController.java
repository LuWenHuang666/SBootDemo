/**
 * 
 */
package com.spring.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.ApiCase;
import com.spring.model.ApiName;
import com.spring.service.ApiCaseService;
import com.spring.service.ApiService;

/**Description: 
 * 
 * @author luwenhuang
 * @date 2017年8月18日 下午3:11:04
 */

@RestController
@SpringBootApplication
@RequestMapping("/api")
public class ApiController {
	
	@Autowired
	private ApiService apiService;

	
	/**
	 *保存测试数据 
	 */
	@GetMapping("/saveget")
	public ApiName saveget() {
		ApiName apiName = new ApiName();
		//apiName.setId(1);
		apiName.setApiName("GET接口测试");
		apiName.setApiHost("http://www.baidu.com");
		apiName.setRequestUrl("/test");
		apiName.setRequestMethod("get");
		return apiService.save(apiName);
		//return "GET保存成功";
	}
	
	@PostMapping("/savepost")
	public String savepost() {
		ApiName apiName = new ApiName();
		//apiName.setId(1);
		apiName.setApiName("POST接口测试");
		apiName.setApiHost("http://www.baidu.com");
		apiName.setRequestUrl("/test");
		apiName.setRequestMethod("get");
		apiService.save(apiName);
		return "POST保存成功";
	}
	

	//可以不单个字段写传参，直接传model对象ApiName
	@RequestMapping(value = "/save") //简单类型的绑定，可以出来get和post  http://localhost:8080/index/get?name=wujing    http://localhost:8080/index/get?name=无境
	public ApiName save(ApiName apiName) {
		return apiService.save(apiName);
	}
	
	
	//按id更新 @PutMapping根据主键存在就更新，不存在就插入 可以用put 或 post请求   http://localhost:8081/api/apinaem/1
	@PutMapping(value = "/update/{id}")
	public ApiName findon(@PathVariable("id") Integer id,
						@RequestParam("ApiName") String ApiName,
						@RequestParam("ApiHost") String ApiHost,
						@RequestParam("RequestUrl") String RequestUrl,
						@RequestParam("RequestMethod") String RequestMethod) {
		ApiName apiName = new ApiName();
		apiName.setId(id);
		apiName.setApiName(ApiName);
		apiName.setApiHost(ApiHost);
		apiName.setRequestUrl(RequestUrl);
		apiName.setRequestMethod(RequestMethod);
		return apiService.update(apiName);
	}
	
	//按id删除
	@DeleteMapping(value = "/delete/{id}")
	public String deleter(@PathVariable("id") Integer id){
		apiService.delete(id);
		return "删除成功id:"+id;
	}
	
	//获取所有列表
	@RequestMapping("/findAll")
	public List<ApiName> findAll() {
		return apiService.findAll();
	}
	
	//按id查询  http://localhost:8081/api/find?id=1
	@RequestMapping(value = "/find/id-{id}")
	public Optional<ApiName> findon(@PathVariable Integer id) {
		return apiService.findOne(id);
	}
	
	//通过host查询
	@RequestMapping(value = "/find/ApiHost-{ApiHost}")
	public List<ApiName> findByApiHost(@PathVariable String ApiHost){
		return apiService.findByApiHost(ApiHost);
	}
	
	//组合查询
	@RequestMapping(value = "/find")
	public List<ApiName> findByApiNameAndApiHost(@RequestParam String ApiName,
												@RequestParam String ApiHost){
		return apiService.findByApiNameAndApiHost(ApiName, ApiHost);
	}


	
}
