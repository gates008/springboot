package com.imooc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.mapper.Happiness;
import com.imooc.services.HappinessService;

/**
* @author 作者
* @version 创建时间：2019年1月3日 上午11:48:24
* 类说明
*/
@RestController
@RequestMapping("/demo")
public class HappinessController {
	 @Autowired
	    private HappinessService happinessService;

	    @RequestMapping("/query")
	    public Happiness testQuery(){
	        return happinessService.selectService("北京");
	    }

	    @RequestMapping("/insert")
	    public Happiness testInsert(){
	        happinessService.insertService();
	        return happinessService.selectService("西安");
	    }
}
