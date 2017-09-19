/**
 * 
 */
package com.spring.controller;
import java.util.Date;
import java.util.HashMap;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.User;
/**Description: 
 * 
 * @author luwenhuang
 * @date 2017年8月15日 下午5:30:10
 */
@RestController
@SpringBootApplication
@RequestMapping(value = "/index")
public class IndexController {


	@RequestMapping
	public String index() {
		return "index";
	}

	 //@RequestParam //简单类型的绑定，可以出来get和post  http://localhost:8080/index/get?name=wujing    http://localhost:8080/index/get?name=无境
	@RequestMapping(value = "/get")
	public HashMap<String, Object> get(@RequestParam String name,
									   @RequestParam String age) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("title", "hello world");
		map.put("name", name);
		map.put("age", age);
		return map;
	}

	// @PathVariable 获得请求url中的动态参数  http://localhost:8080/index/get/1/wujing     
	@RequestMapping(value = "/get/{id}/{name}")
	public User getUser(@PathVariable int id, @PathVariable String name) {
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setDate(new Date());
		return user;
	}


}
