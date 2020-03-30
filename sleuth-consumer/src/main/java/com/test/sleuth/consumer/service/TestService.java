package com.test.sleuth.consumer.service;

import java.util.List;

import com.test.sleuth.consumer.model.TestItem;

public interface TestService {
	
	List<TestItem> testFeign ();
	
}
