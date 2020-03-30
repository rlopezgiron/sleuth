package com.test.sleuth.consumer.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.sleuth.consumer.model.TestItem;

@FeignClient(name="test-sleuth-server")
public interface TestFeignClient {
	
	@RequestMapping(value = "/sleuth/", method = RequestMethod.GET)
    List<TestItem> test();
}
