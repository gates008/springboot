package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;

@SpringBootApplication
public class SpringbootApplication //implements EmbeddedServletContainerCustomizer 
{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
	
	/*public void customize(ConfigurableEmbeddedServletContainer container) {
        //指定项目名称
        container.setContextPath("/demo");
        //指定端口地址
        container.setPort(8090);  
    }  */

}

