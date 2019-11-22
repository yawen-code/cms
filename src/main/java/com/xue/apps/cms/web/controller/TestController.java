package com.xue.apps.cms.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xue.apps.cms.bean.Test;
import com.xue.apps.cms.service.ITestService;

/**
 * 
 * @ClassName: TestController  
 * @Description: TODO测试类
 * @author yawen
 */
@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private ITestService testService;
	
	
	@GetMapping(value="findAll")
	public List<Test> findAll() {
//		
//		Map<String,String> map = new HashMap<>();
//		map.put("one", "hello");
//		map.put("two", "world");
//		List<Map<String,String>> list = new ArrayList<>();
//		list.add(map);
//		
		return testService.findAll();
	}
	
	
	@PostMapping(value="saveOrUpdate")
	public String saveUpdate(Test test) {
		//调用service，完成保存
		
		testService.saveOrUpdate(test);
		return "保存成功";
	}
	
}
