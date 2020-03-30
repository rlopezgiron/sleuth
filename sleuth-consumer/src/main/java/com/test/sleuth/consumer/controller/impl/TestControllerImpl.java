package com.test.sleuth.consumer.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.sleuth.consumer.controller.TestController;
import com.test.sleuth.consumer.model.TestItem;
import com.test.sleuth.consumer.service.TestService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/sleuth")
@Slf4j
public class TestControllerImpl implements TestController {
	
	@Autowired
	private TestService testService;
	
	@GetMapping("/feign")
	public List<TestItem>  testFeign () {
		log.info("get all items with feign starts");
		return testService.testFeign();
	}

}
