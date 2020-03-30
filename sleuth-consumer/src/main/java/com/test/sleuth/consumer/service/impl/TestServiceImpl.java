package com.test.sleuth.consumer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.sleuth.consumer.client.TestFeignClient;
import com.test.sleuth.consumer.model.TestItem;
import com.test.sleuth.consumer.service.TestService;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestFeignClient client;

	
	@Override
	public List<TestItem> testFeign() {
		log.info("test sleuth with feign client");
		return client.test();
	}

}
