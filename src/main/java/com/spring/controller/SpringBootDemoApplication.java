/**
 * 
 */
package com.spring.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**Description: spring boot 启动入口 有三种启动方式
 * 
 * @author luwenhuang
 * @date 2017年9月14日 下午2:58:54
 */
@ComponentScan(basePackages={"com.spring"}) // 扫描该包路径下的所有spring组件
@EnableJpaRepositories("com.spring.dao") // JPA扫描该包路径下的Repositorie
@EntityScan("com.spring.model") // 扫描实体类
@SpringBootApplication
public class SpringBootDemoApplication {

	/**Description: 
	 * @param args
	 * void
	 * @author luwenhuang
	 * @date 2017年9月18日 下午5:31:49
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
