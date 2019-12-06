package com.imooc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @author 作者
* @version 创建时间：2018年12月30日 下午5:34:16
* 类说明
*/
@RestController
public class HelloContoller {
	@RequestMapping("hello")
	public Object Hello() {
		return "hello Springboot~~~";
	}
}
