/**
 * 
 */
package com.spring.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**Description: 
 * 
 * @author luwenhuang
 * @date 2017年8月15日 下午2:32:01
 */
@Controller
@EnableAutoConfiguration  //用于自动配置。简单的说，它会根据你的pom配置（实际上应该是根据具体的依赖）来判断这是一个什么应用，并创建相应的环境。
@SpringBootApplication
public class SampleController {

    @RequestMapping("/test")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
    
    @GetMapping("/index")
    public String index(){
    	return "index";
    }
 


}
