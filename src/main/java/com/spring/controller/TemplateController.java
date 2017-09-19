/**
 * 
 */
package com.spring.controller;
import java.util.Map;  

import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
/**Description: 
 * 
 * @author luwenhuang
 * @date 2017年8月16日 下午1:49:44
 */
@Controller
@RequestMapping("/thymeleaf")
public class TemplateController { 
    /**  
	  
     * 返回html模板.  
  
     */  
	//http://localhost:8080/thymeleaf/greeting?name=luwenahuang
	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "world") String name, Model model) {
		model.addAttribute("xname", name);
		return "index";
	}
	
	//http://localhost:8080/thymeleaf/ajax?username=luwenahuang
	@ResponseBody
	@RequestMapping(value = "/ajax", method = RequestMethod.GET)
	public String ajax(@RequestParam("username") String username) {
		return username;
	}
}
