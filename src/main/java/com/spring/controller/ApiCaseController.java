/**
 * 
 */
package com.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.ApiCase;
import com.spring.model.ApiName;
import com.spring.service.ApiCaseService;

/**Description: 
 * 
 * @author luwenhuang
 * @date 2017年9月18日 下午3:35:58
 */
@RestController
@SpringBootApplication
@RequestMapping("/apicase")
public class ApiCaseController {

	@Autowired
	private ApiCaseService apiCaseService;

	//保存测试用例数据
	@RequestMapping(value = "/save")
	public ApiCase save(@RequestParam Integer id,
						@RequestParam Integer apiId,
						@RequestParam String requestDataType,
						@RequestParam String requestData,
						@RequestParam String encryption,
						@RequestParam String checkPoint,
						@RequestParam String correlation,
						@RequestParam Boolean active){
		ApiCase apiCase = new ApiCase();
		apiCase.setId(id);
		apiCase.setApiId(apiId);
		apiCase.setRequestDataType(requestDataType);
		apiCase.setRequestData(requestData);
		apiCase.setEncryption(encryption);
		apiCase.setCorrelation(correlation);
		apiCase.setActive(active);
		return apiCaseService.Save(apiCase);
	}
	
	//更新测试用例数据
	@PutMapping(value = "/update")
	public ApiCase update(@RequestParam Integer id,
						@RequestParam Integer apiId,
						@RequestParam String requestDataType,
						@RequestParam String requestData,
						@RequestParam String encryption,
						@RequestParam String checkPoint,
						@RequestParam String correlation,
						@RequestParam Boolean active){
		ApiCase apiCase = new ApiCase();
		apiCase.setId(id);
		apiCase.setApiId(apiId);
		apiCase.setRequestDataType(requestDataType);
		apiCase.setRequestData(requestData);
		apiCase.setEncryption(encryption);
		apiCase.setCorrelation(correlation);
		apiCase.setActive(active);
		return apiCaseService.update(apiCase);
	}
	
	//按id查询  http://localhost:8081/api/find?id=1
	@RequestMapping(value = "/find/id-{apiId}")
	public List<ApiCase> findon(@PathVariable Integer apiId) {
		return apiCaseService.findByApiId(apiId);
	}
}
